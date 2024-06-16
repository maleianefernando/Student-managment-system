package app.emmanuel.english.school.jparepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private static User loggedUser;

    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String nomeCompleto) throws UsernameNotFoundException {
        
        User user = userRepo.findByNomeCompleto(nomeCompleto);

        if(user == null){
            throw new UsernameNotFoundException("Username not found: " + nomeCompleto);
        }
        System.out.println(user.getEmail());
        System.out.println(user.getNivel());

        loggedUser = user;

        return new CustomUserDetails(user);
    }

    public static User getLoggedUser(){
        return loggedUser;
    }
}

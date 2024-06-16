package app.emmanuel.english.school.studentControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.emmanuel.english.school.jparepo.CustomUserDetailsService;
import app.emmanuel.english.school.jparepo.User;
import app.emmanuel.english.school.jparepo.UserRepository;


@Controller
@RequestMapping("/minha_conta")
public class AccountController {
    @Autowired
    UserRepository userRepo;

    @GetMapping("/meus_dados")
    public String studentAccount(Model model){
        model.addAttribute("user", getUser());
        return "dados_estudante";
    }

    @PostMapping("/alterar_palavra_passe")
    public String changePassword(@ModelAttribute User user){
        String [] password = user.getPassword().split(",");
        if(password[1].equals("")){

        }
        else if (password[1].length() < 6){

        }
        
        if(password[0].equals(password[1])){
            System.out.println("As palavras passes sao iguais");
        }
        else{
            System.out.println("as palavras passes sao diferentes");
        }

        return "redirect:/minha_conta/meus_dados";
    }

    private User getUser(){
        return CustomUserDetailsService.getLoggedUser();
    }
}

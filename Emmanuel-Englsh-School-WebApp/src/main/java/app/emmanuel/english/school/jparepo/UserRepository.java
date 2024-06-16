package app.emmanuel.english.school.jparepo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

    // @Query("SELECT u FROM User u WHERE u.nomeCompleto = ?1")
    User findByNomeCompleto(String nomeCompleto);

    User findByEmail(String email);
    
    User findByIdEstudante(String idEstudante);
    
}

package app.emmanuel.english.school.jparepo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "estudante")
@Data
public class User {
    
    @Id
    private String idEstudante;

    @Column(nullable = false)
    private String nomeCompleto;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Column(nullable = false)
    private String morada;

    @Column(nullable = false)
    private String nivel;
}

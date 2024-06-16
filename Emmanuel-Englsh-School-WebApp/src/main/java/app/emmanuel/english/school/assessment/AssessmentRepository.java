package app.emmanuel.english.school.assessment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AssessmentRepository extends JpaRepository <Assessment, String>{
    Assessment findByIdEstudante(String idEstudante);
}

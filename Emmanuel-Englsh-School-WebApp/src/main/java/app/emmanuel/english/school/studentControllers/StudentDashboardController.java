package app.emmanuel.english.school.studentControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.emmanuel.english.school.assessment.Assessment;
import app.emmanuel.english.school.assessment.AssessmentRepository;
import app.emmanuel.english.school.jparepo.CustomUserDetailsService;
import app.emmanuel.english.school.jparepo.User;

@Controller
@RequestMapping("/portal_do_estudante")
public class StudentDashboardController { 
    @Autowired
    private AssessmentRepository assessmentRepo;

    @GetMapping
    public String studentDashboard(){
        return "portal_estudante";
    }

    @GetMapping("/notas-frequencia")
    public String notasFrequencia(Model model){

        try{
            Assessment assessment = getAssessment();
            model.addAttribute("assessment", assessment);
            
        }catch(NullPointerException e){
            return "redirect:/";
        }    

        return "notas_frequencia";
    }

    @GetMapping("/proprinas")
    public String subsciption(){
        return "proprinas";
    }

    @GetMapping("/cronograma_de_actividades")
    public String activities(){
        return "cronograma";
    }


    private User getUser(){
        // Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        // Object user = (UserDetails) principal;
        
        // return (UserDetails) principal;

        return CustomUserDetailsService.getLoggedUser();
    }

    private Assessment getAssessment() throws NullPointerException {
        List <Assessment> assessments = assessmentRepo.findAll();
        Assessment assessment = new Assessment();
        User u = getUser();
        
        for(Assessment a : assessments){

            if(a.getIdEstudante().equals(u.getIdEstudante())){
                assessment = a;
                break;
            }
        }

        // System.out.println(u.getIdEstudante() + " " + assessment.getTesteEscrito1() + " " + assessment.getTesteEscrito2());

        return assessment;
    }
}

package app.emmanuel.english.school.studentControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/estudante")
public class StudentController {
    
    @GetMapping("/home")
    public String homePage(){
        return "home";
    }
}

package app.emmanuel.english.school;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("")
public class GeneralController {
    
    @GetMapping
    public String homePage(){
        return "redirect:/estudante/home";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login_data")
    public String processLogin() {
        return "";
    }
    
}

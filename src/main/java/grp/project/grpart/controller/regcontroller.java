package grp.project.grpart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import grp.project.grpart.domain.student;
import grp.project.grpart.stduentrepositry.studentrepositry;

@Controller
public class regcontroller {
    @Autowired 
    studentrepositry repo;
    @GetMapping("/signup")
    public String Displaysignup( ) {
        return "register.html";
    }
    @PostMapping("/signup")
    public String signup(@ModelAttribute student stud){
        repo.save(stud);
        return "redirect:/index.html";
    }
    @GetMapping("/signin")
    public String Displaysignin() {
        return "signin.html";
    }

    // Check signin details
    @PostMapping("/signin")
    public String signin(@ModelAttribute student stud) {

        student existingStudent =
                repo.findByStudentnameAndPassword(
                        stud.getStudentname(),
                        stud.getPassword()
                );

        if (existingStudent != null) {
            return "redirect:/index.html";
        }

        return "redirect:/signin.html";
    }

}


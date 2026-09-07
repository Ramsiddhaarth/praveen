package grp.project.grpart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class regcontroller {
    @GetMapping("/signup")
    public String Displaysignup() {
        return "register.html";
    }
}


package com.hei.notehei.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class GradeController {
    
    @GetMapping("/index")
    public String getHomePage(Model model){
        return "index" ;
    }
    
}
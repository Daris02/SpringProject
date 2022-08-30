package com.hei.notehei.Reception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePage {

    @GetMapping
    public String getHomePage(Model model){
        model.addAttribute("somthing", "Welcome home page of my Spring Project");
        return "index" ;
    }
}

package com.hei.notehei.Reception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class HomePage {

    @GetMapping
    public String getHome(Model model){
        return "index" ;
    }

    @GetMapping("/index")
    public String getHomePage(Model model){
        return "index" ;
    }

}

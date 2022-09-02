package com.hei.notehei.Reception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class HomePage {

    @GetMapping
    public String getHome(){
        return "index" ;
    }

    @GetMapping("/index")
    public String getHomePage(){
        return "index" ;
    }
}

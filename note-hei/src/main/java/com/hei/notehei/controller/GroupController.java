package com.hei.notehei.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GroupController {
    
    @GetMapping("/index")
    public String getHomePage(Model model){
        return "index" ;
    }
    
}

package com.hei.notehei.Reception;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hei.notehei.model.Subject;

@Controller
public class HomePage {

    @GetMapping
    public String getHomePage(Model model){
        model.addAttribute("somthing", "Welcome home page of my Spring Project");
        model.addAttribute("subject", Arrays.asList(
            new Subject((long) 1, "prog1"),
            new Subject((long) 2, "web1"),
            new Subject((long) 3, "donnee2")
        ));
        return "index" ;
    }
}

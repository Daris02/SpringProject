package com.hei.notehei.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubjectController {
    
    @GetMapping("/subject")
    public String getSubjectPage(Model model){
        return "subject" ;
    }

}

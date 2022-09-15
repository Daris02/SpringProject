package com.hei.notehei.Reception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hei.notehei.repository.GroupRepository;
import com.hei.notehei.repository.StudentRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class HomePage {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private GroupRepository groupRepository;

    @GetMapping
    public String getHome(Model model){
        model.addAttribute("numberStudent", studentRepository.count());
        model.addAttribute("numberGroup", groupRepository.count());
        return "index" ;
    }

    @GetMapping("/index")
    public String getHomePage(Model model){
        model.addAttribute("numberStudent", studentRepository.count());
        model.addAttribute("numberGroup", groupRepository.count());
        return "index" ;
    }
}

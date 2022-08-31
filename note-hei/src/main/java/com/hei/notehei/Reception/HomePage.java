package com.hei.notehei.Reception;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hei.notehei.model.Group;
import com.hei.notehei.repository.GroupRepository;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class HomePage {
    @Autowired
    GroupRepository groupRepository;

    @RequestMapping
    public String getHomePage(Model model){
        return "index" ;
    }

    @RequestMapping("/groupe")
    public String groupe(Model model){
        List<Group> listGroupe = groupRepository.findAll();
        model.addAttribute("listGroupe", listGroupe);
        return "groupe";
    }
}

package com.hei.notehei.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hei.notehei.model.Groups;
import com.hei.notehei.repository.GroupRepository;
import com.hei.notehei.repository.StudentRepository;

@Controller
public class GroupController {
    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/groupe")
    public String getGroupePage(Model model, 
            @RequestParam(name = "wordSearch",defaultValue ="") String wordSearch,
            @RequestParam(name = "page",defaultValue ="0") Integer p, 
            @RequestParam(name = "size",defaultValue ="5") Integer s){

        Page<Groups> pageGroupe = groupRepository.search("%"+wordSearch+"%",PageRequest.of(p, s));
        model.addAttribute("listGroupe", pageGroupe.getContent());

        Integer[] pages = new Integer[pageGroupe.getTotalPages()];
        model.addAttribute("pages", pages);
        model.addAttribute("pageCourant", p);
        model.addAttribute("wordSearch", wordSearch);
        
        return "groupe";
    }
    
    @GetMapping("/studentIG")
    public String studentInG(Model model,Long idGroup){
        Groups g = new Groups();
        g.setIdGroup(idGroup);
        model.addAttribute("studentIG", studentRepository.findByGroupes(g));
        return "studentIG";
    }
    
}

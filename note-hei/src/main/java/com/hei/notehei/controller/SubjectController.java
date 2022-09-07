package com.hei.notehei.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hei.notehei.model.Subject;
import com.hei.notehei.repository.SubjectRepository;

@Controller
public class SubjectController {
    @Autowired
    private SubjectRepository subjectRepository;
    
    @GetMapping("/subject")
    public String getSubjectPage(Model model,
        @RequestParam(name = "subjectSearch",defaultValue = "") String subjectSearch,
        @RequestParam(name = "page",defaultValue ="0") Integer p, 
        @RequestParam(name = "size",defaultValue ="5") Integer s){

        Page<Subject> pageSubject = subjectRepository.search("%"+subjectSearch+"%",PageRequest.of(p, s));
        model.addAttribute("listSubject", pageSubject.getContent());

        Integer[] pagesSubject = new Integer[pageSubject.getTotalPages()];
        model.addAttribute("pagesSubject", pagesSubject);
        model.addAttribute("pageCourantSubject", p);
        model.addAttribute("subjectSearch", subjectSearch);

        return "subject" ;
    }

}

package com.hei.notehei.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hei.notehei.model.Examen;
import com.hei.notehei.repository.ExamenRepository;

@Controller
public class ExamenController {
    @Autowired
    private ExamenRepository examenRepository;

    @GetMapping("/examen")
    public String getExamenPage(Model model,
        @RequestParam(name = "examenSearch",defaultValue="") String examenSearch,
        @RequestParam(name = "page",defaultValue="0") Integer p,
        @RequestParam(name = "size",defaultValue="5") Integer s){

        Page<Examen> pageExamen = examenRepository.search("%"+examenSearch+"%",PageRequest.of(p, s));
        model.addAttribute("listExamen", pageExamen.getContent());

        Integer[] pagesExamen = new Integer[pageExamen.getTotalPages()];
        model.addAttribute("pagesExamen", pagesExamen);
        model.addAttribute("pageCourantExamen", p);
        model.addAttribute("examenSearch", examenSearch);
        return "examen" ;
    }
}

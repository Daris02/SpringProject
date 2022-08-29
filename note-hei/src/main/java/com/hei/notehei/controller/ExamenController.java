package com.hei.notehei.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hei.notehei.model.Examen;
import com.hei.notehei.service.ExamenService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ExamenController {
    private ExamenService examenService;

    @GetMapping("/examens")
    public List<Examen> getAllExamen(){
        return examenService.getAllExamens();
    }

    @GetMapping("/examen/{id}")
    public Optional<Examen> getExamenById(@PathVariable Long idExamen){
        return examenService.getExamen(idExamen);
    }

    @PostMapping("/examen")
    public Examen addExamen(@RequestBody Examen examen){
        return examenService.addExamen(examen);
    }

    @DeleteMapping("/examen/{id}")
    public void deleteExamenById(@PathVariable Long idExamen){
        examenService.deleteExamen(idExamen);
    }

}

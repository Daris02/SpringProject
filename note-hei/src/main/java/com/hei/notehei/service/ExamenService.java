package com.hei.notehei.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hei.notehei.model.Examen;
import com.hei.notehei.repository.ExamenRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ExamenService {
    @Autowired
    private ExamenRepository examenRepository;
    
    public List<Examen> getAllExamens(){
        return examenRepository.findAll();
    }

    public Optional<Examen> getExamen(Long idExamen){
        return examenRepository.findById(idExamen);
    }

    public Examen addExamen(Examen examen){
        return examenRepository.save(examen);
    }

    public void deleteExamen(Long idExamen){
        examenRepository.deleteById(idExamen);
    }
}

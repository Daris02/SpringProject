package com.hei.notehei.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hei.notehei.model.Grade;
import com.hei.notehei.repository.GradeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class GradeService {
    @Autowired
    private GradeRepository gradeRepository;

    public List<Grade> getAllGrades(){
        return gradeRepository.findAll();
    }

    public Optional<Grade> getGrade(Long idGrade){
        return gradeRepository.findById(idGrade);
    }
}
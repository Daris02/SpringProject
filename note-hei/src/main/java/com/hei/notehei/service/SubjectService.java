package com.hei.notehei.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hei.notehei.model.Subject;
import com.hei.notehei.repository.SubjectRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public List<Subject> getAllSubjects(){
        return subjectRepository.findAll();
    }

    public Optional<Subject> getSubject(Long idSubject){
        return subjectRepository.findById(idSubject);
    }

    public Subject addSubject(Subject subject){
        return subjectRepository.save(subject);
    }

    public void deleteSubject(Long idSubject){
        subjectRepository.deleteById(idSubject);
    }
}

package com.hei.notehei.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hei.notehei.model.Subject;
import com.hei.notehei.service.SubjectService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class SubjectRestController {
    private SubjectService subjectService;

    @GetMapping("/subjects")
    public List<Subject> getAllSubjects(){
        return subjectService.getAllSubjects();
    }

    @GetMapping("/subject/{id}")
    public Optional<Subject> getSubjectById(@PathVariable Long idSubject){
        return subjectService.getSubject(idSubject);
    }

    @PostMapping("/subject")
    public Subject addSubject(@RequestBody Subject subject ){
        return subjectService.addSubject(subject);
    }

    @DeleteMapping("/subject/{id}")
    public void deleteSubjectById(@PathVariable Long idSubject){
        subjectService.deleteSubject(idSubject);
    }

    
}

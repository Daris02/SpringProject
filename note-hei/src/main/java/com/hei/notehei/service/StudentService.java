package com.hei.notehei.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hei.notehei.model.Student;
import com.hei.notehei.repository.StudentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudent(Long idStudent){
        return studentRepository.findById(idStudent);
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public void deletStudent(Long idStudent){
        studentRepository.deleteById(idStudent);
    }

}

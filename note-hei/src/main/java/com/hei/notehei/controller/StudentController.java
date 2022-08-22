package com.hei.notehei.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hei.notehei.model.Student;
import com.hei.notehei.service.StudentService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class StudentController {
    private StudentService studentService;
    
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/student/{idStudent}")
    public Optional<Student> getStudentById(@PathVariable Long idStudent){
        return studentService.getStudent(idStudent);
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @DeleteMapping("/student/{idStudent}")
    public void deletStudentById(@PathVariable Long idStudent){
        studentService.deletStudent(idStudent);
    }

}

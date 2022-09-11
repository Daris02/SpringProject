package com.hei.notehei.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

import com.hei.notehei.model.Examen;
import com.hei.notehei.model.Grade;
import com.hei.notehei.model.Student;
import com.hei.notehei.repository.GradeRepository;
import com.hei.notehei.repository.StudentRepository;

@Controller
public class GradeController {
    @Autowired
    private GradeRepository gradeRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private Examen examenRepository;

    @GetMapping("/gradeOS")
    public String studentInG(Model model,Long idStudent){
        Student student = studentRepository.getStudentById(idStudent);

        model.addAttribute("gradeOS", gradeRepository.gradeOfStudent(idStudent));
        model.addAttribute("student", student);

        return "rateOfStudent";
    }
    
    @PostMapping("/rateOS")
    public String gradeStudent(Model model,@Validated Grade grade,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "rateStudent";
        }
        gradeRepository.save(grade);
        return "redirect:/rateOS";
    }

    @GetMapping("/grade")
    public String grade(){
        return "grade";
    }

}
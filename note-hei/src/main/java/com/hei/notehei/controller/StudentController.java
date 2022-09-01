package com.hei.notehei.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hei.notehei.model.Student;
import com.hei.notehei.repository.StudentRepository;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    
    @GetMapping("/student")
    public String getStudentPage(Model model, 
            @RequestParam(name = "studentSearch",defaultValue ="") String studentSearch,
            @RequestParam(name = "page",defaultValue ="0") Integer p, 
            @RequestParam(name = "size",defaultValue ="5") Integer s){

        Page<Student> pageStudent = studentRepository.search("%"+studentSearch+"%",PageRequest.of(p, s));
        model.addAttribute("listStudent", pageStudent.getContent());

        Integer[] pageStudents = new Integer[pageStudent.getTotalPages()];
        model.addAttribute("pageStudents", pageStudents);
        model.addAttribute("pageCourantStudent", p);
        model.addAttribute("studentSearch", studentSearch);
        return "student";
    }

}

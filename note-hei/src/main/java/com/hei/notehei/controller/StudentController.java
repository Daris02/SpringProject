package com.hei.notehei.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hei.notehei.model.Student;
import com.hei.notehei.repository.GradeRepository;
import com.hei.notehei.repository.StudentRepository;

@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private GradeRepository gradeRepository;
    
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

    @GetMapping("/addStudent")
    public String addStudent(Model model){
        model.addAttribute("student", new Student());
        return "addStudent";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(Model model,@Validated Student student,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "addStudent";
        }
        studentRepository.save(student);
        return "redirect:/student";
    }

    @GetMapping("/deleteStudent")
    public String deleteStudent(Long idStudent){
        studentRepository.deleteById(idStudent);
        return "redirect:/student";
    }

    @GetMapping("/gradeOS")
    public String studentInG(Model model,Long idStudent){
        Student s = new Student();
        s.setIdStudent(idStudent);
        model.addAttribute("gradeOS", gradeRepository.findByStudent(s));
        return "rateOfStudent";
    }

}

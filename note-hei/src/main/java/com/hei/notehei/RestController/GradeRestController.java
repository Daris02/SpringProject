package com.hei.notehei.RestController;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hei.notehei.model.Grade;
import com.hei.notehei.service.GradeService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class GradeRestController {
    private GradeService gradeService;

    @GetMapping("/grades")
    public List<Grade> getAllGrades(){
        return gradeService.getAllGrades();
    }

    @GetMapping("/grade/{id}")
    public Optional<Grade> getGradeById(Long idGrade){
        return gradeService.getGrade(idGrade);
    }
}
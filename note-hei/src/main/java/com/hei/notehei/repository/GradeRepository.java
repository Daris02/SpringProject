package com.hei.notehei.repository;

import org.springframework.stereotype.Repository;

import com.hei.notehei.model.Grade;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long>{
    
    @Query("SELECT g "+
    " FROM grades g "+
    "    JOIN students s ON g.students = s.idStudent "+
    "    JOIN subjects b ON g.subject = b.idSubject "+
    "    JOIN examen e ON g.examen = e.idExamen "+
    "   WHERE s.idStudent = :x " )
    List<Grade> gradeOfStudent(@Param("x") Long x);

    @Query("SELECT round(avg(g.average)) "+
    " FROM grades g "+
    "    JOIN students s ON g.students = s.idStudent "+
    "    JOIN subjects b ON g.subject = b.idSubject "+
    "    JOIN examen e ON g.examen = e.idExamen "+
    "where s.idStudent = :x")
    Double gradeExam(@Param("x") Long x);

    List<Grade> findByStudents(Long x);
    
}
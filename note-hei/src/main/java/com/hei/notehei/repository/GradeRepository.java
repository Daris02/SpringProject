package com.hei.notehei.repository;

import org.springframework.stereotype.Repository;
import com.hei.notehei.model.Grade;
import com.hei.notehei.model.Student;
import com.hei.notehei.model.Examen;
import com.hei.notehei.model.Subject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long>{
    /*
    @Query("SELECT g "+
    " FROM grades g "+
    "           JOIN students s ON g.student = s.id_student        "+
    "           JOIN subjects b ON g.subject = b.id_subject "+
    "           JOIN examen e ON g.examen = e.id_examen "+
    "   WHERE s.id_student = :x  "+
    "   AND upper(b.name) LIKE upper(:s) "+
    "   AND upper(e.title) LIKE upper(:e) " )
    List<Grade> gradeOfStudent(@Param("x") Student x,
                              @Param("e") Examen e,
                              @Param("s") Subject s); 
    */

    List<Grade> findByStudent(Student s);
}
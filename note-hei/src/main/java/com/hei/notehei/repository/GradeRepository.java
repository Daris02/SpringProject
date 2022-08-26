package com.hei.notehei.repository;

import org.springframework.stereotype.Repository;
import com.hei.notehei.model.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long>{
    //
}
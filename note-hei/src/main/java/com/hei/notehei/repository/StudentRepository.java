package com.hei.notehei.repository;

import org.springframework.stereotype.Repository;
import com.hei.notehei.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    //
}

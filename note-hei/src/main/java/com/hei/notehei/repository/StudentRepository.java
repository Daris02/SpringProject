package com.hei.notehei.repository;

import org.springframework.stereotype.Repository;

import com.hei.notehei.model.Groups;
import com.hei.notehei.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
    @Query("select s from students s "+
    "where upper(s.firstName) like upper(:x) or upper(s.lastName) like upper(:x) "+
    "order by firstName ")
    Page<Student> search(@Param("x") String s, Pageable pageable);

    List<Student> findByGroupes(Groups g);

}

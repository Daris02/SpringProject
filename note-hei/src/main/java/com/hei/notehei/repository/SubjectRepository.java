package com.hei.notehei.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hei.notehei.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{
    
    @Query("select sb from subjects sb where upper(sb.name) like upper(:x) ")
    Page<Subject> search(@Param("x") String sb, Pageable pageable);

}

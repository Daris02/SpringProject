package com.hei.notehei.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hei.notehei.model.Examen;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long>{
    
    @Query("select e from examen e where upper(e.title) like upper(:x) ")
    Page<Examen> search(@Param("x") String e, Pageable pageable);

}
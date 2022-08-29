package com.hei.notehei.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hei.notehei.model.Examen;

@Repository
public interface ExamenRepository extends JpaRepository<Examen, Long>{
    //
}
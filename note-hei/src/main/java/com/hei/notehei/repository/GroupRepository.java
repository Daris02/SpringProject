package com.hei.notehei.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hei.notehei.model.Groups;

public interface GroupRepository extends JpaRepository<Groups, Long>{

    @Query("select g from groupes g where upper(g.name) like upper(:x) ")
    Page<Groups> search(@Param("x") String g, Pageable pageable);

}

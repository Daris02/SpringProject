package com.hei.notehei.repository;

import org.springframework.stereotype.Repository;
import com.hei.notehei.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long>{
    //
}
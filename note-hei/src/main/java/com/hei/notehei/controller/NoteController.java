package com.hei.notehei.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hei.notehei.model.Note;
import com.hei.notehei.service.NoteService;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class NoteController {
    private NoteService noteService;

    @GetMapping("/notes")
    public List<Note> getAllNotes(){
        return noteService.getAllNotes();
    }

    @GetMapping("/note/{id}")
    public Optional<Note> getNoteById(Long idNote){
        return noteService.getNote(idNote);
    }
}
package com.hei.notehei ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hei.notehei.model.Subject;
import com.hei.notehei.repository.SubjectRepository;


@SpringBootApplication
public class NoteHeiApplication implements CommandLineRunner{
	@Autowired
	private SubjectRepository subjectRepository;
	public static void main(String[] args) {
		SpringApplication.run(NoteHeiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		subjectRepository.save( new Subject((long) 1, "PROG1"));
		
	}



}

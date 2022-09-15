package com.hei.notehei ;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hei.notehei.model.Subject;
import com.hei.notehei.model.Examen;
import com.hei.notehei.model.Grade;
import com.hei.notehei.model.Groups;
import com.hei.notehei.model.Student;
import com.hei.notehei.repository.SubjectRepository;
import com.hei.notehei.repository.ExamenRepository;
import com.hei.notehei.repository.GroupRepository;
import com.hei.notehei.repository.StudentRepository;
import com.hei.notehei.repository.GradeRepository;

@SpringBootApplication
public class NoteHeiApplication implements CommandLineRunner {

	@Autowired
	private SubjectRepository subjectRepository;

	@Autowired
	private ExamenRepository examenRepository;

	@Autowired
	private GroupRepository groupRepository;
	
	@Autowired
	private GradeRepository gradeRepository;

	@Autowired
	private StudentRepository studentRepository;

	static List<Grade> grade;
	static List<Student> student;

	
	public static void main(String[] args) {
		SpringApplication.run(NoteHeiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Groups groupe1 = new Groups((long) 1, "G1", "groupe 1", student);
		Groups groupe2 = new Groups((long) 2, "G2", "groupe 2", student);
		Groups groupe3 = new Groups((long) 3, "G3", "groupe 3", student);
		groupRepository.save(groupe1);
		groupRepository.save(groupe2);
		groupRepository.save(groupe3);

		subjectRepository.save(new Subject((long) 1, "PROG1", grade));
		subjectRepository.save(new Subject((long) 2, "PROG2", grade));
		subjectRepository.save(new Subject((long) 3, "WEB1", grade));
		subjectRepository.save(new Subject((long) 4, "THEORI1", grade));
		subjectRepository.save(new Subject((long) 5, "DONNEE2", grade));
		subjectRepository.save(new Subject((long) 6, "EL1", grade));

		examenRepository.save(new Examen((long) 1, "Final Preview",
							  new Date(2022-10-15), grade));
		examenRepository.save(new Examen((long) 2, "Test",
							  new Date(2022-11-10), grade));


    studentRepository.save(new Student((long) 1, "Chirstophe", "Jordan", "chrisjordan@gmail.com", 'M', groupe1, grade));
    studentRepository.save(new Student((long) 2, "Marie", "Elizabathe", "marieliz@gmail.com", 'F', groupe1, grade));
    studentRepository.save(new Student((long) 3, "Sing", "Petter", "pettersing@gmail.com", 'M', groupe1, grade));
    studentRepository.save(new Student((long) 4, "Evan", "Clark", "clarkevan@gmail.com", 'M', groupe2, grade));
    studentRepository.save(new Student((long) 5, "Walker", "Bill", "billwalker@gmail.com", 'M', groupe2, grade));
    studentRepository.save(new Student((long) 6, "Grande", "Max", "maxgrande@gmail.com", 'F', groupe2, grade));
    studentRepository.save(new Student((long) 7, "Raven", "Eva", "evaraven@gmail.com", 'F', groupe3, grade));
    studentRepository.save(new Student((long) 8, "Patterson", "Carle", "carlepatterson@gmail.com", 'M', groupe3, grade));
    studentRepository.save(new Student((long) 9, "Dominique", "Gary", "garydom@gmail.com", 'M', groupe3, grade));

	}

}

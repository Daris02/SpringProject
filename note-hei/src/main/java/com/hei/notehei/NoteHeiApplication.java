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
	public static void main(String[] args) {
		SpringApplication.run(NoteHeiApplication.class, args);
	}

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

	@Override
	public void run(String... args) throws Exception {

		Groups groupe1 = new Groups((long) 1, "G1", "groupe 1", student);
		Groups groupe2 = new Groups((long) 2, "G2", "groupe 2", student);
		Groups groupe3 = new Groups((long) 3, "G3", "groupe 3", student);
		groupRepository.save(groupe1);
		groupRepository.save(groupe2);
		groupRepository.save(groupe3);

		Subject sub1 = new Subject((long) 1, "PROG1", grade);
		Subject sub2 = new Subject((long) 2, "PROG2", grade);
		Subject sub3 = new Subject((long) 3, "WEB1", grade);
		Subject sub4 = new Subject((long) 4, "THEORI1", grade);
		Subject sub5 = new Subject((long) 5, "DONNEE2", grade);
		Subject sub6 = new Subject((long) 6, "EL1", grade);

		subjectRepository.save(sub1);
		subjectRepository.save(sub2);
		subjectRepository.save(sub3);
		subjectRepository.save(sub4);
		subjectRepository.save(sub5);
		subjectRepository.save(sub6);

		Examen ex1 = new Examen((long) 1, "Final Preview",new Date(2022-10-15), grade);
		Examen ex2 = new Examen((long) 2, "Test", new Date(2022-11-11), grade);

		examenRepository.save(ex1);
		examenRepository.save(ex2);
		
		Student s1 = new Student((long) 1, "Chirstophe", "Jordan", "chrisjordan@gmail.com", 'M', groupe1, grade);
		Student s2 = new Student((long) 2, "Marie", "Elizabathe", "marieliz@gmail.com", 'F', groupe1, grade);
		Student s3 = new Student((long) 3, "Sing", "Petter", "pettersing@gmail.com", 'M', groupe1, grade);
		Student s4 = new Student((long) 4, "Evan", "Clark", "clarkevan@gmail.com", 'M', groupe2, grade);
		Student s5 = new Student((long) 5, "Walker", "Bill", "billwalker@gmail.com", 'M', groupe2, grade);
		Student s6 = new Student((long) 6, "Grande", "Max", "maxgrande@gmail.com", 'F', groupe2, grade);
		Student s7 = new Student((long) 7, "Raven", "Eva", "evaraven@gmail.com", 'F', groupe3, grade);
		Student s8 = new Student((long) 8, "Patterson", "Carle", "carlepatterson@gmail.com", 'M', groupe3, grade);
		Student s9 = new Student((long) 9, "Dominique", "Gary", "garydom@gmail.com", 'M', groupe3, grade);

		studentRepository.save(s1);
		studentRepository.save(s2);
		studentRepository.save(s3);
		studentRepository.save(s4);
		studentRepository.save(s5);
		studentRepository.save(s6);
		studentRepository.save(s7);
		studentRepository.save(s8);
		studentRepository.save(s9);

		gradeRepository.save(new Grade((long) 1, 12.0, s1, sub1, ex1));
		gradeRepository.save(new Grade((long) 2, 18.0, s1, sub2, ex1));
		gradeRepository.save(new Grade((long) 3, 7.5, s1, sub3, ex1));
		gradeRepository.save(new Grade((long) 4, 17.5, s1, sub4, ex1));
		gradeRepository.save(new Grade((long) 5, 10.0, s1, sub5, ex1));
		gradeRepository.save(new Grade((long) 6, 8.5, s1, sub6, ex1));

		gradeRepository.save(new Grade((long) 7, 15.0, s2, sub1, ex1));
		gradeRepository.save(new Grade((long) 8, 13.0, s2, sub2, ex1));
		gradeRepository.save(new Grade((long) 9, 12.5, s2, sub3, ex1));
		gradeRepository.save(new Grade((long) 10, 16.0, s2, sub4, ex1));
		gradeRepository.save(new Grade((long) 11, 12.0, s2, sub5, ex1));
		gradeRepository.save(new Grade((long) 12, 18.5, s2, sub6, ex1));

		gradeRepository.save(new Grade((long) 13, 9.5, s3, sub1, ex1));
		gradeRepository.save(new Grade((long) 14, 11.5, s3, sub2, ex1));
		gradeRepository.save(new Grade((long) 15, 15.0, s3, sub3, ex1));
		gradeRepository.save(new Grade((long) 16, 13.0, s3, sub4, ex1));
		gradeRepository.save(new Grade((long) 17, 11.25, s3, sub5, ex1));
		gradeRepository.save(new Grade((long) 18, 9.25, s3, sub6, ex1));

		gradeRepository.save(new Grade((long) 19, 16.0, s4, sub1, ex1));
		gradeRepository.save(new Grade((long) 20, 10.25, s4, sub2, ex1));
		gradeRepository.save(new Grade((long) 21, 9.0, s4, sub3, ex1));
		gradeRepository.save(new Grade((long) 22, 17.5, s4, sub4, ex1));
		gradeRepository.save(new Grade((long) 23, 10.0, s4, sub5, ex1));
		gradeRepository.save(new Grade((long) 24, 8.5, s4, sub6, ex1));

		gradeRepository.save(new Grade((long) 25, 12.5, s5, sub1, ex1));
		gradeRepository.save(new Grade((long) 26, 14.0, s5, sub2, ex1));
		gradeRepository.save(new Grade((long) 27, 18.0, s5, sub3, ex1));
		gradeRepository.save(new Grade((long) 26, 10.5, s5, sub4, ex1));
		gradeRepository.save(new Grade((long) 27, 10.0, s5, sub5, ex1));
		gradeRepository.save(new Grade((long) 28, 14.5, s5, sub6, ex1));

		gradeRepository.save(new Grade((long) 29, 8.0, s6, sub1, ex1));
		gradeRepository.save(new Grade((long) 30, 5.0, s6, sub2, ex1));
		gradeRepository.save(new Grade((long) 31, 10.0, s6, sub3, ex1));
		gradeRepository.save(new Grade((long) 32, 12.25, s6, sub4, ex1));
		gradeRepository.save(new Grade((long) 33, 10.5, s6, sub5, ex1));
		gradeRepository.save(new Grade((long) 34, 14.5, s6, sub6, ex1));
		
		gradeRepository.save(new Grade((long) 35, 13.25, s7, sub1, ex1));
		gradeRepository.save(new Grade((long) 36, 15.0, s7, sub2, ex1));
		gradeRepository.save(new Grade((long) 37, 8.0, s7, sub3, ex1));
		gradeRepository.save(new Grade((long) 38, 10.5, s7, sub4, ex1));
		gradeRepository.save(new Grade((long) 39, 12.0, s7, sub5, ex1));
		gradeRepository.save(new Grade((long) 40, 13.5, s7, sub6, ex1));
		
		gradeRepository.save(new Grade((long) 41, 18.0, s8, sub1, ex1));
		gradeRepository.save(new Grade((long) 42, 15.0, s8, sub2, ex1));
		gradeRepository.save(new Grade((long) 43, 12.5, s8, sub3, ex1));
		gradeRepository.save(new Grade((long) 44, 11.25, s8, sub4, ex1));
		gradeRepository.save(new Grade((long) 45, 13.5, s8, sub5, ex1));
		gradeRepository.save(new Grade((long) 46, 14.5, s8, sub6, ex1));
		
		gradeRepository.save(new Grade((long) 47, 5.0, s9, sub1, ex1));
		gradeRepository.save(new Grade((long) 48, 10.5, s9, sub2, ex1));
		gradeRepository.save(new Grade((long) 49, 11.0, s9, sub3, ex1));
		gradeRepository.save(new Grade((long) 50, 12.5, s9, sub4, ex1));
		gradeRepository.save(new Grade((long) 51, 15.0, s9, sub5, ex1));
		gradeRepository.save(new Grade((long) 52, 14.5, s9, sub6, ex1));

	}

}

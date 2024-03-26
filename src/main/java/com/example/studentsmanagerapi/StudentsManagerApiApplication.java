package com.example.studentsmanagerapi;

import com.example.studentsmanagerapi.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class StudentsManagerApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(StudentsManagerApiApplication.class, args);
	}

	@GetMapping("/hello")
	public String greet() {
		return "Hello";
	}

//	@GetMapping("/api/v1/students")
//	public Iterable<Student> getStudents() {
//		return List.of(new Student("Peter", "peter@example.com", "Avengers123"));
//	}
}

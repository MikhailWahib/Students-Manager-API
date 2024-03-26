package com.example.studentsmanagerapi.controller;

import com.example.studentsmanagerapi.model.Student;
import com.example.studentsmanagerapi.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping(value = "/", consumes = {"application/json"})
    public void registerNewStudent(@RequestBody Student student) {
        System.out.println(student);
        studentService.addNewStudent(student);
        System.out.println("User Created!");
    }

    @GetMapping(path = "{studentId}")
    public Student getStudentById(Long studentId) {
        return studentService.getStudentById(studentId);
    }

    @PostMapping(path = "{studentId}")
    public void updateStudent(Long studentId, Student student) {
        studentService.updateStudent(student);
    }

    @GetMapping(path = "{studentId}/delete")
    public void deleteStudent(Long studentId) {
        studentService.deleteStudent(studentId);
    }
}

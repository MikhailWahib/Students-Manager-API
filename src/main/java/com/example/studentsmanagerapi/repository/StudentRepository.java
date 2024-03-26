package com.example.studentsmanagerapi.repository;

import com.example.studentsmanagerapi.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> { }

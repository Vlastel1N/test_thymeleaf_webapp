package com.example.test_thymeleaf_webapp.dao;

import com.example.test_thymeleaf_webapp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

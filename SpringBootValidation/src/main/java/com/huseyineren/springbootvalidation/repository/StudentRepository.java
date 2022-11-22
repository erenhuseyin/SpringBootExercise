package com.huseyineren.springbootvalidation.repository;

import com.huseyineren.springbootvalidation.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}

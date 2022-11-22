package com.huseyineren.springbootvalidation.service;

import com.huseyineren.springbootvalidation.model.Student;
import com.huseyineren.springbootvalidation.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void save(Student student){
        studentRepository.save(student);
    }
}

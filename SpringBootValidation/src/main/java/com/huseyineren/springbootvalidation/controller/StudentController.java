package com.huseyineren.springbootvalidation.controller;

import com.huseyineren.springbootvalidation.model.Student;
import com.huseyineren.springbootvalidation.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    ResponseEntity<String> addStudent(@Valid @RequestBody Student student){
        studentService.save(student);
        return ResponseEntity.ok("Student saved.");
    }
}

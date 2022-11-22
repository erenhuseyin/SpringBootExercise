package com.huseyineren.springbootvalidation.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    @Size(min = 2, message = "Must be not null")
    private String nameSurname;

    @Max(value = 9999)
    @Positive
    private int studentNumber;

    @NotBlank(message = "must be not blank")
    private String schoolName;

    @Email(message = "email should be valid")
    private String email;

    @Min(value = 18, message = "cannot younger than 18 years old.")
    private int age;

    @Pattern(regexp = "[0-9\\s]{12}")
    private String phone;

}

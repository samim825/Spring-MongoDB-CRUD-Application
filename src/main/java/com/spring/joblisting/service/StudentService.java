package com.spring.joblisting.service;

import com.spring.joblisting.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student create(Student student);

    Student update(Student student);

    Optional<Student> findById(String id);

    List<Student> findAllStudents();

    void deleteStudentById(String id);

}

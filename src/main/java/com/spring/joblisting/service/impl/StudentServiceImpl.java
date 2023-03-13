package com.spring.joblisting.service.impl;

import com.spring.joblisting.model.Student;
import com.spring.joblisting.repository.StudentRepository;
import com.spring.joblisting.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;


    @Override
    public Student create(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> findById(String id) {
        return Optional.ofNullable(studentRepository.findById(id).get());
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudentById(String id) {

        studentRepository.deleteById(id);
    }
}

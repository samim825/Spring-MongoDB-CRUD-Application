package com.spring.joblisting.controller;

import com.spring.joblisting.model.Student;
import com.spring.joblisting.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping
    public Student create(@RequestBody Student student){

        return studentService.create(student);
    }

    @PutMapping
    public Student update(@RequestBody Student student){
        return studentService.update(student);
    }

    @GetMapping("/{id}")
    public Optional<Student> findStudentById(@PathVariable String id){

        return studentService.findById(id);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents(){

        return studentService.findAllStudents();
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable String id){

        studentService.deleteStudentById(id);
    }
}

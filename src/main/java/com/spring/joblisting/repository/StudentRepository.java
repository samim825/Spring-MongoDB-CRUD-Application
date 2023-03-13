package com.spring.joblisting.repository;

import com.spring.joblisting.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}

package com.spring.joblisting.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Pattern;


@Document(collection = "students")
public class Student {

    @Id
    private String studentId;

    @JsonProperty
    @Pattern(regexp = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$", message = "Enter a valid name")
    private String name;

    private String roll;

    private String dept;

    private Address address;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public Student(String name, String roll) {
        this.name = name;
        this.roll = roll;
    }

    public Student() {
    }


    public Student(String studentId, String name, String roll, String dept, Address address) {
        this.studentId = studentId;
        this.name = name;
        this.roll = roll;
        this.dept = dept;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                ", dept='" + dept + '\'' +
                ", address=" + address +
                '}';
    }
}

# Spring-MongoDB-CRUD-Application
A CRUD Application for beginner using Spring boot framework and MongoDB database as NoSQL

# Prerequisite
 
* Java 8
* MongoDB
* Git

# How to Run

git clone https://github.com/samim825/Spring-MongoDB-CRUD-Application.git

Then Open The project and change application.properties file with the database uri and database name.

# Here I implement five APIs. You can test these are following given url

* To create a new Student  

POST : localhost:8080/api/student

Paylaod : 
    
     {
            "name": "Faruk",
            "roll": "IT-17035",
            "dept": "ICT",
            "address": {
                "thana": "savar",
                "zilla": "Dhaka"
            }
     }
    
  * To Update a existing student with the id  
    
   PUT : localhost:8080/api/student
   
   Paylaod: 
   ```
        {
              "studentId": "640f1394438ddd07392705c2",
              "name": "Faruk Hossain",
              "roll": "IT-17035",
              "dept": "ICT",
              "address": {
                  "thana": "savar",
                  "zilla": "Dhaka"
              }
         }
   ```    
       
   * To retrieve a student with the id    
       
    GET : localhost:8080/api/student/640f1394438ddd07392705c2
    
    Here 640f1394438ddd07392705c2  is the student id.
    
   * To Delete a student with the id 
    
    DELETE : localhost:8080/api/student/640f1394438ddd07392705c2
    
    Here 640f1394438ddd07392705c2  is the student id    
    
   * To retrieve all students list 
    
    GET : localhost:8080/api/student/all
        
        
 

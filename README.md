# Spring-MongoDB-CRUD-Application
A CRUD Application for beginner using Spring boot framework and MongoDB database as NoSQL

# Prerequisite
 
* Java 8
* MongoDB
* Git
* Docker

# How to Run

git clone https://github.com/samim825/Spring-MongoDB-CRUD-Application.git

Inside the project run the docker 

```docker compose up```

It will download the image of  MongoDB database and MongoDB express for User Interface.
You can open the User Interface with the url:
```localhost:8082``` 
After opening the User Interface create a database named "joblisting".
And create a collection named "students" under the "joblisting" database.
You MongoDB database is ready. Now you can test the project.


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
        
        
 

package com.nikhilzzz.JPA_Project01.Controller;


import com.nikhilzzz.JPA_Project01.Entity.Student;
import com.nikhilzzz.JPA_Project01.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/saveStudent")
    public Student createStudent(@RequestBody Student student){
        System.out.println("Student saved successfully !");
        return studentService.saveStudent(student);
    }

}

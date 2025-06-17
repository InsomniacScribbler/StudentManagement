package com.nikhilzzz.JPA_Project01.Controller;


import com.nikhilzzz.JPA_Project01.Entity.Student;
import com.nikhilzzz.JPA_Project01.Repository.StudentRepo;
import com.nikhilzzz.JPA_Project01.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @PostMapping("/saveMultipleStudents")
    public List<Student> createStudents(@RequestBody List<Student> studentList) {
        System.out.println("Students saved successfully !");
        return studentService.saveAllStudents(studentList);
    }

    @GetMapping("/allStudents")
    public List<Student> getAllStudentsData(Student student){
        System.out.println("The Enrolled Students are:\n");
        return studentService.getAllStudents();
    }

    @GetMapping("/studentById/{id}")
    public Optional<Student> getStudentById(@PathVariable Integer id){
        return studentService.studentById(id);
    }

}

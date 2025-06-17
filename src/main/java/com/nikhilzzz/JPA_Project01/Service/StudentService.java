package com.nikhilzzz.JPA_Project01.Service;

import com.nikhilzzz.JPA_Project01.Entity.Student;
import com.nikhilzzz.JPA_Project01.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo; // iski implementation Runtime p JPA bna dega

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }
    public List<Student> getAllStudents(){
        List<Student> studentList = studentRepo.findAll();
        return studentList;
    }
    public Student studentById( Integer id){
        return  studentRepo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatusCode.valueOf(404))); // if return type was student the we use .orElseThrow(() -> new RuntimeException)
    }

}

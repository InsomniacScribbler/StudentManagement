package com.nikhilzzz.JPA_Project01.Service;

import com.nikhilzzz.JPA_Project01.Entity.Student;
import com.nikhilzzz.JPA_Project01.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo; // iski implementation Runtime p JPA bna dega

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }

}

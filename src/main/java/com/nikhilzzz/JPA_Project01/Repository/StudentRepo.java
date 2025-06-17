package com.nikhilzzz.JPA_Project01.Repository;

import com.nikhilzzz.JPA_Project01.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}

package com.practice.Studentmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.Studentmicroservice.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}

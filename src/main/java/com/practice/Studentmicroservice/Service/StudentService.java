package com.practice.Studentmicroservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.practice.Studentmicroservice.Student;
import com.practice.Studentmicroservice.feing.StudentInterface;
import com.practice.Studentmicroservice.leaves.Leave;
import com.practice.Studentmicroservice.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentInterface inf;
	@Autowired
	StudentRepository repo;
	
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	public String applyleaves(Student appyling, String l) {
		repo.save(appyling);
		System.out.println("going");
		String ans= inf.getByID(l);
		System.out.println(ans+"inservice");
		return ans;
	}

}

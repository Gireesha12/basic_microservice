package com.practice.Studentmicroservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Studentmicroservice.Student;
import com.practice.Studentmicroservice.Service.StudentService;
import com.practice.Studentmicroservice.leaves.Leave;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService serv;
	
	@Autowired
	Environment env;
	
	@GetMapping
	ResponseEntity<List<Student>>getAllStudents(){
		System.out.println(env.getProperty("local.server.port"));
		return new ResponseEntity<List<Student>>(serv.getAllStudents(),HttpStatus.FOUND);
	}
	@PostMapping("/appying/{cause}")
	ResponseEntity<String>ApplyLeaves(@RequestBody Student appyling,@PathVariable String cause){
		System.out.println("entered");
		String message=serv.applyleaves(appyling,cause);
		return new ResponseEntity<String>(message,HttpStatus.CREATED);
	}
	
}

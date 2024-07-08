package com.practice.practicemicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.practicemicroservice.leaves.Leaves;
import com.practice.practicemicroservice.service.LeavesService;

@RestController
@RequestMapping("/leaves")
public class LeavesController {
	
	@Autowired
	LeavesService leavService;
	
	@GetMapping("/")
	ResponseEntity<List<Leaves>>getAllTypesLeaves(){
		List<Leaves> types=leavService.getAllTypesLeaves();
		return new ResponseEntity<List<Leaves>>(types, HttpStatus.FOUND);
	}
	@PostMapping("/leave")
	ResponseEntity<Leaves>createTypesOfLeaves(@RequestBody Leaves lev){
		Leaves types=leavService.getTypesOfLeaves(lev);
		return new ResponseEntity<Leaves>(types, HttpStatus.CREATED);
	}

	@GetMapping("{cause}")
	String getByID(@PathVariable String cause){
		System.out.println("reached");
		String types=leavService.getById(cause);
		System.out.println(types);
		return types;
	}
}

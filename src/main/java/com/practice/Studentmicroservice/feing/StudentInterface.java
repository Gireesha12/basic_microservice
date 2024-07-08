package com.practice.Studentmicroservice.feing;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.Studentmicroservice.leaves.Leave;

@FeignClient("LEAVEMICROSERVICE")
public interface StudentInterface {
	@GetMapping("/leaves/{cause}")
	String getByID(@PathVariable String cause);
	
}

package com.practice.practicemicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Optional;
import com.practice.practicemicroservice.leaves.Leaves;
import com.practice.practicemicroservice.repository.LeaveRepository;

@Service
public class LeavesService {
	@Autowired
	LeaveRepository leavRepo;

	public List<Leaves> getAllTypesLeaves() {
		// TODO Auto-generated method stub
		return leavRepo.findAll();
	}

	public Leaves getTypesOfLeaves(Leaves lev) {
		// TODO Auto-generated method stub
		return leavRepo.save(lev	);
	}

	public String getById(String cause){
		Optional<Leaves> thing= leavRepo.findByCause(cause);
		if (thing.isPresent()) {
            Leaves leaves = thing.get();
            return leaves.getApproving_Leaves(); 
        } else {
            return "sorry";
        }
	}

	

	
}

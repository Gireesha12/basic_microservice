package com.practice.practicemicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.google.common.base.Optional;
import com.practice.practicemicroservice.leaves.Leaves;
import java.util.List;


@Repository
public interface LeaveRepository extends JpaRepository<Leaves,Integer> {
	
	 Optional<Leaves> findByCause(String cause);
}

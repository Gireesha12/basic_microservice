package com.practice.practicemicroservice.leaves;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Leave {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int leaveId;
	int noofdays;
	String cause;
}

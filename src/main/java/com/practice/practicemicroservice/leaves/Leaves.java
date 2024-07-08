package com.practice.practicemicroservice.leaves;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Leaves {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	int leaveId;
	String cause;
	String approving_Leaves;
}

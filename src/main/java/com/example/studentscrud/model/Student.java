package com.example.studentscrud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String email;
	private int age;
}

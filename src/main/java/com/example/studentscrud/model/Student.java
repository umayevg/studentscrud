package com.example.studentscrud.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
	private String firstName;
	private String lastName;
	private String birthDate;
	private String email;
	private int age;
}

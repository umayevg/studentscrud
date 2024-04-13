package com.example.studentscrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentscrud.model.Student;

@Service
public class StudentService {
	public List<Student> findAll() {
		return List.of(
				Student.builder().firstName("Gecho").email("gecho@test.dev").age(36).build(),
				Student.builder().firstName("John").email("john@test.dev").age(21).build(),
				Student.builder().firstName("Jane").email("jane@test.dev").age(47).build());
	}
}

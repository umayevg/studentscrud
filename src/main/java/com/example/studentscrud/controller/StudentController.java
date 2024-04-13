package com.example.studentscrud.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.studentscrud.model.Student;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

	@GetMapping
	public List<Student> findAll() {
		return List.of(
				Student.builder().firstName("Gecho").email("gecho@test.dev").age(36).build(),
				Student.builder().firstName("John").email("john@test.dev").age(21).build(),
				Student.builder().firstName("Jane").email("jane@test.dev").age(47).build());
	}
}

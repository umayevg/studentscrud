package com.example.studentscrud.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.studentscrud.model.Student;
import com.example.studentscrud.service.StudentService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
	private StudentService service;

	@GetMapping
	public List<Student> findAll() {
		// todo
		return service.findAll();
	}
}

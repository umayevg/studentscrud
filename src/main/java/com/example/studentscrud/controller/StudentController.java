package com.example.studentscrud.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.studentscrud.model.Student;
import com.example.studentscrud.service.StudentService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

	private final StudentService service;

	@GetMapping
	public List<Student> findAll() {
		// todo
		return service.findAll();
	}

	@PostMapping("save_student")
	public Student saveStudent(@RequestBody Student student) {
		return service.saveStudent(student);
	}

	@GetMapping("/{email}")
	public Student findByEmail(@PathVariable String email) {
		return service.findByEmail(email);
	}

	@PutMapping("update_student")
	public Student updateStudent(Student student) {
		return service.updateStudent(student);
	}

	@DeleteMapping("delete_student/{email}")
	public void deleteStudent(@PathVariable String email) {
		service.deleteStudent(email);
	}
}

package com.example.studentscrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentscrud.model.Student;

@Service
public interface StudentService {
	List<Student> findAll();

	Student saveStudent(Student student);

	Student findByEmail(String email);

	Student updateStudent(Student student);

	void deleteStudent(String email);

}

package com.example.studentscrud.service.impl;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.studentscrud.model.Student;
import com.example.studentscrud.repository.StudentRepository;
import com.example.studentscrud.service.StudentService;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {

	private final StudentRepository studentRepository;

	@Override
	@Transactional
	public void deleteStudent(String email) {

		studentRepository.deleteByEmail(email);
	}

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student findByEmail(String email) {
		return studentRepository.findAll().stream().filter(s -> s.getEmail().contains(email)).findFirst().orElse(null);
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

}

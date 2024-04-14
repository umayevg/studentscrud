package com.example.studentscrud.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentscrud.model.Student;
import com.example.studentscrud.repository.InMemoryStudentDao;
import com.example.studentscrud.service.StudentService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InMemoryStudentService implements StudentService {

	private final InMemoryStudentDao studentRepository;

	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student findByEmail(String email) {
		return studentRepository.findByEmail(email);
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.saveStudent(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.updateStudent(student);
	}

	@Override
	public void deleteStudent(String email) {
		studentRepository.deleteStudent(email);
	}
}

package com.example.studentscrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentscrud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	void deleteByEmail(String email);

	Student findByEmail(String email);
}

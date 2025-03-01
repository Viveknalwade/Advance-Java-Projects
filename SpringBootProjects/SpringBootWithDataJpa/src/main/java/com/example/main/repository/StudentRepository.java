package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> 
{
	
}

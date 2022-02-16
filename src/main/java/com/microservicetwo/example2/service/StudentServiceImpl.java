package com.microservicetwo.example2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicetwo.example2.entity.Student;
import com.microservicetwo.example2.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
    private StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

}

package com.microservicetwo.example2.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.microservicetwo.example2.entity.Student;

@Repository
public class StudentRepository {
	
	 @Autowired
	 private EntityManager entityManager;
	 @Transactional
	 public Student save(Student contact) {
	         entityManager.persist(contact);
	         return contact;
	    }
}

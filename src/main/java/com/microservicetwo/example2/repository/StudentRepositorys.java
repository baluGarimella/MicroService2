package com.microservicetwo.example2.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservicetwo.example2.entity.Student;


@Repository
public interface StudentRepositorys extends JpaRepository<Student, Integer>{

}

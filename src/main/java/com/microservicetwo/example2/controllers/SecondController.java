package com.microservicetwo.example2.controllers;

import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservicetwo.example2.entity.Student;
import com.microservicetwo.example2.models.JavaResponse;
import com.microservicetwo.example2.models.StudentDto;
import com.microservicetwo.example2.models.StudentMapper;
import com.microservicetwo.example2.service.StudentService;

@RestController
@RequestMapping("/student")
public class SecondController {
	
	@Autowired
	StudentService studentService;
	
	//not used any produces object , how converted to json
	//not used any consumes object
	//content type
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value="/addStudent" ,consumes = {"application/json","application/xml"}, produces = {"application/json","application/xml"})
	public ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto studentDto) {
		
		System.out.println("===============microserive22222==========");
		
		Student returnEntity = studentService.addStudent(StudentMapper.DtoToEntity(studentDto));
		
		
		StudentDto returnStudentDto   = StudentMapper.EntityToDto(returnEntity);
		 
		 
         return new ResponseEntity<StudentDto>(returnStudentDto, HttpStatus.OK);
	}
}

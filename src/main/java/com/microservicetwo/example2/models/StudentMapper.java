package com.microservicetwo.example2.models;

import com.microservicetwo.example2.entity.Student;

public class StudentMapper {
	
	public static Student DtoToEntity(StudentDto prd) {
		Student student = new Student();
		student.setId(prd.getId());
		student.setMobileNumber(prd.getMobileNumber());
		student.setSname(prd.getSname());
		student.setDepartmentName(prd.getDepartmentName());
		return student;
	}
	
	public static StudentDto EntityToDto(Student prd) {
		StudentDto student = new StudentDto();
		student.setId(prd.getId());
		student.setMobileNumber(prd.getMobileNumber());
		student.setSname(prd.getSname());
		student.setDepartmentName(prd.getDepartmentName());
		return student;
	}
}

package com.microservicetwo.example2.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_db")
public class Student {
	
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id;
	    @Column(name="student_name")
	    private String sname;
	    @Column(name="student_department_name")
	    private String departmentName;
	    @Column(name="student_mobileNumber")
	    private Integer mobileNumber;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getSname() {
			return sname;
		}
		public void setSname(String sname) {
			this.sname = sname;
		}
		public String getDepartmentName() {
			return departmentName;
		}
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		public Integer getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(Integer mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
	 
	 

}

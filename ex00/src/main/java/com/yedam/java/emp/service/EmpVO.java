package com.yedam.java.emp.service;

import lombok.Data;


@Data
public class EmpVO {
//	_ 자바방식이 아니라 sql 표기법으로 사용 
	
	String employeeId;
	String firstName;
	String lastName;
	String email;
	String hireDate;
	String jobId;
	String departmentId;
	String salary;

}

package com.yedam.java.emp.service;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class EmpVO {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String hireDate;
	private String jobId;
	private int salary;
	private int commissionPct;
	private int managerId;
	private int departmentId;
}

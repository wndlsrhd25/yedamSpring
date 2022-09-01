package com.yedam.java.emp.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@Controller
public class EmpController {
	
	@Autowired
	EmpMapper empMapper;
	

	@GetMapping("/emp")
	//보낸 데이터를 알아서 가져옴 
	public String emp(Model model, EmpVO empVO) {
		EmpVO findVO = empMapper.getEmp(empVO);
//		Model에 값은 addAttribute를 해서 값을 넣으면 됨
		model.addAttribute("emp", findVO);
		
		return "emp";
	}
	
}

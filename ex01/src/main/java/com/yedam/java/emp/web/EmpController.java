package com.yedam.java.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;



@Controller
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpService empService;

	
	@GetMapping("/allList") //java/emp/allList
	public String getEmpList(Model model) {
		model.addAttribute("empList",empService.getEmpList());
		//view->emp->empList
		return "emp/empList";
		
	}
	
	@GetMapping("/getInfo") //java/emp/getInfo?employeeId=100
	public String getEmpInfo(Model model, EmpVO empVO) {
		model.addAttribute("empInfo", empService.getEmp(empVO));
		return "emp/empInfo";
	}
	
	//포스트방식
	@PostMapping("/updateInfo")
	public String updateEmpInfo(EmpVO empVO) {
		empService.updateEmp(empVO);
		return "redirect:allList"; //뷰가 아님
	}
	
				//redirect에서 절대경로는 contextpath 뒤에 붙음
	@GetMapping("/deleteInfo/{employeeId}")
	public String deleteEmpInfo(@PathVariable int employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		empService.deleteEmp(empVO);
		return "redirect:/emp/allList";
	}
	
	
	@GetMapping("/insertInfo")
	public String insertInfo(EmpVO empVO) {
		return "/emp/insertEmp";
	}
	
	@GetMapping("/insertEmpInfo")
	public String insertEmpInfo(EmpVO empVO) {
		empService.insertEmp(empVO);
		return "redirect:/emp/allList";
	}
}

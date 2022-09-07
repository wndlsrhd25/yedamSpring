package com.yedam.java.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;


//rest 방식
@RestController
//외부에서 들어오는 요청을 다 허락하겠다 -> *
@CrossOrigin(origins ="http://192.168.0.83:8090")
public class EmpRestController {
	
//	크롬에서 부메랑 다운하기
	
	@Autowired
	EmpService service;
	
	
	//전체조회
	@GetMapping("/emp")
	public List<EmpVO> empSelect(){
		return service.getEmpList();
				
	}
	
	//사원조회
	@GetMapping("/emp/{employeeId}")
	public EmpVO empFind(@PathVariable int employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		return service.getEmp(empVO);
	}
	
	//부메랑에서 post- json 형식으로 설정 후 입력
	//사원등록
	@PostMapping("/emp")
	public EmpVO empInsert(@RequestBody EmpVO empVO) {
		service.insertEmp(empVO);
		return empVO;
	}
	
	
	//부메랑에서 put방식으로 수정할 값을 적고 경로에 사원번호를 적어서 수정할 수 잇음
	//사원수정
	@PutMapping("/emp/{employeeId}") //경로에 접근하려는 사원정보, body에 수정하려는 정보
	public EmpVO empUpdate(@PathVariable int employeeId, @RequestBody EmpVO empVO) {
		empVO.setEmployeeId(employeeId);
		service.updateEmp(empVO);
		return empVO;
		
	}
	
	
	//사원삭제
	@DeleteMapping("/emp/{employeeId}")
	public EmpVO empDelete(@PathVariable int employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		service.deleteEmp(empVO);
		return empVO;
	}
	

}

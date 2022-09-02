package com.yedam.java.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.emp.service.EmpVO;

public interface EmpMapper {

	//전체조회
	public List<EmpVO> getEmpList();
	
	//단건조회 : 조회조건 - EmpVO
	public EmpVO getEmp(EmpVO empVO);
	
	//등록
	public int insertEmp(EmpVO empVO);
	
	//수정 : 연봉 10% 인상
	// employeeId 대신에 empId로 사용하겠다
	public int updateSalary(@Param("empId")int employeeId);
	
	
	public int updateEmp(EmpVO empVO);
	
	//삭제
	public int deleteEmp(int employeeId);
}

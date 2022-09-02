package com.yedam.java.emp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class EmpTest {

	@Autowired
	EmpMapper empMapper;
	
	//@Test
	public void empListTest() {
		List<EmpVO> findList = empMapper.getEmpList();
		for(EmpVO findVO : findList) {
			System.out.println(findVO.getLastName());
		}
	}
	
	@Test
	public void empInfoTest() {
		EmpVO info = new EmpVO();
		info.setEmployeeId(100);
		EmpVO findVO = empMapper.getEmp(info);
		//assertEquals(findVO.getLastName(),"King");
		assertNotNull(findVO.getEmail());
	}
	
	//@Test
	public void empInsertTest() {
		EmpVO info = new EmpVO();
		info.setFirstName("튀김");
		info.setLastName("감자");
		info.setEmail("potato25@chip.com");
		info.setJobId("IT_PROG");
		info.setSalary(100000);
		empMapper.insertEmp(info);
		assertEquals(info.getEmployeeId(),208);
	}
	
	//@Test
	public void empUpdateSalaryTest() {
		int result = empMapper.updateSalary(100);
		//결과가 잇으면 1을 반환시킴
		assertEquals(result, 1);
		
	}
	
	//@Test
	public void empUpdateTest() { 
	EmpVO info = new EmpVO();
	info.setEmployeeId(208); 
	EmpVO findVO = empMapper.getEmp(info);
	findVO.setFirstName("자바"); 
	//findVO.setLastName("김");
	findVO.setEmail("java222@email.com"); 
	int result = empMapper.updateEmp(findVO);
	assertEquals(result,1); 
	}

	/*
	 * @Test public void empUpdateTest() { EmpVO info = new EmpVO();
	 * info.setEmployeeId(208); info.setFirstName("자바");
	 * info.setEmail("java25@naver.com");
	 * 
	 * int result = empMapper.updateEmp(info); assertEquals(result, 1); }
	 */
	
	//@Test
	public void empDeleteTest() {
		int result = empMapper.deleteEmp(207);
		assertEquals(result, 1);
	}
	
	
	
}

package com.yedam.java.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.test.service.AaaService;

	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/**/*-context.xml")
	
	public class TxTest {
	@Autowired
	AaaService service;
	
	@Test
	public void txTest() {
		service.insert();
	}
		
}

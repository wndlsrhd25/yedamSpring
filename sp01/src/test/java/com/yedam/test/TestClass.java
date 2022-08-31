package com.yedam.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.junit.Restaurant;

//RunWith은 jUnit 프레임워크의 테스트 실행방법을 확장할때 사용하는 어노테이션, 
@RunWith(SpringJUnit4ClassRunner.class)
//컨테이너를 어디에서 가져올건지 위치를 지정하는 어노테이션-src/main/resources에서 관리함
@ContextConfiguration(locations = "classpath:applicationContext.xml")
	public class TestClass {
	
	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	Restaurant res;
	
	@Test
	public void beanTest() {
		//Restaurant res = ctx.getBean(Restaurant.class);
		res.open();
	}
}

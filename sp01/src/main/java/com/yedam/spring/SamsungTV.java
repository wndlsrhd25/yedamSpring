package com.yedam.spring;

import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTV implements TV {

	@Override
	public void on() {
		System.out.println("삼성티비 스프링 on");
	};
	
	@Override
	public void off() {
		System.out.println("삼성티비 스프링 off");
	}
	
}

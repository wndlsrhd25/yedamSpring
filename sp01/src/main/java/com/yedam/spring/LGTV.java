package com.yedam.spring;

import org.springframework.stereotype.Component;

@Component("LGTV")
public class LGTV implements TV {

	@Override
	public void on() {
		System.out.println("LGTV 스프링 on");
	};
	
	@Override
	public void off() {
		System.out.println("LGTV 스프링 off");
	}

	
	
	
}

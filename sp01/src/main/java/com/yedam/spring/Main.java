package com.yedam.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		//TV tv = (TV) ctx.getBean(SamsungTV.class);
		TV tv = (TV) ctx.getBean("tv");
		TV Ltv = (TV) ctx.getBean("LGTV");
		tv.on();
		tv.off();
		Ltv.on();
		Ltv.off();
			
	}

}

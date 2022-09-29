package com.yedam.java.test.service;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{
		
		//Aop가 적용되는 메소드 이름
		String sigratureStr = joinpoint.getSignature().toShortString();
		System.out.println("시작 : " +  sigratureStr);
		
		//공통 기능
		System.out.println("핵심 기능 전에 실행할 공통 기능 : "+System.currentTimeMillis());
		try {
			Object obj = joinpoint.proceed(); //핵식 기능 실행
			return obj;
			
		}finally {
			System.out.println("핵심 기능 후에 실행할 공통 기능 : "+ System.currentTimeMillis());
			System.out.println("끝 : "+sigratureStr);
		}
		
	}

}

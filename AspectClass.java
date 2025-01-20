package com.project.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectClass {
	
	@Before("execution(public void paymentService())")
	public void beforePayement() {
		System.out.println("Total payment before credit Rs.11,000");
	}
	
	@After("execution(public void paymentService())")
	public void afterPayment() {
		System.out.println("payment credited successfully..");
	}
	
}

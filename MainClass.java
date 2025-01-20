package com.project.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.annotation.ComponentScanAnnotation;
import com.project.beans.Payment;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ComponentScanAnnotation.class);
		Payment p=context.getBean(Payment.class);
		p.paymentService();

	}

}

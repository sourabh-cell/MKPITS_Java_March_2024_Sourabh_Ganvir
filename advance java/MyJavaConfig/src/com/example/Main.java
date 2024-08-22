package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
		Student student = (Student) context.getBean("s1");
		student.display();
		
		Student student1 = (Student) context.getBean("s2");
		System.out.println(student1);
	}
}

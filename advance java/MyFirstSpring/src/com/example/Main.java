package com.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Student student = (Student)context.getBean("s");
		Student student1 = (Student)context.getBean("s1");
		student1.display();
		student.display();
	}
}

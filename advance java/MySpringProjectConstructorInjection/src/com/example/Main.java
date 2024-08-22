package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Student student1 = (Student) context.getBean("s1");
		Student student2 = (Student) context.getBean("s2");
		Student student3 = (Student) context.getBean("s3");
		Student student4 = (Student) context.getBean("s4");
		Student student5 = (Student) context.getBean("s5");
		Student student6 = (Student) context.getBean("s6");
		
		System.out.println("constructor with name parameter called");
		System.out.println(student1);
		System.out.println("constructor with mark parameter called");
		System.out.println(student2);
		System.out.println("constructor with name and Mark parameter called");
		System.out.println(student3);
		System.out.println("constructor with name ,Mark , address object parameter called");
		System.out.println(student4);
		System.out.println("constructor with name, Mark , address object and list parameter called");
		System.out.println(student5);
		System.out.println("constructor with name, Mark , address object ,list and map parameter called");
		System.out.println(student6);
		

		
		
		
	}
}

package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


//annotation to describe treat it as component
@Component                                        //it is component which is search by componentscan(under App.config)
@PropertySource("classpath:application.properties")  //declaring path of file(application.properties)  where data get get read 
public class Student {
	
	@Value("${name}")
	private String name;
	
	@Value("${city}")
	private String city;
	
	public Student() {
		super();
	}
	
	
	public Student(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(city);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", city=" + city + "]";
	}
	
	

}

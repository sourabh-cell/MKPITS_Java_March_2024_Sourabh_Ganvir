package com.example;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;



public class Student {
	
	
	private String name;
	
	private int city;
	
	Address address;
	
	List<String> subject;	
	
	Map<String,Integer> Sub_mark;
	

	public Student() {
		super();
	}
	
	public Student(String name) {
		super();
		this.name = name;
	}
	
	
	
	public Student(int city) {
		super();
		this.city = city;
	}

	public Student(String name, int city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	// constructor with name, mark , address object
	public Student(String name, int city, Address address) {
		super();
		this.name = name;
		this.city = city;
		this.address = address;
	}

	// constructor with name, mark , address object ,list
		public Student(String name, int city, Address address,List<String> subjects) {
			super();
			this.name = name;
			this.city = city;
			this.address = address;
			this.subject=subjects;
		}

		
		// constructor with name, mark , address object ,list ,map
				public Student(String name, int city, Address address,List<String> subjects,Map<String, Integer> submrk) {
					super();
					this.name = name;
					this.city = city;
					this.address = address;
					this.subject=subjects;
					this.Sub_mark=submrk;
				}

				@Override
				public String toString() {
					return "Student [name=" + name + ", city=" + city + ", address=" + address + ", subject=" + subject
							+ ", Sub_mark=" + Sub_mark + "]";
				}
		
		


}

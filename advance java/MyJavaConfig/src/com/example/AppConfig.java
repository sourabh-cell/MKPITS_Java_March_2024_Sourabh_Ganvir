package com.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// java config file
@Configuration
public class AppConfig {
	
	@Bean (name = "s1")
	public Student objectStudent() {
		Student st=new Student();
		st.setName("Sanved");
		st.setCity("pataya");
		return st;
	}
	
	@Bean (name = "s2")
	public Student objectStudent1() {
		Student st=new Student();
		st.setName("Shubham");
		st.setCity("Mangal");
		return st;
	}

}

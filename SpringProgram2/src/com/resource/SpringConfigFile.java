package com.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student std1() {
		Student std=new Student();
		std.setName("naseer1");
		std.setRollno(200);
		std.setEmail("ns@gmail.com");
		return std;
		
	}
}

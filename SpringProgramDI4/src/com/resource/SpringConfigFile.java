package com.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.Address;
import com.bean.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address addId() {
		Address ad=new Address(33,"kmmm");
		
		return ad;
	}
	@Bean
	public Student stdId() {
		Student std=new Student("nass",33,addId());
		
		return std;
	}
}

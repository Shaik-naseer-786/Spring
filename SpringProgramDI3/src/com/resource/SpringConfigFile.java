package com.resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.Address;
import com.bean.Student;

@Configuration
public class SpringConfigFile {

	@Bean
	public Address addId() {
		Address ad=new Address();
		ad.setHno(12);
		ad.setCity("kmt");
		return ad;
	}
	@Bean
	public Student stdId() {
		Student std=new Student();
		std.setName("naseer");
		std.setRoll(3);
		std.setAddress(addId());
		return std;
	}
}

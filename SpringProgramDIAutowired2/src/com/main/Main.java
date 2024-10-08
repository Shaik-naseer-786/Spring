package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class Main {
	public static void main(String[] args) {
		String config_loc="/com/resource/applicationContext.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
		
		Student std=(Student) context.getBean("stdId");
		System.out.println(std.toString());
	}
}

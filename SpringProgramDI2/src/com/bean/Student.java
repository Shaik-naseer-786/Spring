package com.bean;

public class Student {
	private String name;
	private int roll;
	private Address address;
	
	public Student(String name, int roll, Address address) {
		super();
		this.name = name;
		this.roll = roll;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", address=" + address + "]";
	}
	
	
}

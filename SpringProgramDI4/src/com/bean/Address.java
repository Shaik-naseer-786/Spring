package com.bean;

public class Address {
	private int hno;
	private String city;
	
	public Address(int hno, String city) {
		super();
		this.hno = hno;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + "]";
	}
	
	
}

package com.bean;

public class Address {
	private int hno;
	private String city;
	public void setHno(int hno) {
		this.hno = hno;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + "]";
	}
	
	
}

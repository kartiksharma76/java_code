package com.jdbc.myAssignment;

public class ClintMaster {
/**
 * client_no VARCHAR(6),
    name VARCHAR(20),
    address1 VARCHAR(30),
    address2 VARCHAR(30),
    city VARCHAR(15),
    state VARCHAR(15),
    pincode INT,
    bal_due DECIMAL(10.2)
 */
	private String clint_no;
	private String name;
	private String 	address1;
	private String address2;
	private String city;
	private String state;
	private int pincode;
	private double bal_due;
	public String getClint_no() {
		return clint_no;
	}
	public void setClint_no(String clint_no) {
		this.clint_no = clint_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public double getBal_due() {
		return bal_due;
	}
	public void setBal_due(double bal_due) {
		this.bal_due = bal_due;
	}
	
}

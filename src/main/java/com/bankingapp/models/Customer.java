package com.bankingapp.models;

import java.time.LocalDate;

public class Customer {
private long customerid;
private String name;
private LocalDate dob;

//Constructors 

public long getCustomerid() {
	return customerid;
}
public Customer(long customerid, String name, LocalDate dob) {
	super();
	this.customerid = customerid;
	this.name = name;
	this.dob = dob;
}
public String getName() {
	return name;
}
public LocalDate getDob() {
	return dob;
}
public void setCustomerid(long customerid) {
	this.customerid = customerid;
}
public void setName(String name) {
	this.name = name;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}

}

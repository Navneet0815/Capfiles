package com.cg.xyzbank.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@SequenceGenerator(name="AccNumSeq12",initialValue=1,allocationSize=100)
@Table(name="CustomerMVC")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="AccNumSeq12")
 private int id;
	
	@NotEmpty(message="Please Enter  Name")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Username must contain only alphabets")
 private String name;
	
@NotEmpty(message="Please Enter  mail")
//@Pattern(regexp = "^[a-zA-Z]+[@][a-zA-Z0-9]+([.][a-zA-Z] {2,})+$", message = "enter valid email id")
@Pattern(regexp="^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$" ,message="enter valid email id")
 private String mail;
	
	@Pattern(regexp = "[6-9][0-9]{9,9}", message = "enter valid phone no")
 private String phoneNo;
	

 private double balance;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}

public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", mail=" + mail + ", phoneNo=" + phoneNo + ", balance=" + balance
			+ "]";
}
 
 
}

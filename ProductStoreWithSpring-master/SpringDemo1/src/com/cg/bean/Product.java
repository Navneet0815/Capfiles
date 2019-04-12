package com.cg.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Product {
	private int pid;
	private String pName;
	private double price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pName, double price) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pName=" + pName + ", price=" + price + "]\n";
	}
	
}

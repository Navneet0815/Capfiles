package com.cg.controller;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.cg.bean.Product;
import com.cg.service.IProductService;

@Component("controller")
@Scope("prototype")
public class ProductControl implements IController{
	@Autowired
	IProductService service ;
	Product product;
	
	@Autowired
	public ProductControl(Product product) {
		System.out.println("this is controller constructor!!!!!!");
		this.product = product;
	}
	
	@Override
	public double getTotalProductAmount(int quant) {
		return service.getTotalProductAmount(product, quant);
	}
	public IProductService getService() {
		return service;
	}
	public void setService(IProductService service) {
		this.service = service;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@PostConstruct
	public void welcome() {
		System.out.println("welcome to ems!!!!!!");
	}
	public void goodBye() {
		System.out.println("Visit again!!!!!!!!!!!");
	}

	@Override
	public int addProduct(int id, String name, double price) {
		// TODO Auto-generated method stub
		product.setPid(id);
		product.setpName(name);
		product.setPrice(price);
		return service.addProduct(product);
	}

	@Override
	public HashMap<Integer, Product> getProducts() {
		// TODO Auto-generated method stub
		return service.getProducts();
	}
}

package com.cg.controller;

import java.util.HashMap;

import com.cg.bean.Product;

public interface IController {
	public double getTotalProductAmount(int quant);
	public int addProduct(int id, String name, double price);
	HashMap<Integer, Product> getProducts();
}

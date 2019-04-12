package com.cg.dao;

import java.util.HashMap;

import com.cg.bean.Product;

public interface IProductDao {
	public int addProduct(Product product);

	HashMap<Integer, Product> getProducts();
}

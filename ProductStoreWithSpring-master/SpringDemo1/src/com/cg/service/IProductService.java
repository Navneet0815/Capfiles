package com.cg.service;

import java.util.HashMap;

import com.cg.bean.Product;

public interface IProductService {
	double getTotalProductAmount(Product p, int quant);

	int addProduct(Product product);
	HashMap<Integer, Product> getProducts();
}

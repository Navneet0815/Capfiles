package com.cg.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.cg.bean.Product;
import com.cg.collectionUtil.CollectionUtil;

@Repository("productDao")
public class ProductDao implements IProductDao {
	
	@Override
	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		CollectionUtil.products.put(product.getPid(), product);
		return product.getPid();
	}
	@Override
	public HashMap<Integer, Product> getProducts(){
		return (HashMap<Integer, Product>) CollectionUtil.products;
	}

}

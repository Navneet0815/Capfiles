package com.cg.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Product;
import com.cg.dao.IProductDao;

@Service
public class ProductService implements IProductService{
	@Autowired
	IProductDao productDao;
	
	public IProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(IProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public double getTotalProductAmount(Product p, int quant) {
		// TODO Auto-generated method stub
		return p.getPrice()*quant;
	}

	@Override
	public int addProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.addProduct(product);
	}

	@Override
	public HashMap<Integer, Product> getProducts() {
		// TODO Auto-generated method stub
		return productDao.getProducts();
	}

}

package com.demo.service;

import java.util.List;

import com.demo.bean.Product;

public interface ProductService {

	List<Product> getallProduct();

	Product getProductById(int pid);

	int update(Product p);

	int deleteById(int pid);

	int addProduct(Product p);

	

}

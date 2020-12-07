package com.demo.dao;

import java.util.List;

import com.demo.bean.Product;

public interface ProductDao {

	List<Product> getallproduct();

	Product getProductId(int pid);

	int update(Product p);

	int delete(int pid);

	
	int addprodid(Product p);

}

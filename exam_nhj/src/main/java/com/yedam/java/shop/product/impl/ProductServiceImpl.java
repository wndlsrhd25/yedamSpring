package com.yedam.java.shop.product.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.product.mapper.ProductMapper;
import com.yedam.java.product.service.ProductService;
import com.yedam.java.product.service.ProductVO;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductMapper mapper;
	
	
	@Override
	public int insertProduct(ProductVO productVO) {
		return mapper.insertProduct(productVO);
	}

	@Override
	public List<ProductVO> selectAll() {
		return mapper.selectAll();
	}

	@Override
	public int getproductNo() {
		return mapper.getproductNo();
	}

}

package com.yedam.java.shop.mapper;

import java.util.List;

import com.yedam.java.shop.service.ProductVO;

public interface ProductMapper {
	
	//상품 번호 조회
	public int getproductNo();
	
	//상품등록
	public int insertProduct(ProductVO productVO);
	
	//상품 조회
	public List<ProductVO> selectAll();
}

package com.yedam.java.product.service;

import java.util.List;


public interface ProductService {

	//상품 번호 조회
	public int getproductNo();
	
	
	//상품 등록
	public int insertProduct(ProductVO productVO);
	
	//게시글 전체조회
	public List<ProductVO> selectAll();
	

}

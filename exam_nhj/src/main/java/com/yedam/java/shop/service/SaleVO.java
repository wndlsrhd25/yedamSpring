package com.yedam.java.shop.service;

import java.util.Date;

import lombok.Data;

@Data
public class SaleVO {
	private int saleSeq;
	private Date saleDate;
	private int productId;
	private int salePrice;
	private String managerId;
	
}

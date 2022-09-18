package com.yedam.java.product.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.product.service.ProductService;
import com.yedam.java.product.service.ProductVO;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService service;
	
	//전체조회
	@GetMapping("/list")
	public String productList(Model model) {
		model.addAttribute("productList",service.selectAll());
		return "product/list";
	}
	
	//입력폼
	@GetMapping("/insert")
	public String productInsertForm(Model model) {
		model.addAttribute("productId",service.getproductNo());
		return "product/insert";
	}
	
	
	//입력
	@PostMapping("/insert")
	public String productInsert(ProductVO productVO) {
		service.insertProduct(productVO);
		return "redirect:list";
	}
	
}

package com.yedam.java.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookRentVO;
import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookMapper bookMapper;
	

	@Override
	public List<BookVO> getBookList() {
		return bookMapper.getBookList();
	}

	@Override
	public List<BookRentVO> getBookRentList(BookRentVO bookRentVO) {
		return null;
	}

	@Override
	public void insertBook(BookVO bookVO) {
		bookMapper.insertBook(bookVO);
		
	}

	@Override
	public int getBookNo() {
		BookVO vo = bookMapper.getBookNo();
		return vo.getBookNo();
	}
	
}

package com.yedam.java.book.service;

import java.util.List;

public interface BookService {
	
	
	//게시글 번호 조회
	public int getBookNo();
	
	//전체조회
	public List<BookVO> getBookList();
	
	//렌탈 리스트 조회
	public List<BookRentVO> getBookRentList(BookRentVO bookRentVO);
	
	//등록
	public int insertBook(BookVO bookVO);


}

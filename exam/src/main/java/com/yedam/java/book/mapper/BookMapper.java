package com.yedam.java.book.mapper;

import java.util.List;

import com.yedam.java.book.service.BookRentVO;
import com.yedam.java.book.service.BookVO;

public interface BookMapper {
	
	//게시글 번호 조회
	public BookVO getBookNo();
	
	//전체조회
	public List<BookVO> getBookList();
	
	//대출현황 조회
	public BookRentVO getBook(BookRentVO bookRentVO);
	
	//도서등록
	public int insertBook(BookVO bookVO);

}

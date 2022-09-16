package com.yedam.java.board.service;

import java.util.List;

public interface BoardService {

	//boardmapper.java와 이름이 같을 필요는 없음
	//BoardServiceImpl에서 주의해서 적어줘야함
	//인터페이스는 객체가 아님 객체로 만들기 위해서 클래스가 필요함(BoardServiceImpl)
	
	//게시글 번호 조회
	public int getBoardNo();
	
	//게시글 등록
	public int boardInsert(BoardVO boardVO);
	
	//게시글 번호 조회
	public List<BoardVO> getAllBoard();
	
}

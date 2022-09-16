package com.yedam.java.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.board.mapper.BoardMapper;
import com.yedam.java.board.service.BoardService;
import com.yedam.java.board.service.BoardVO;

//빈으로 등록하기 위해서 반드시 필요함
@Service
public class BoardServiceImpl implements BoardService {

	
	//mapper을 할때 기준은 
	//@Service("Board")로 하면 타입은 보드 서비스지만 필드명은 보드로 해야함?
	
	@Autowired //반드시 타입을 기준으로만 가능한것은 아니다, 필요한 경우 별도의 bean 이름을 필드로 사용 할 수 있다.
	BoardMapper mapper;
	
	@Override
	public int getBoardNo() {
		//단순히 디비에서 가져오는 경우는 바로 리턴을 할 수 있음
		return mapper.getBoardNo();
	}

	@Override
	public int boardInsert(BoardVO boardVO) {
		// 인서트한 결과 메세지를 출력하기 위해서는 message라는 변수를 만들어서 리턴해줘야함
		/*
		 * public String boardInsert(BoardVO boardVO) {
		 * int result = mapper.insertBoard(boardVO);
		 * String message = null;
		 * if(result>0) message ="success";
		 * else message = "fail";
		 * return message;
		 * }
		 */
		return mapper.insertBoard(boardVO);
	}

	@Override
	public List<BoardVO> getAllBoard() {
		return mapper.selectAllBoardList();
	}

}

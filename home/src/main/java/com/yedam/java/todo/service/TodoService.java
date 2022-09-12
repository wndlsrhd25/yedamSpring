package com.yedam.java.todo.service;

import java.util.List;

public interface TodoService {

	//게시글 조회
	public int getTodoNo();
	
	//전체조회
	public List<TodoVO> getTodoList();
	
	//등록
	public int insertTodo(TodoVO todoVO);
	
	//수정
	public int updateTodo(TodoVO todoVO);
	
	//삭제
	public int deleteTodo(int no);
}

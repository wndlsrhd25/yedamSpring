package com.yedam.java.todo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.todo.service.TodoVO;

public interface TodoMapper {

	
	//게시글 번호 조회
	public TodoVO getTodoNo();
	
	//전체조회
	public List<TodoVO> getTodoList();
	
	//등록
	public int insertTodo(TodoVO todoVO);
	
	//수정
	public int updateTodo(TodoVO todoVO);
	
	//삭제
	public int deleteTodo(@Param("no") int todoVO);
}

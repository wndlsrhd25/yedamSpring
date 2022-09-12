package com.yedam.java.todo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.todo.mapper.TodoMapper;
import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	TodoMapper todoMapper;
	

	 //게시글 번호조회
	 
	 @Override 
	 public int getTodoNo() { 
	 TodoVO vo = todoMapper.getTodoNo(); 
	 return vo.getNo(); 
	 }
	
	
	//전체조회
	@Override
	public List<TodoVO> getTodoList() {
		return todoMapper.getTodoList();
	}

	//입력
	@Override
	public int insertTodo(TodoVO todoVO) {
		return todoMapper.insertTodo(todoVO);
	}

	//수정
	@Override
	public int updateTodo(TodoVO todoVO) {
		return todoMapper.updateTodo(todoVO);
	}

	//삭제
	@Override
	public int deleteTodo(int no) {
		
		return todoMapper.deleteTodo(no);
	}



}

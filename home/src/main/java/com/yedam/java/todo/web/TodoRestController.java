package com.yedam.java.todo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;

@RestController 
@CrossOrigin(origins ="http://127.0.0.1:5500")
public class TodoRestController {

	@Autowired
	TodoService service;
	
	//전체조회
	@GetMapping("/todo")
	public List<TodoVO> todoList(){
		return service.getTodoList();
		
	}
	
	//부메랑에서 post- json 형식으로 설정 후 입력
	//등록-DB insert
	@PostMapping("/todo")
	public int insertTodo(TodoVO todoVO) {
		return service.insertTodo(todoVO);
	}
	
	//부메랑에서 put방식으로 수정할 값을 적고 경로에 사원번호를 적어서 수정할 수 잇음
	//수정
	 @PutMapping("/todo") 
	 public int updateTodo(@RequestBody TodoVO todoVO) {
		return service.updateTodo(todoVO); 
	}
	
	
	//삭제
	@DeleteMapping("/todo/{no}")
	public int deleteTodo(@PathVariable int no) {
		return service.deleteTodo(no);

	}
}

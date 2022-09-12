package com.yedam.java.todo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;

@Controller
@RequestMapping("/todo")
public class TodoController {

	@Autowired
	TodoService service;
	
	//전체조회
	@GetMapping("/list")
	public String todoList(Model model) {
		model.addAttribute("todoList",service.getTodoList());
		return "todo/todoList";
	}
	
	
	//등록-DB insert
	@PostMapping("/insert")
	public String insertTodo(TodoVO todoVO) {
		service.insertTodo(todoVO);
		return "redirect:list";
	}
	
	//수정
	 @PostMapping("/update") 
	 public String updateTodo(TodoVO todoVO) {
		service.updateTodo(todoVO); 
		return "redirect:list"; 
	}
	
	
	
	//삭제
	@GetMapping("/delete/{no}")
	public String deleteTodo(@PathVariable int no) {
		service.deleteTodo(no);
		return "redirect:/todo/list";
	}
}

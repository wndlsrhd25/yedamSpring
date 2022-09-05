package com.yedam.java.user.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.java.user.service.UserListVO;
import com.yedam.java.user.service.UserVO;

@Controller
public class UserController {
	
	//post방식 - view를 실행함
	@RequestMapping(value="/inputForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String inputForm() {
		return "inputForm";
	}

	//get 방식 - 뷰에 대한 정보를 안 넘겨줬지 때문에 404에러가 뜸 (?로 넘김)
	@RequestMapping("/users")
	/*
	 *1. 일반적인 방법
	 * public String process(UserVO userVO) { 
		 * System.out.println(userVO.getName());
		 * System.out.println(userVO.getAge()); 
		 * return ""; 
	 * }
	 */
	
	// 2. 파람을 이용하는 방법 
	//뷰에서 쓰는 이름이 다르다면 "name"을 가져와서 이름을 정해주면 됨(temp)
	//http://localhost:8088/java/users?name=shin&age=25
	/*
	 * public String process(@RequestParam String name, @RequestParam int age) {
	 * System.out.println(name + ", " + age); 
	 * return ""; 
	 * }
	 */
	
	//3. map을 사용하는 방법 
	//key값으로 string타입으로 넣기
	public String process(@RequestParam Map<String, Object> map) {
		System.out.println(map.get("name") + ", " + map.get("age"));
		return "";
	}
	
	@RequestMapping("/nameList")
	public String nameProcess(@RequestParam List<String> name) {
		for(String temp: name) {
			System.out.println(temp);
		}
		return "";
	}
	
	@RequestMapping("/userList")
	//http://localhost:8090/java/usersList?list[0].name=choi&list[0].age=20&list[1].name=shin&list[1].age=30
	public String listProcess(UserListVO userListVO) {
		List<UserVO> userList = userListVO.getList();
		for(UserVO vo : userList) {
			System.out.println(vo.getName() + ", " +vo.getAge());
		}
		return "";
	}
}

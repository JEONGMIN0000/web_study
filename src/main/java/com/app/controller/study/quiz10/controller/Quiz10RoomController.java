package com.app.controller.study.quiz10.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.controller.study.quiz10.dto.Quiz10Room;
import com.app.controller.study.quiz10.service.Quiz10RoomService;

@Controller
public class Quiz10RoomController {
	
	@Autowired
	Quiz10RoomService quiz10RoomService;
	
	//등록페이지 -> GET
	@GetMapping("/quiz10RegisterRoom")
	public String quiz10RegisterRegister() {
		
		return "quiz/quiz10/quiz10registerRoom";
	}
	
	//등록페이지에서 입력후 등력요청 -> POST
	@PostMapping("/quiz10RegisterRoom")
	public String quiz10RegisterRegisterAction(Quiz10Room quiz10Room) {
		
		//등록할 화면 입력한 값!
		
		//유효성 검증 
		//서비스에게 등록요청
		
		//매개변수로 받은 객체 전달 -> 서비스
		int result = quiz10RoomService.saveRoom(quiz10Room);
		
		if(result > 0) { //저장성공
			//성공시 보여줄 페이지
			return "quiz/quiz10/quiz10registerRoom";
		} else { //저장 실패
			//실패시 보여줄 페이지
			return "quiz/quiz10/quiz10registerRoom";
		}

		
	}
	
}

package com.app.controller.study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.common.CommonCode;
import com.app.dto.user.User;

@Controller
public class RestQuizController {
	

	@GetMapping("/rest/quiz1")
	public String restQuiz1() {
		
		return "quiz/rest/quiz1";
	}
	
	@ResponseBody
	@GetMapping("/rest/quiz2")
	public String restQuiz2() {
		
		return "return text quiz2";
	}

	@ResponseBody
	@GetMapping("/rest/quiz3")
	public User restQuiz3() {
		
		User user = new User();
		user.setId("quizid");
		user.setPw("secret");
		user.setName("quiz이름");
		user.setUserType(CommonCode.USERTYPE_CUSTOMER);
		System.out.println(user);
		
		return user;
	}

}

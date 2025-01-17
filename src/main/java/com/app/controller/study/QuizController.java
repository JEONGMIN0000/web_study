package com.app.controller.study;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuizController {
	
	//1
	//@GetMapping("/req1")
	@RequestMapping(value="/req1", method=RequestMethod.GET)
	public String req1Get() {
		System.out.println("/quiz/req1 GET 요청");
		return "/quiz/main";
	}
	
	//1-1
	//@PostMapping("/req1")
	@RequestMapping(value="/req1", method=RequestMethod.POST)
	public String req1Post() {
		System.out.println("/quiz/req1 POST 요청");
		return "/quiz/main";
	}
	
	//2
//	@RequestMapping("/req2")
//	public String req2(@RequestParam String data1, @RequestParam String data2) {
//		System.out.println("/quiz/req2 요청");
//		System.out.println(data1);
//		System.out.println(data2);
//		return "/quiz/main";
//	}
	
	@RequestMapping("/req2")
	public String req2(HttpServletRequest request) {
		System.out.println("/quiz/req2 요청");
		System.out.println(request.getParameter("data1"));
		System.out.println(request.getParameter("data2"));
		
		request.setAttribute("data1", request.getParameter("data1"));
		request.setAttribute("data2", request.getParameter("data2"));
		return "/quiz/main";
	}


}

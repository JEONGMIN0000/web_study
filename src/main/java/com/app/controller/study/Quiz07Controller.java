package com.app.controller.study;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Quiz07Controller {
	
	//기본버전
	/*
	@GetMapping("/scopeCheck/first")
	public String first(Model model) {
		
		model.addAttribute("accessUrl", "/first");

		return"quiz/quiz07/targetPage";
	}
	*/
	
	@GetMapping("/scopeCheck/first")
	public String first(Model model, HttpSession session) {
		
		String accessUrl = (String) session.getAttribute("accessUrl");
		 
		if(accessUrl != null) { //session accessUrl 있다 -> firsthide2 들렸다가 옴
			model.addAttribute("accessUrl", session.getAttribute("accessUrl"));
			session.invalidate();
		} else { //first 바로 접근
			model.addAttribute("accessUrl", "/first");
		}
		
		return"quiz/quiz07/targetPage";
	}
	
	@GetMapping("/scopeCheck/firsthide1")
	public String firstHide1(Model model) {
		
		model.addAttribute("accessUrl", "/firsthide1");
		
		return"quiz/quiz07/targetPage";
	}
	
	//기본 버전
	/*
	@GetMapping("/scopeCheck/firsthide2")
	public String firstHide2() {
		
		return"redirect:/scopeCheck/first";
	}
	*/
	
	@GetMapping("/scopeCheck/firsthide2")
	public String firstHide3(HttpSession session) {
		
		session.setAttribute("accessUrl", "/firsthide2");
		
		return"redirect:/scopeCheck/first";
	}
}

package com.app.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.dto.ResponseItem;

@Controller
public class Quiz05Controller {
	
	//1
	/*
	//1-1
	@RequestMapping("/request1-1")
	public String request1_1(HttpServletRequest request) {
		
		System.out.println(request.getParameter("category"));
		System.out.println(request.getParameter("product"));
		
		return "/quiz/quiz05/quiz05";
	}
	
	//1-2
	@RequestMapping("/request1-2")
	public String request1_2(@RequestParam String category, @RequestParam String product) {
		
		System.out.println(category);
		System.out.println(product);
		
		return "/quiz/quiz05/quiz05";
	}
	//1-3
	@RequestMapping("/request1-3")
	public String request1_3(@ModelAttribute ResponseItem item) {
		
		System.out.println(item.getCategory());
		System.out.println(item.getProduct());
		
		return "/quiz/quiz05/quiz05";
	}
	
	//1-4
		@RequestMapping("/request1-4")
		public String request1_4(@RequestParam Map<String,String> paramMap) {
			
			System.out.println(paramMap.get("category"));
			System.out.println(paramMap.get("product"));
			
			return "/quiz/quiz05/quiz05";
		}
	
	//2
	
	//2-1
	@RequestMapping("/response1-1")
	public String response1_1(HttpServletRequest request) {
		
		request.setAttribute("response001", "ㅎㅇ");
		request.setAttribute("response099", "ㅂㅇ");
		
		return "/quiz/quiz05/view";
	}
	
	//2-2
	@RequestMapping("/response1-2")
	public String response1_2(Model model) {
		
		model.addAttribute("response001", "ㅎㅇ");
		model.addAttribute("response099", "ㅂㅇ");
		
		return "/quiz/quiz05/view";
	}
	//2-3
	@RequestMapping("/response1-3")
	public ModelAndView response1_3(ModelAndView mav) {
		
		mav.setViewName("/quiz/quiz05/view");
		mav.addObject("response001", "ㅎㅇ");
		mav.addObject("response099", "ㅂㅇ");
		
		return mav;
	}
	
	//2-4
	@RequestMapping("/response1-4")
//	public String response1_4(ResponseItem item) { //@ModelAttribute 어노테이션 생략가능
	public String response1_4(@ModelAttribute ResponseItem item) {
		
		item.setResponse001("ㅎㅇ");
		item.setResponse099("ㅂㅇ");
		
		return "/quiz/quiz05/view";
	}
	
	//2-4
	@RequestMapping("/response1-4")
	public String response1_4(Model model) {
		
		ResponseItem item = new ResponseItem();
		item.setResponse001("ㅎㅇ");
		item.setResponse099("ㅂㅇ");
		
		model.addAttribute("responseItem", item);
		
		return "/quiz/quiz05/view";
	}
	*/
}


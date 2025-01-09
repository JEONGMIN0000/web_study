package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/request02")
public class Request02Controller {
	
	@RequestMapping("/url02")
	public String url02() {
		
		return "url1";
	}
	
	@RequestMapping("/url03")
	public String url03() {
		
		return "url1";
	}
}
package com.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz03")
public class Quiz03Controller {
	
	//1) 4개 각각 페이지
	/*
	@RequestMapping("/pathA")
	public String pathA() {
		return "/quiz/quiz03/pathA";
	}
	
	@RequestMapping("/pathB")
	public String pathB() {
		return "/quiz/quiz03/pathB";
	}
	
	@RequestMapping("/pathCommon/A")
	public String pathCommonA() {
		return "/quiz/quiz03/pathCommon/A";
	}
	
	@RequestMapping("/pathCommon/B")
	public String pathCommonB() {
		return "/quiz/quiz03/pathCommon/B";
	}
	*/
	
	//2) pathA, pathB는 각각 페이지, pathCommon 은 동일한 페이지
	/*
	//2-1)
	@RequestMapping("/pathA")
	public String pathA() {
		return "/quiz/quiz03/pathA";
	}
	
	@RequestMapping("/pathB")
	public String pathB() {
		return "/quiz/quiz03/pathB";
	}
	
	@RequestMapping("/pathCommon/A")
	public String pathCommonA(HttpServletRequest request) {
		request.setAttribute("productName", "A 상품의 상품명");
		return "/quiz/quiz03/pathCommon/common";
	}
	
	@RequestMapping("/pathCommon/B")
	public String pathCommonB(Model model) {
		model.addAttribute("productName", "B 상품의 상품명");
		return "/quiz/quiz03/pathCommon/common";
	}
	*/
	//2-2)
	@RequestMapping("/pathA")
	public String pathA() {
		return "/quiz/quiz03/pathA";
	}
	
	@RequestMapping("/pathB")
	public String pathB() {
		return "/quiz/quiz03/pathB";
	}
	
	@RequestMapping("/pathCommon/{pathName}")
	public String pathCommonB(@PathVariable String pathName, Model model) {
		//pathName : A B C D E F ...
		
		//pathName 활용해서 -> DB 데이터 조회 -> 화면 전달
		model.addAttribute("productName", pathName);
		
		return "/quiz/quiz03/pathCommon/common";
	}
	
	//3) 모든 경로가 동일한 페이지
	/*
	public String pathA(HttpServletRequest request) {
		request.setAttribute("productName", "A 상품의 상품명");
		return "/quiz/quiz03/pathCommon/common";
	}
	
	@RequestMapping("/pathB")
	public String pathB(Model model) {
		model.addAttribute("productName", "B 상품의 상품명");
		return "/quiz/quiz03/pathCommon/common";
	}
	
	@RequestMapping("/pathCommon/A")
	public String pathCommonA(HttpServletRequest request) {
		request.setAttribute("productName", "A 상품의 상품명");
		return "/quiz/quiz03/pathCommon/common";
	}
	
	@RequestMapping("/pathCommon/B")
	public String pathCommonB(Model model) {
		model.addAttribute("productName", "B 상품의 상품명");
		return "/quiz/quiz03/pathCommon/common";
	}
	*/
	
	//4) A는 A끼리 B는 B끼리
	/*
	//4-1)
	@RequestMapping("/pathA")
	public String pathA() {
		return "/quiz/quiz03/pathA";
	}
	
	@RequestMapping("/pathB")
	public String pathB() {
		return "/quiz/quiz03/pathB";
	}
	
	@RequestMapping("/pathCommon/A")
	public String pathCommonA() {
		return "/quiz/quiz03/pathA";
	}
	
	@RequestMapping("/pathCommon/B")
	public String pathCommonB() {
		return "/quiz/quiz03/pathB";
	}
	*/
	/*
	//4-2)
	@RequestMapping(value = {"/pathA", "/pathCommon/A"})
	public String pathA() {
		return "/quiz/quiz03/pathA";
	}
	
	@RequestMapping(value = {"/pathB", "/pathCommon/B"})
	public String pathB() {
		return "/quiz/quiz03/pathB";
	}
	*/
}

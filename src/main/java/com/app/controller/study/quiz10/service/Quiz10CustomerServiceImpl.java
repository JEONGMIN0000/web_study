package com.app.controller.study.quiz10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.controller.study.quiz10.dao.Quiz10CustomerDAO;
import com.app.controller.study.quiz10.dto.Quiz10Customer;

@Service
public class Quiz10CustomerServiceImpl implements Quiz10CustomerService {

	@Autowired  //의존성 주입 어노테이션 	
	Quiz10CustomerDAO quiz10CustomerDAO;

	@Override
	public int saveCustomer(Quiz10Customer quiz10Customer) {
		
		//컨트롤러 -> (Quiz10Customer  객체 - 저장해줘!)
		//받은 데이터로 저장 -> DAO 요청
		
		System.out.println("CustomerService 호출 됨");
		
		int result = quiz10CustomerDAO.saveCustomer(quiz10Customer);
		
		return result;
	}

}

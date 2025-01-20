package com.app.controller.study.quiz10.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.controller.study.quiz10.dto.Quiz10Customer;


@Repository
public class Quiz10CustomerDAOImpl implements Quiz10CustomerDAO {

	@Override
	public int saveCustomer(Quiz10Customer quiz10Customer) {
		// TODO Auto-generated method stub
		
		System.out.println("CustomerDAO 호출 됨");
		
		return 0;
	}

}

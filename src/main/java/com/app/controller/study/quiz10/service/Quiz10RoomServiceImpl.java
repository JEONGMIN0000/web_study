package com.app.controller.study.quiz10.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.controller.study.quiz10.dao.Quiz10RoomDAO;
import com.app.controller.study.quiz10.dto.Quiz10Room;


@Service
public class Quiz10RoomServiceImpl implements Quiz10RoomService {

	@Autowired  //의존성 주입 어노테이션 	
	Quiz10RoomDAO quiz10RoomDAO;


	@Override
	public int saveRoom(Quiz10Room quiz10Room) {
		
		//컨트롤러 -> (Quiz10Customer  객체 - 저장해줘!)
		//받은 데이터로 저장 -> DAO 요청
		
		System.out.println("RoomService 호출 됨");
		
		int result = quiz10RoomDAO.saveRoom(quiz10Room);
		
		return result;
	}

}

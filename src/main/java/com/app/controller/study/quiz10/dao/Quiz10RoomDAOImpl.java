package com.app.controller.study.quiz10.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.controller.study.quiz10.dto.Quiz10Room;

@Repository
public class Quiz10RoomDAOImpl implements Quiz10RoomDAO {

	@Override
	public int saveRoom(Quiz10Room quiz10Room) {
		
		System.out.println("RoomDAO 호출 됨");
		
		return 0;
	}

}

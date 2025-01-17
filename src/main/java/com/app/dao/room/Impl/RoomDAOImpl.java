package com.app.dao.room.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.dao.room.RoomDAO;
import com.app.dto.room.Room;

//Data 읽어오는 역할 DB 접근 역할 DAO, Repository 
//APIServiceRepository
@Repository
public class RoomDAOImpl implements RoomDAO{

	@Override
	public List<Room> findRoomList() {
		
		//db 연결 조회
		
		return null;
	}

}

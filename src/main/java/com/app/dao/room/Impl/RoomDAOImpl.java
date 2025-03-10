package com.app.dao.room.Impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.dao.room.RoomDAO;
import com.app.dto.room.Room;

import lombok.extern.slf4j.Slf4j;

//Data 읽어오는 역할 DB접근역할   DAO, Repository
// APIServiceRepository
@Slf4j
@Repository   //Bean 등록 Annotation
public class RoomDAOImpl implements RoomDAO {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<Room> findRoomList() {
		
		System.out.println("RoomDAO 호출 됨");
		//db 연결 조회
		List<Room> roomList = sqlSessionTemplate.selectList("room_mapper.findRoomList");
		
		return roomList;
	}

	@Override
	public int saveRoom(Room room) {
		// TODO Auto-generated method stub
		// DB 에 전달받은 Room 객체에 들어있는 데이터를 잘~ 저장 ~
		
		int result = sqlSessionTemplate.insert("room_mapper.saveRoom",room);
		
		return result;
	}

	@Override
	public Room findRoomByRoomId(int roomId) {
		
		Room room = null;
		try {
			room = sqlSessionTemplate.selectOne("room_mapper.findRoomByRoomId", roomId);	
		} catch (Exception e) {
			log.warn(e.getMessage());
			log.error(e.getMessage());
		}
		
		return room;
	}
	
	@Override
	public int removeRoom(int roomId) {
		
		int result = sqlSessionTemplate.delete("room_mapper.removeRoom", roomId);
		return result;
	}

	@Override
	public int modifyRoom(Room room) {
		
		int result = sqlSessionTemplate.update("room_mapper.modifyRoom", room);
		return result;
	}


}

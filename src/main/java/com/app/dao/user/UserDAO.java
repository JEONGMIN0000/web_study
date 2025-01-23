package com.app.dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.dao.user.UserDAO;
import com.app.dto.user.User;
import com.app.dto.user.UserSearchCondition;

@Repository
public interface UserDAO {

	int saveUser(User user);
	
	List<User> findUserList();
	
	User findUserById(String id);

	public User checkUserLogin(User user);
	
	int modifyUser(User user);
	
	public List<User> findUserListBySearchCondition(UserSearchCondition userSearchCondition);

}

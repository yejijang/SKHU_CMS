package com.sofCap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sofCap.Dao.UserDao;
import com.sofCap.dto.UserDto;

@Service
public class UserServiceImpl {

	@Autowired UserDao userDao;

	public UserDto login(String login_id, String password) {
		UserDto userDto = userDao.findByLoginId(login_id);
		if(userDto == null) {
			return null;
		}
		String pw = password;
		if(!userDto.getPassword().equals(pw)) {
			return null;
		}
		return userDto;
	}


}
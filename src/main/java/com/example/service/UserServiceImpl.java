package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.UserDao;
import com.example.vo.UserVo;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao1;
	
	@Override
	public int insertUser(UserVo user) {
		return this.userDao1.create(user);
	}

	@Override
	public UserVo selectUser(String userid) {
		return this.userDao1.read(userid);
	}

	@Override
	public List<UserVo> selectAllUsers() {
		return this.userDao1.readAll();
	}

	@Override
	public int updateUser(UserVo user) {
		return this.userDao1.update(user);
	}

	@Override
	public int deleteUser(String userid) {
		return this.userDao1.delete(userid);
	}

}


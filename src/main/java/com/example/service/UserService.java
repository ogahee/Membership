package com.example.service;

import java.util.List;

import com.example.vo.UserVo;

public interface UserService {
	int insertUser(UserVo user);
	UserVo selectUser(String userid);
	List<UserVo> selectAllUsers();
	int updateUser(UserVo user);
	int deleteUser(String userid);
}

package com.example.model;

import java.util.List;

import com.example.vo.UserVo;

public interface UserDao {
	int create(UserVo user);
	UserVo read(String userid);
	List<UserVo> readAll();
	int update(UserVo user);
	int delete(String userid);
}

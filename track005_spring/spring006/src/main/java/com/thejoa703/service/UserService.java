package com.thejoa703.service;

import java.util.List;

import com.thejoa703.dto.UserDto;

public interface UserService {
	public int insert(UserDto dto);
	public int update(UserDto dto);
	public int delete(UserDto dto);
	public List<UserDto> selectAll();
	public UserDto select(int appUserId);
	public int selectlogin(UserDto dto);
	public UserDto selectEmail(String email);

}

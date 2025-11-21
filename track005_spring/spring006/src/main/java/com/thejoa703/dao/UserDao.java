package com.thejoa703.dao;

import java.util.List;

import com.thejoa703.dto.UserDto;

@MbtiDao
public interface UserDao {
	public int insert(UserDto dto);
	public int update(UserDto dto);
	public int delete(UserDto dto);
	public List<UserDto> selectAll();
	public UserDto select(int appUserId);
	public int selectLogin(UserDto dto);
	public UserDto selectEmail(String email);
	
	public int insert2(UserDto dto);
	
	public int updateAdmin(UserDto dto);
	public int deleteAdmin(UserDto dto);
	
	public int iddouble(String email);
	
}

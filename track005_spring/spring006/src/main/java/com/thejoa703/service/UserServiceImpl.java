package com.thejoa703.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thejoa703.dto.UserDto;
import com.thejoa703.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	@Autowired UserDao dao;
	@Override public int insert(UserDto dto) {return dao.insert(dto);}
	@Override public int update(UserDto dto) {return dao.update(dto);}
	@Override public int delete(UserDto dto) {return dao.delete(dto);}
	@Override public List<UserDto> selectAll() { return dao.selectAll();}
	@Override public UserDto select(int appUserId) {return dao.select(appUserId);}
	@Override public UserDto selectEmail(String email) {return dao.selectEmail(email);}
	@Override public int selectLogin(UserDto dto) {return dao.selectLogin(dto);}
	@Override public int iddouble(String email) {return dao.iddouble(email);}
	@Override public int updateAdmin(UserDto dto) {return dao.updateAdmin(dto);}
	@Override public int deleteAdmin(UserDto dto) {return dao.deleteAdmin(dto);}
}

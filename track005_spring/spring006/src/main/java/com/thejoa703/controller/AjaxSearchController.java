package com.thejoa703.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thejoa703.dto.UserDto;
import com.thejoa703.service.UserService;

// @Controller // 처리 + 화면
@RestController // 처리 + 나온 값

public class AjaxSearchController {
	
	@Autowired UserService service;
	
	@RequestMapping("/iddouble")
	public Map<String, Object> iddouble(@RequestParam String email){
		Map<String, Object> result = new HashMap<>();
		result.put("cnt", service.iddouble(email));
		return result;
	}
	@RequestMapping("/selectAll")
	public List<UserDto> selectAll(){
		return service.selectAll();
	}
	@RequestMapping("/select")
	public Map<String, Object> select(@RequestParam int appUserId){
		Map<String, Object> result = new HashMap<>();
		result.put("result", service.select(appUserId));
		return result;
	}
	@RequestMapping("/updateAdmin")
	public Map<String, Object> updateAdmin(@RequestParam int appUserId, @RequestParam int mbtiType){
		UserDto dto = new UserDto();
		dto.setAppUserId(appUserId); dto.setMbtiTypeId(mbtiType);
		Map<String, Object> result = new HashMap<>();
		result.put("result", service.updateAdmin(dto));
		return result;
	}
	@RequestMapping("/deleteAdmin")
	public Map<String, Object> deleteAdmin(@RequestParam int appUserId){
		Map<String, Object> result = new HashMap<>();
		UserDto dto = new UserDto(); dto.setAppUserId(appUserId);
		result.put("result", service.deleteAdmin(dto));
		return result;
	}
}

package com.thejoa703.dto;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class UserDto {
	private int appUserId;
	private String email;
	private String password;
	private int mbtiTypeId;
	private LocalDateTime createdAt;
}

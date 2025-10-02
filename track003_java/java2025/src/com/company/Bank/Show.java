package com.company.Bank;

import java.util.ArrayList;
import java.util.List;

public class Show implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
		// TODO Auto-generated method stub
		UserInfo info = users.get(find);
		System.out.println("ID > " + info.getId());
		System.out.println("PASS > " + info.getPass());
		System.out.println("BALANCE > " + info.getBalance());
		return 0;
	}

	@Override
	public UserInfo exec(List<UserInfo> users) {
		// TODO Auto-generated method stub
		// 변수
		// 입력
		// 처리
		// 출력
		return null;
	}

	
}

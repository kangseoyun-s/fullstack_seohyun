package com.company.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Delete implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
		// TODO Auto-generated method stub
		UserInfo u = users.remove(find);
		System.out.println("정보를 삭제했습니다. > " + u);
		return 0;
	}

	@Override
	public UserInfo exec(List<UserInfo> users) {
		// TODO Auto-generated method stub
		
		return null;
		}
	
}
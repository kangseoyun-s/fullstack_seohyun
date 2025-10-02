package com.company.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Add implements BankController {
	@Override
	public int exec(List<UserInfo> users, int find) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[1] 아이디 입력 > "); String id = scanner.next();
		System.out.println("[2] 비밀 번호 입력 > "); String pass = scanner.next();
		System.out.println("[3] 잔액 입력 > "); double balance = scanner.nextDouble();
		UserInfo u= new UserInfo(id, pass, balance);
		users.add(u);
		System.out.println("사용자 추가 완료" );
		return 1;
	}

	@Override
	public UserInfo exec(List<UserInfo> users) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("[1] 아이디 입력 > "); String id = scanner.next();
		System.out.println("[2] 비밀 번호 입력 > "); String pass = scanner.next();
		System.out.println("[3] 잔액 입력 > "); double balance = scanner.nextDouble();
		UserInfo u= new UserInfo(id, pass, balance);
		users.add(u);
		System.out.println("사용자 추가 완료" );
		return u;
	}

}
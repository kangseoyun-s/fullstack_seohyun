package com.company.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login implements BankController {
	
	@Override
	public int exec(List<UserInfo> users, int find) {
		// TODO Auto-generated method stub
		String id, pass ="";
		Scanner scanner = new Scanner(System.in);
		// 입력 - 아이디와 비밀번호 입력받기
		System.out.println("[1] 아이디 > "); String tempid = scanner.next();
		System.out.println("[2] 비밀 번호 > "); String temppass = scanner.next();
		// 처리 - users에서 아이디와 비밀 번호가 맞는 유저번호 찾기 - 찾았으면 나오기 / 못찾았으면 -1 
		// 내가 입력받은 아이디와 유저 1번째 users.get(1)의 아이디
		for(int i=0; i<users.size(); i++) {
		if(tempid.equals(users.get(i).getId())&&temppass.equals(users.get(i).getPass())) {
		// 출력
		return i;
		}
	}
		return -1;
}
	@Override
	public UserInfo exec(List<UserInfo> users) {
		// TODO Auto-generated method stub
		String id, pass ="";
		Scanner scanner = new Scanner(System.in);
		// 입력 - 아이디와 비밀번호 입력받기
		System.out.println("[1] 아이디 > "); String tempid = scanner.next();
		System.out.println("[2] 비밀 번호 > "); String temppass = scanner.next();
		// 처리 - users에서 아이디와 비밀 번호가 맞는 유저번호 찾기 - 찾았으면 나오기 / 못찾았으면 -1 
		// 내가 입력받은 아이디와 유저 1번째 users.get(1)의 아이디
		for(int i=0; i<users.size(); i++) {
		if(tempid.equals(users.get(i).getId())&&temppass.equals(users.get(i).getPass())) {
		// 출력
		
		}
	}
		return null;
	}

}
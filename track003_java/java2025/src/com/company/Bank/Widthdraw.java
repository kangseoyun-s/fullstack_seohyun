package com.company.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Widthdraw implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
		// TODO Auto-generated method stub
		// 변수
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.println("출금할 금액 > ");
		double balance = scanner.nextDouble();
		// 처리
		UserInfo u = users.get(find);
		u.setBalance(u.getBalance()-balance);
		// 출력
		if(u.getBalance()-balance<0) {System.out.println("잔액 부족입니다.");}
		else {System.out.println("출금이 완료되었습니다. > " + u);}
		return 0;
	}

	@Override
	public UserInfo exec(List<UserInfo> users) {
		// TODO Auto-generated method stub
		return null;
	}



}

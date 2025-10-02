package com.company.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deposit implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입금할 금액 > "); double balance = scanner.nextDouble();
		UserInfo u = users.get(find);
		u.setBalance(u.getBalance()+balance);

		System.out.println("입금이 완료되었습니다. > " + u);
		return 0;
	}

	@Override
	public UserInfo exec(List<UserInfo> users) {
		// TODO Auto-generated method stub
		return null;
	}
}
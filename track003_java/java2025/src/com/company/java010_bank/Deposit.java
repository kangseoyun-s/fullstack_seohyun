package com.company.java010_bank;

import java.util.Scanner;

public class Deposit {
	private UserInfo userinfo;

	public Deposit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Deposit(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}

	public UserInfo getUserinfo() {
		return userinfo;
	}

	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}

	public void exec() {
		// setter / getter 이용해서 사용자에게 입금받기
		int find = -1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("[1] 아이디 입력 > ");
		this.userinfo.setId(scanner.next());
		System.out.println("[2] 비밀 번호 입력 > ");
		this.userinfo.setPass(scanner.next());
	    System.out.print("입금: ");
	    this.userinfo.setBalance(scanner.nextDouble());
	    if (find != -1) {
	        System.out.print("입금: ");
	        double balance2 = scanner.nextDouble();
	        double[] balance = null;
			balance[find] += balance2;
	        int depositCount = 0;
			depositCount++;
	        double totalDeposit = balance2;
        System.out.println("입금이 완료되었습니다.");
	}
	    else {
	    	System.out.println("사용자 정보를 확인해 주세요.");
	    }
}
}

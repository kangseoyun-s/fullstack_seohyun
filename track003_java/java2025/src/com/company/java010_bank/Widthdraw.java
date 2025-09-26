package com.company.java010_bank;

import java.util.Scanner;

public class Widthdraw {
	UserInfo userinfo;

	public Widthdraw() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Widthdraw(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}
	public void exec() {
		int find = -1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("[1] 아이디 입력 > ");
		this.userinfo.setId(scanner.next());
		System.out.println("[2] 비밀 번호 입력 > ");
		this.userinfo.setPass(scanner.next());
	    System.out.print("출금: ");
	    this.userinfo.setBalance(scanner.nextDouble());
        
	}

}

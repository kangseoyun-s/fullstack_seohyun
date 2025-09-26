package com.company.java010_bank;

import java.util.Scanner;

//1. 클래스 부품객체
//2. 상태와 행위
public class Bank_Main {
	// 상태: 멤버변수
	UserInfo userinfo;
	Add add;
	Show show;
	Deposit deposit ;
	Widthdraw widthdraw ;
	Delete delete ;
	Login login ;
	//행위: 멤버함수
	public Bank_Main() {
		this.userinfo = new UserInfo();
		this.add = new Add(this.userinfo);
		this.show = new Show(this.userinfo);
		this.deposit = new Deposit(this.userinfo);
		this.widthdraw = new Widthdraw(this.userinfo);
		this.delete = new Delete(this.userinfo);
		this.login = new Login(this.userinfo);
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		int num= -1;
		while(num!=9) {
			System.out.println(this.userinfo + "\t" + System.identityHashCode(this.userinfo));
			System.out.print("\n\n🌟💰 WELCOME TO BANK SYSTEM 💰🌟\n" + 
		             "\n[1] ➕ 계좌 추가" + "\n[2] 🔍 계좌 조회" + "\n[3] 💵 입금하기" + "\n[4] 💸 출금하기" + "\n[5] 🗑️ 계좌 삭제  "
		             +"\n\n👉 번호를 선택하세요:");
		    num = scanner.nextInt();
			switch (num) {
			case 1: this.add.exec(); break;
			case 2: this.show.exec(); break;
			}
		}
	}
	
	public static void main(String[] args) {
		Bank_Main bank = new Bank_Main();
		bank.run();
	}
}

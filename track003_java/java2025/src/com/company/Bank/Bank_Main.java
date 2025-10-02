package com.company.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank_Main {
	private List<UserInfo> users; // add, get, size, remove, contains
	private BankController[] controller;

	public Bank_Main() {
		users = new ArrayList<>();
		controller = new BankController[] { new Login(), new Add(), new Show(), new Deposit(), new Widthdraw(), 
				new Delete() };
	}

	public void menu() {
		// 변수
		Scanner scanner = new Scanner(System.in);
		int num = -1;
		while (num != 9) {
			System.out.println(users);
			System.out.print("\n\n🌟💰 WELCOME TO BANK SYSTEM 💰🌟\n" + "\n[1] ➕ 계좌 추가" + "\n[2] 🔍 계좌 조회"
					+ "\n[3] 💵 입금하기" + "\n[4] 💸 출금하기" + "\n[5] 🗑️ 계좌 삭제  " + "\n\n👉 번호를 선택하세요:");
			num = scanner.nextInt();
			int find=1;  // 찾은 유저번호 or 0 로그인 or 1 계좌추가
			// add, get(유저번호), size, remove(유저번호), contains()
			// Add     : users.add(   new  UserInfo("id","pw",1) );	
			// Show    : users.get(유저번호)	
			// Deposit : users.get(유저번호)
			//1.  parameter  - 넘겨받아야할 데이터 users,  유저번호 
			//2.  리턴값       - 위의 사용방법에서 show, deposit부분등에서 유저번호가 필요한데....... 
			//				    로그인시 찾은 유저의 번호를 넘겨주려고.
			//3.   int (찾은 유저번호)   exec(users, index);
 			if(num >=2 && num <=5) {  
 				find =controller[0].exec(users , 0 );
 				if(find == -1) {System.out.println("유저정보를 확인해 주세요~!"); continue;}
 			}
 			controller[num].exec(users , find);  // 찾은 유저번호 or 0 로그인 or 1 계좌추가
			/*if (num == 1) {
				controller[1].exec(users);
			} else {
				controller[0].exec(users);
				// 입력 + 처리
				switch (num) {
				case 2:
					System.out.println("계좌 조회 기능입니다.");
					controller[2].exec(users);
					break;
				case 3:
					System.out.println("입금 기능입니다.");
					controller[3].exec(users);
					break;
				case 4:
					System.out.println("출금 기능입니다.");
					controller[4].exec(users);
					break;
				case 5:
					System.out.println("삭제 기능입니다.");
					controller[5].exec(users);
					break;
				}
				
		}*/
	}
}
	public static void main(String[] args) {
		new Bank_Main().menu();
	}

}

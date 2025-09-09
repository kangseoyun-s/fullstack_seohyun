package com.company.java005_ex;

import java.util.Scanner;

public class Bank_Ver1 {
	public static void main(String[] args) {
		// 변수
		int num=0 ; String id=null, pass = null; double balance=0;
		Scanner scanner = new Scanner(System.in);
		// 입력 + 처리 + 출력
		for (;;) {
			System.out.println("======BANK======\n*" + " 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력 >>>");
			num = scanner.nextInt();
			if (num == 9) {
				System.out.println("ATM을 종료합니다.");
				break;
			}
			switch (num) {
			case 1:
				System.out.println("1을 입력하면 추가 기능입니다.");
				// 아이디 입력 > _입력받기
				// 비밀번호 입력 > _입력받기
				// 잔액 입력 > _입력받기
				System.out.print("아이디 입력: ");
				id = scanner.next();
				System.out.print("비밀번호 입력: ");
				pass = scanner.next();
				System.out.print("잔액 입력: ");
				balance = scanner.nextDouble();
				break;
			case 2: {
				System.out.println("2를 입력하면 조회 기능입니다.");
				// 사용자에게 임시 아이디와 임시 비번 입력받기
				// 아이디와 비번이 맞다면 사용자 정보 출력
				// 아니라면 사용자 정보를 다시 확인해 주세요
				String tempid, temppass;
				System.out.print("아이디 입력 > ");
				tempid = scanner.next();
				System.out.print("비밀 번호 입력 > ");
				temppass = scanner.next();
				System.out.println("==계좌 조회");
				if (id.equals(tempid) && pass.equals(temppass)) {
					System.out.println("ID:" + id);
					System.out.println("PASS:" + pass);
					System.out.println("잔액:" + balance);
				} else {
					System.out.println("사용자 정보를 확인해 주세요.");
				}
			}
				break;
			case 3: {
				System.out.println("3을 입력하면 입금 기능입니다.");
				String tempid, temppass;
				double balance2;
				System.out.print("아이디 입력 > ");
				tempid = scanner.next();
				System.out.print("비밀 번호 입력 > ");
				temppass = scanner.next();
				if (id.equals(tempid) && pass.equals(temppass)) {
					System.out.print("입금:");
					balance2 = scanner.nextDouble();
					System.out.println("==입금 완료");
					System.out.println("잔액:" + (balance += balance2));
				} else {
					System.out.println("사용자 정보를 확인해 주세요.");
				}
			}
				break;
			case 4: {
				System.out.println("4를 입력하면 출금 기능입니다.");
				String tempid, temppass;
				double balance3;
				System.out.print("아이디 입력 > ");
				tempid = scanner.next();
				System.out.print("비밀 번호 입력 > ");
				temppass = scanner.next();
				if (id.equals(tempid) && pass.equals(temppass)) {
					System.out.print("출금:");
					balance3 = scanner.nextDouble();
					System.out.println("==출금 완료");
					System.out.println("잔액:" + (balance -= balance3));
				} else {
					System.out.println("사용자 정보를 확인해 주세요.");
				}
			}
				break;
			case 5: {
				System.out.println("5를 입력하면 삭제 기능입니다.");
				String tempid, temppass, delete;
				System.out.print("아이디 입력 > ");
				tempid = scanner.next();
				System.out.print("비밀 번호 입력 > ");
				temppass = scanner.next();
				if (id.equals(tempid) && pass.equals(temppass)) {
					System.out.println("계좌를 삭제하시겠습니까? (Y/N)");
					delete = scanner.next();
				} else {
					System.out.println("사용자 정보를 확인해 주세요.");
				}
				break;
			}

			}
		}
	}
}




/*step1 무한 반복으로 메뉴판 만들기
  for(;;){//1-1. 무한반복 
          // 1-2 빠져나올 조건 9
          // 1-3 입력받은 번호가 switch or if 
          1을 입력하면 추가 기능입니다.
          2를 입력하면 조회 기능입니다.
          3ㅇ
         
           */
       
  
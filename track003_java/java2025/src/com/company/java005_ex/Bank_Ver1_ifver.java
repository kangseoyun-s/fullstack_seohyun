package com.company.java005_ex;

import java.util.Scanner;

public class Bank_Ver1_ifver {
	public static void main(String[] args) {
		// 변수
		int num=0 ;
		Scanner scanner = new Scanner(System.in);
		// 입력 + 처리 + 출력
		for (;;) {
			System.out.println("======BANK======\n*" + " 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력 >>>");
			num = scanner.nextInt();
			if (num == 9) {
				System.out.println("ATM을 종료합니다.");
				break;
			} else if (num == 1) {
				System.out.println("1. 추가 기능입니다.");
			} else if (num == 2) {
				System.out.println("2. 조회 기능입니다.");
			} else if (num == 3) {
				System.out.println("3. 입금입니다.");
			} else if (num == 4) {
				System.out.println("4. 출금입니다.");
			} else if (num == 5) {
				System.out.println("4. 삭제입니다.");
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
       
  
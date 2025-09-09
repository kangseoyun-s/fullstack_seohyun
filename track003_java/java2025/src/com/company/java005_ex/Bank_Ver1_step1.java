package com.company.java005_ex;

import java.util.Scanner;

public class Bank_Ver1_step1 {
	public static void main(String[] args) {
		// 변수
		int num=0 ;
		Scanner scanner = new Scanner(System.in);
		// 입력 + 처리 + 출력
		for (;;) {
			System.out.println("======BANK======\n*" + 
		" 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력 >>>");
			num = scanner.nextInt();
			if (num == 9) {System.out.println("ATM을 종료합니다."); break;}
			switch (num) {
			case 1:
				System.out.println("1을 입력하면 추가 기능입니다."); break;
			case 2:
				System.out.println("2를 입력하면 조회 기능입니다."); break;
			case 3:
				System.out.println("3을 입력하면 입금 기능입니다."); break;
			case 4:
				System.out.println("4를 입력하면 출금 기능입니다."); break;
			case 5:
				System.out.println("5를 입력하면 삭제 기능입니다."); break;
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
       
  
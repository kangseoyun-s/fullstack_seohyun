package com.company.java005_ex;

import java.util.Arrays;
import java.util.Scanner;

public class Bank_ver2 {
	public static void main(String[] args) {
		// 변수
		String[] id = new String[3];
		String[] pass = new String[3];
		double[] balance = new double[3];
		int num = -1;
		Scanner scanner = new Scanner(System.in);
		// 입력 + 처리 + 출력
		while (num != 9) {// 9가 아니라면 무한 반복
			System.out.println(Arrays.toString(id));
			System.out.println(Arrays.toString(pass));
			System.out.println(Arrays.toString(balance));
			System.out.println("======BANK======\n*" + " 1.추가\n* 2.조회\n* 3.입금\n* 4.출금\n* 5.삭제\n* 9.종료\n입력 >>>");
			num = scanner.nextInt();
			if (num == 1) {
				// 1-1. 빈칸 확인
				// ver-1 if(0번이 빈칸이라면){find=0} if(1번이 빈칸이라면) {find=1}
				// ver-2 if(0번이 null이라면){find=0} if(1번이 null이라면) {find=1}
				// ver -3 if(id[0]=null){find=0;} if(id[1]=null) {find=1;}
				// ver-4 찾았으면 나오기 추가
				int find = -1;
				for (int i = 0; i < id.length; i++) {
					if (id[i] == null) {
						find = i;
						break;
					}
				}
				// 1-2.유저 계정에 입력 받기
				System.out.print("아이디 입력 > ");
				id[find] = scanner.next();
				System.out.print("비밀 번호 입력 > ");
				pass[find] = scanner.next();
				System.out.print("금액 > ");
				balance[find] = scanner.nextDouble();
			} else if (num == 2 || num == 3 || num == 4 || num == 5) {
				int find = -1; String tempid=""; String temppass="";
				System.out.println("아이디 입력 > ");
				tempid = scanner.next();
				System.out.println("비밀 번호 입력 > ");
				temppass = scanner.next();
				for (int i = 0; i < id.length; i++) {
					if (tempid.equals(id[i]) && temppass.equals(pass[i])) {
						find = i;
						continue;
					}
				switch(num) {
				case 2: System.out.println("\n아이디" + id + "\n비밀번호" + pass + "\n잔액" + balance); break;
				case 3: System.out.println("입금할 금액 > "); 
				}
				}
				if(find==-1) {System.out.println("아이디와 비밀번호를 확인해 주세요!"); continue;}
			} else {
				System.out.println("메뉴를 확인해 주세요");
			}
		}
	}

}

// tempid==id[0] pass==pass[0] user=0
// id==id[0] pass==pass[0] user=1
// if(id==id[i] && pass==pass[0]) {find=i; break;}
// for(int i=0; i<id.length;i++)
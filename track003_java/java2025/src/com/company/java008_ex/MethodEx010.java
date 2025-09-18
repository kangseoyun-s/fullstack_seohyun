package com.company.java008_ex;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx010 {
	public static void name(String[][] pets) {
		Scanner scanner = new Scanner(System.in);
		String tempname = "";
		String result = "❌ 등록 정보를 확인해주세요!";
		System.out.print("🐶 동물 이름을 입력해 주세요. > ");
		tempname = scanner.next();
		int find = -1;
		for (int i = 0; i < pets.length; i++) {
			if (tempname.equals(pets[i][0])) {
				find = i;
				break;
			}
		}
		if (find != -1) {
			System.out.print("✅\t" + tempname + "는\t" + pets[find][2] + "\t" + "예약이 되어 있어요.\n");
		} else {
			System.out.println("❌ 등록 정보를 확인해주세요!");
		}

	}

	public static void change(String[][] pets) {
		Scanner scanner = new Scanner(System.in);
		String tempname="";
		String tempphone ="";
		String newpurpose ="";
		String result="❌ 등록 정보를 확인해주세요!" ;
		System.out.print("🐱 동물 이름을 입력해 주세요. > ");
		tempname = scanner.next();
		System.out.print("📞 보호자 전화번호를 입력해 주세요. > ");
		tempphone = scanner.next();
		int find = -1;
		for (int i = 0; i < pets.length; i++) {
	         if(tempname.equals(pets[i][0]) && tempphone.equals(pets[i][1])) {
	            System.out.print("🩺 변경하실 진료 항목을 입력해 주세요. > ");
	            newpurpose = scanner.next();
	            pets [i][2] = newpurpose ;
	            find =i;
	            break;
			}
	     }		
		if (find != -1) {
			System.out.println("✅ 예약 정보 확인 :" + "[" + tempname + "," + pets[find][1] + "," + pets[find][2] + "]\n");
		}else {
			System.out.println("❌ 등록 정보를 확인해주세요!");
		}
	}
	public static void main(String[] args) {
		String[][] pets = {
			    {"콩이", "010-1234-5678", "예방접종"}, //00 01 02
			    {"초코", "010-2345-6789", "건강검진"}, //10 11 12
			    {"보리", "010-3456-7890", "치아관리"}  //20 21 22
			};
		Scanner scanner = new Scanner(System.in);
		int num=0;
		String name ="";
		String phone ="";
		String purpose ="";
		for(;;) {
			System.out.print("🐾 동물 병원 시스템 메뉴\n"
					+"1. 진료 항목 조회\n"
					+"2. 진료 항목 변경\n"
					+"3. 종료\n"
					+"👉 메뉴 번호를 선택해주세요:");
			num = scanner.nextInt();
			if(num==3){System.out.println("👋 시스템을 종료합니다. 안녕히 가세요!"); break;} 
			else if(num==1) {name(pets); continue;}
			else if(num==2) {change(pets); continue;}
		}
		
	}

}

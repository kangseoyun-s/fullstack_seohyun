package com.company.java005_ex;

import java.util.Scanner;

public class ForEx007 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적 처리 프로그램입니다.");
		int k=0, m=0, e=0, t=0 ;
		double a=0 ;
		String l ;
		String h ;
		String s ="";
		String j ;
		System.out.println("학번 입력 >");
		s = scanner.next();
		for (;;) {
			if (0 <= k && k <= 100) {
			System.out.println("국어 점수 입력 >");
			k = scanner.nextInt();
			{
				continue;
			 }
			}
		    if (0 <= m && m <= 100) {
			System.out.println("수학 점수 입력 >");
			m = scanner.nextInt();
		     
			continue;
			}
		    if (0 <= e && e <= 100) {
			System.out.println("영어 점수 입력 >");
			e = scanner.nextInt();
			 
			continue;
			}
		    break;
	}
		t = k + m + e ;
		a = (double)t/3 ;
		if(a>=60 && k>=40 && e>=40 && m>=40) {h="합격";}
		else {h="불합격";}
		// a <60? "불합격" : k<40 
		if(a>=95) {j="장학생";}
		else {j=" ";}
		// j = a < 95? "": "장학생";
		if(a>=90) {l="수";}
		else if (a>=80) {l="우";}
		else if (a>=70) {l="미";}
		else if (a>=60) {l="양";}
		else {l="가";}
		//l = a >=90? "수" : a >=80? "우" : a >=70? "미" : a >=60? "양" : "가"
		System.out.println("==============================================================");
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n","학번","국어","영어","수학","총점","평균","합격 여부","레벨","장학생");
		System.out.println("==============================================================");
		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5s\t%-5s\t%-5s\n", s, k, e, m, t, a, h, l, j );
	}

}

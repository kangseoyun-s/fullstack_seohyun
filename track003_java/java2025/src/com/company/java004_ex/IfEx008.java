package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성적 처리 프로그램입니다.");
		int ko, en, ma, to;
		double av ;
		String num = " "; // 학번
		String ch1 =""; // 장학생
		String ch2 ="불합격"; // 합격 여부
		String le = " "; // 평균
		System.out.println("학번 입력 >"); num = scanner.next();
		System.out.println("국어 점수 입력 >"); ko = scanner.nextInt();
		System.out.println("영어 점수 입력 >"); en = scanner.nextInt();
		System.out.println("수학 점수 입력 >"); ma = scanner.nextInt();
		
		//1. 총점 구하기
		to = ko + en + ma;
		//2. 평균 구하기
		av = (double)to/3;
		//3. 평균이 60점이상이고  각과목이 40점 미만이면 아니라면 합격/ 아니면 불합격
		if(av>=60 && ko >=40 && en >=40 && ma>=40) {ch2="합격";}
		//4. 평균이 95점이상이면 장학생
		if(av>=95) {ch1="장학생";}
		//5. 평균이  90점이상이면 수, 80점이상이면 우, 70점이상이면 미, 60점이상이면 양, 아니라면 가 
		if(av>=90) {le="수";}
		else if(av>=80) {le="우";}
		else if(av>=70) {le="미";}
		else if(av>=60) {le="양";}
		else {le="가";}
		
		System.out.println("====================================================================");
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n","학번","국어","영어","수학","총점","평균","합격 여부","레벨","장학생");
		System.out.println("====================================================================");
		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5s\t%-5s\t%-5s\n", num, ko, en, ma, to, av, ch2, le, ch1);
		
		// 출력  숫자   연산자  숫자 =
		//ch2 = av < 60 ? "불합격" : ko >=40 && en >=40 && ma>=40 ? "합격: "";
		//ch1 = av<95? "-" : "장학생";
		//le = av >=90? "수" :
		//     av >=80? "우" :
		//     av >=70? "미" :
		//     av >=60? "양" : "가";
	}

}



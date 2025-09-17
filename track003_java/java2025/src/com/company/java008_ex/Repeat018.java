package com.company.java008_ex;

public class Repeat018 {
	public static void dog() {System.out.println("멍멍");}
	public static void disp(int a, char ch) {for(int i=0; i<a; i++)System.out.print(ch);}
	public static char stdAvg(int a) {return a>=90? 'A': a>=80? 'B': a>=70? 'C' : 'D';}
	public static void main(String[] args) {
		System.out.println("🐶 강아지가 등장합니다!");
		dog();
		
		System.out.println("\n🎯 강아지가 시험을 봤습니다. 점수를 공개합니다!");
		disp(7,'*');
		
		System.out.println("\n📊 평가 결과는?");
		System.out.println("당신의 평균은? " + stdAvg(88));
	}

}

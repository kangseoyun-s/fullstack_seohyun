package com.company.java005;

public class Repeat001 {
	public static void main(String[] args) {
		//step1
		System.out.println("step1");
		System.out.print(1+"\t"); // 복사할 구문 > {  }
		System.out.print(2+"\t"); // ctrl + c , ctrl + v 2번 > {구문}
		System.out.print(3+"\t"); // 안에 숫자 2,3 > {구문 변수}
		// for(시작, 종료, 변화) {구문}
		
		//step2
		System.out.println("\nstep2"); // {} {변수} for(시작; 종료; 변화)
		for(int i=1; i<=3; i++){
			System.out.print(i+"\t");
		}
		
		//step3
		System.out.println("\n\nstep3");
		// 1~5
		for(int i=1; i<=5; i++){ System.out.print(i+"\t");
		System.out.println();
		// 11~20
		for(int i1=11; i1<=20; i1++){System.out.print(i1+"\t");
		System.out.println();
		// 3~8
		for(int i2=3; i<=8; i++){ System.out.print(i+"\t");
		System.out.println();
		// 1 3 5
		for(int i3=1; i<=5; i=i+2){ System.out.print(i+"\t");
		System.out.println();
		
		//HELLO1 HELLO2 HELLO3
		System.out.println("Hello" +1 +"\t");
		System.out.println("Hello" +2 +"\t");
		System.out.println("Hello" +3 +"\t");
		for(int i4=1; i<=3; i++) {System.out.println(i+"\t");}
		}
		}
	}
  }
}
}
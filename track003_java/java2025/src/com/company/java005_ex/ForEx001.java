package com.company.java005_ex;

import java.util.Scanner;

public class ForEx001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\nq1");
//		System.out.print(1 +"\t");
//		System.out.print(2 +"\t");
//		System.out.print(3 +"\t");
//		System.out.print(4 +"\t");
//		System.out.print(5 +"\t");
		for(int i=1; i<=5; i++) {System.out.print(i+"\t");  }
//		System.out.print(5+"\t");
//	    System.out.print(4+"\t");
//		System.out.print(3+"\t");
//		System.out.print(2+"\t");
//		System.out.print(1+"\t");
		System.out.println("\n\nq2");
		for(int i=5; i>=1; i--) {System.out.print(i+"\t"); }
//		System.out.println("JAVA" +1 +"\t");
//		System.out.println("JAVA"+2 +"\t");
//		System.out.println("JAVA"+3 +"\t");
		System.out.println("\n\nq3");
		for(int i=1; i<=3; i++) { System.out.print("JAVA" +i+"\t"); }
//		System.out.println("HAPPY" + 1 +"\t");
//		System.out.println("HAPPY" + 2 +"\t");
//		System.out.println("HAPPY" + 3 +"\t");
		System.out.println("\n\nq4");
		for(int i=3; i>=1; i--) {System.out.print("HAPPY" + i + "\t");}
//		System.out.println(" "+0+"\t");
//		System.out.println(","+1+"\t");
//		System.out.println(","+2+"\t"); //## { } {변수} for(시작; 종료; 변화){}
		System.out.println("\n\nq5");
		for(int i=0; i<=2; i++) {System.out.print((i==0? "": ",")+i+"\t");}
//		System.out.println(" " +0+"\t");
//		System.out.println(","+1+"\t");
//		System.out.println(","+2+"\t");
//		System.out.println(","+",,,중간 생략,,,"+"\t");
//		System.out.println(","+99+"\t");
		System.out.println("\n\nq6");
		for(int i=0; i<=99; i++) {System.out.print((i==0? "":",")+i );}
		System.out.println("\n\nq7");
		for(int i=10; i>=1; i--) {System.out.print((i==10? "":",")+i );}
		System.out.println("\n\nq8");
		for(int i=0; i<=8; i=i+2) {System.out.print((i==0? "":",")+i );}
		System.out.println("\n\nq9");
		for(int i=0; i<=18; i=i+2) {System.out.print((i==0? "":",")+i);}
	}

}

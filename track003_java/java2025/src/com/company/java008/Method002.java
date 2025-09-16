package com.company.java008;

public class Method002 {
	//1. 마법 상자 정의
	// public static 리턴값 메서드명(파라미터){}
	   public static void myint(int a) {System.out.println(a);}
	   
	   public static void ten(int m) {System.out.println(m*10);}
	   
	   public static void add(int m, int b) {System.out.println(m+b);}
	public static void main(String[] args) {
		// 2. 마법 상자 사용
		// public static void myint(int a) {System.out.println(a);
		                      myint(7);
		// public static void ten(int m) {System.out.println(m*10);}
		                      ten(10);
		// public static void add(int m, int b) {System.out.println(m+b);}
		                      add(7,9);
	}

}

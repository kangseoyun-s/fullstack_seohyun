package com.company.java008_ex;

public class MethodEx002 {
	public static void test1(int n) {System.out.println(n);}
	public static void test2(double d) {System.out.println(d);}

	public static void hap(int a, int b) {
		int total = 0;
		for (int i = a; i <= b; i++) {
			total += i;
		} System.out.println(total);
	}
	public static void disp(int c, char ch) {for(int i=0; i<c; i++)System.out.print(ch);}
	public static void main(String[] args) {
		test1(10);
		test2(1.2);
		hap(3,5);
		disp(7, '*');
	}

}

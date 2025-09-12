package com.company.java005_ex;

import java.util.Scanner;

public class Repeat015_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char f ;
		System.out.println("문자 입력 > ");
		f = scanner.next().charAt(0);
		if(f=='m') {System.out.println("mango");}
		if(f=='n') {System.out.println("noodle");}
		if(f=='o') {System.out.println("orange");}
		else {System.out.println("m,n,o가 아닙니다.");}
	}

}

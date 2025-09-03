package com.company.java003;

public class Casting002_char {
	public static void main(String[] args) {
		// 1. 문자 초기화
		// 문자는 저장 시 숫자 / 출력 시 문자
		char ch1 = ' '; //공백이라도 있어야 오류 ㄴ
		char ch2 = '\u0000';
		System.out.println("Step 1:" + ch1 + "\t" + ch2);
		System.out.println("Step 2:" + (int)ch1 + "\t" + (int)ch2);
		// 2. 문자의 연산
		char c = 'A';
		System.out.println("Step 3:" + c + "\t" + (int)c );
		System.out.println("Step 4:" + (c+1));
		//2-1) 'A'+1
		//2-2) int(4byte) = char(65|2byte) + int(1|4byte)
		//2-3)  66
		System.out.println("Step 5:" + (char)(c+1));
		
		// Q1. 대문자A 를 소문자 a로 면환시키기
		System.out.println("hint:" + 'A' + "\t" + (int)'A'); // A=65
		System.out.println("hint:" + 'a' + "\t" + (int)'a'); // a=97
		
		char q1 = 'A';
		char a1 = (char)(q1 + 32) ;
		System.out.println(q1 + "를 소문자로 변환시키려면 +32:"+a1);
		// 3. 문자열
		// 자료형의 분류는 기본형(값)과 참조형(주소)
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
	    System.out.println(System.identityHashCode(str1));
	    System.out.println(System.identityHashCode(str2));
	    System.out.println(System.identityHashCode(str3));
	    
	    System.out.println(str1 == str3); // 주소 값 비교 -false
	    System.out.println(str1.equals(str3)); // 문자열 비교  
	}//end main
}//end class

package com.company.java008;

import java.util.Random;

public class Method003 {
	
	public static String sign() {
		return "🎇『전설의_마법_도끼를_든_초코우유_중독자_용감한_불꽃전사』🎇";
	}

	// System.out.println("Xx"); // Unreachable code
	public static String intro(String name, int level) {
		return "[" + name + "]님은 레벨[" + level + "]";
	}
	//////////////////////////////////////////
	public static void main(String[] args) {
		// public static 리턴값 메서드명(파라미터){}
		// 1. 당신의 이름은? 전설의_마법_도끼를_든_초코우유_중독자_용감한_불꽃전사
		System.out.println("1. 당신의 이름은?" + sign());
		// 2. 이름, 직업, 레벨을 주면 위에서 소개 문장
		// 2. 당신 설명? [홍길동]님은 레벨 [9]
		// public static String intro(String name, int level)
		System.out.println("2. 당신 설명?" + intro("홍길동", 9));
		System.out.println("2. 당신 설명?" + intro(sign(),10));
		// 3. 두 개의 숫자를 넣어 주면 나누기 처리
		// public static double spell(int level){}
		System.out.println("3. 반타작 저주 > " + spell(9));
		// 4. 오늘의 운세 1~100 사이
		// public static int luck()
		System.out.println("4. 오늘의 운세 > " + luck());
	}
    //////////////////////////////////////////
	public static int luck () {
		Random rand = new Random();
		int result = rand.nextInt(100) +1; //0~100보다 작은 숫자 랜덤
		return result;
		
	}
	
	public static double spell(int level){return level/2.0;}
}

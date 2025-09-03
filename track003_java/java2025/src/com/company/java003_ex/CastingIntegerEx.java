package com.company.java003_ex;

public class CastingIntegerEx {
	public static void main(String[] args) {
		// 1) 기본형 / 참조형
		// 2) boolean, 정수형(byte<short,char<int<long), 실수형 (float<double)
		
		
		short sh1 = 1; // sh1 [1] 2byte
		short sh2 = 2; // sh  [2] 2byte
		
		// 산술 연산 시 (+) 자동으로 int로 변환
		// int보다 다 작은 타입들 다 적용됨 - byte, short, char
		short result1 = (short)(sh1+sh2); //1 (int) + 2(int)
		int result2 = sh1 + sh2;
	}

}

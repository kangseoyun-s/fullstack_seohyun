package com.company.java008_ex;

public class MethodEx007 {
	   public static int  add(int x, int y) {return x+y;} // 1
	   
	   public static int  add(byte x, byte y)   {return x+y;}  //2
	   public static int  add(short x, short y) {return x+y;}  //3
//	   public static long add(int  x, int y)    {return x+y;}  //4
	   public static long add(long  x, long y)  {return x+y;}  //5
	   
	   public static void main(String[] args) { 
		   // Q1. 메서드 오버로딩
		   // 유사한 목적으로 작동하는 메서드 이름을 같게 하는 것
		   // Q2. 왜 오류 나는지 이유 작성
		   // 같은 파라미터 타입이라서 같은 메서드라고 판단함
		   // 1,4번의 파라미터의 자료형이 같음
	   }
}

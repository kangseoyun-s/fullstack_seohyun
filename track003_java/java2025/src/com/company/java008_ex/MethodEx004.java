package com.company.java008_ex;


public class MethodEx004 {
	public static int num(int a) {
		return a;
	}

	public static double num2(int a, double b) {
		return a / b;
	}

	public static String mycolor() {
		return "purple";
	}

	public static String jangsu() {
		return "★★★★★";
	}

	public static int add(int a, int b) {
		return (a + b);
	}

	public static String myban(char a) {
		return a == 'A' ? "노랑조" : "주황조";
		// if(a=='A'){return "노랑조"} else{return "주황조"})
	}

	public static String stdId(int a) {
		return "G" + a;
	}

	public static char stdAvg(int a) {
		return a >= 90 ? 'A' : a >= 80 ? 'B' : a >= 70 ? 'C' : 'D';
	}

	public static void main(String[] args) {
//	1. 좋아하는 숫자
	// public static int num(int a) {}
System.out.println("1. 내가 좋아하는 숫자    :" + num(1));    // 1을 결과값으로 줌
	// 	public static float num(float a)
System.out.println("2. 10/3.0을 실수로 표현 :" + num2(10,3.0));  // 3.3333을 결과값으로 줌
    // public static String mycolor() 
System.out.println("3. BEST COLOR        :" + mycolor());      // PURPLE을 결과값으로 줌
	// 	public static String jangsu()
System.out.println("4. 장수돌침대 별이       :" + jangsu());        // ★★★★★을 결과값으로 줌  
	// 	public static int add()
System.out.println("5. 10+20= " + add(10,20));       // 두숫자를 더한값을 결과값으로 줌  
	// 	public static String myban() 
System.out.println("6. 반(노랑조/주황조)=" + myban('B'));  // A이면 노랑조 ,  B이면 주황조
	// public static String stdId()
System.out.println("7. 당신의 학번은?" + stdId(1111));   // G하고 넣어준 학번 나오게
	// public static char stdAvg
System.out.println("8.당신의 평균은?" + stdAvg(88));    
//	// 90점이상이면 A ,  80점이상이면 B ,  70점이상이면 C , 아니라면  D
	}
}

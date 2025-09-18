package com.company.java008_ex;

public class Repeat019 {
	// public static 리턴 메서드명 {처리}
	public static void robot() {
		System.out.println("🤖 탐사 로봇이 기동합니다!");
	}

	public static void start() {
		System.out.println("부우웅...");
	}

	public static void planet() {
		System.out.println("\n🪐 행성 스캔 중...");
	}

	public static void scan(int a, char ch) {
		for (int i = 0; i < a; i++)
			System.out.print(ch);
	}
	public static void signal() {
		System.out.println("\n📡 신호 강도 분석 결과");
	}
	public static String signalGrade(int strength) {
		return strength >= 80 ? "A" : strength >= 70 ? "B" : strength >= 60 ? "C" : "D";
	};

	public static void ba() {
		System.out.println("\n🔋 배터리 충전 중...");
	}

	public static int charge(int current, int added) {
		return (current + added);
	}
	public static void main(String[] args) {
		robot();
		start();
		planet();
		scan(5,'#');
		signal();
		System.out.println("신호 등급: " + signalGrade(65));
		ba();
		System.out.println("충전 완료: " + charge(40, 40) + "%");
	}

}

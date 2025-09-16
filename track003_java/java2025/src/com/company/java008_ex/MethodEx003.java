package com.company.java008_ex;

public class MethodEx003 {
	// public static 리턴값 메서드명(파라미터)
    //printProfile("홍길동", 25, "서울");   // 이름, 나이, 지역 출력
    //checkAge(17);                      // 미성년자 여부 판단
    //repeatMessage("안녕하세요!", 3);     // 메시지 반복 출력
    //drawBox(5, '#');   // 문자로 박스 출력
	public static void printProfile(String name, int age, String land) {
		System.out.printf("이름: %s\n나이: %d\n지역: %s\n", name, age, land);
	}

	public static void checkAge(int age) {
		if (age >= 0 && age < 20) {
			System.out.println("미성년자입니다.");
		} else {
			System.out.println("성인입니다.");
		}
	}

	public static void repeatMessage(String hello, int re) {
		for (int i = 0; i < re; i++) {
			System.out.println(hello);
		}
	}
	public static void drawBox(int n, char ch) {
	for (int k = 0; k < n; k++) {
		for (int i = 0; i < n; i++) {
			System.out.print(ch);
		}System.out.println();
	}}
	public static void main(String[] args) {
		System.out.println("=== 사용자 프로필 ===");
		printProfile("홍길동", 25, "서울");
		System.out.println("===================");
		checkAge(17);
		repeatMessage("안녕하세요!", 3);
		drawBox(5,'#');
	}

}

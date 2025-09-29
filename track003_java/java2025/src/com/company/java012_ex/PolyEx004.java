package com.company.java012_ex;
//Q1. 상속도 그리기
/*
 Object 
  ↑
 Papa {int money = 10000; void sing()}
  ↑
 Son {int money = 1500; void sing()}
 */
//Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드
//  Papa 멤버 변수: int money = 10000; Papa 멤버 함수: void sing()
//  Son 멤버 변수: int money = 1500; Son 멤버 함수: void sing()
class Papa extends Object {
	int money = 10000;

	public Papa() {
		super();
	}

	public void sing() {
		System.out.println("GOD-거짓말");
	}
}// end class

class Son extends Papa {
	int money = 1500;

	public Son() {
		super();
	}

	@Override
	public void sing() {
		System.out.println("빅뱅-거짓말");
	}
} // end class

public class PolyEx004 {
	public static void main(String[] args) {
		// 부모      = 자식
		Papa mypapa = new Son();
		// Q3. Papa mypapa 의미?
		// Papa{int money = 10000; void sing()}, 생성자로 초기화해서 사용할 수 있게 함
		// Q4. 인스턴스화한 실제 메모리 빌려온그림
		// {int money = 1500; @void sing()} - {int money = 10000; void sing()}
		//                                          = 1000번지{int money = 10000; void sing()}
		System.out.println(mypapa.money); // Q5. 출력
		// 10000, {int money = 1500; [@void sing()} - {int money = 10000;] void sing()} 대괄호 범위를 이용하므로 int money = 10000를 출력
		mypapa.sing(); // Q6. 출력
		// 오버라이딩으로 인해 자식 클래스(Son)에 맞춰서 출력됨
		// Q7. mypapa.money 를 이용해서 1500 출력되게 해주세요.
		System.out.println(((Son)mypapa).money);
	}
}

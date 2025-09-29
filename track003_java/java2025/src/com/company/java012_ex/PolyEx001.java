package com.company.java012_ex;

// Q1. 상속도 그리기
/*
 Object
 ↑ 
 TestA2 {int a=10, toString}
 ↑ 
 TestB2 {int b=20, toString}
 */

class TestA2 extends Object {
	int a = 10;
	@Override
	public String toString() {
		return "TestA2 [a=" + a + "]";
	}
}
class TestB2 extends TestA2 {
	int b = 20;
	@Override
	public String toString() {
		return "TestB2 [b=" + b + "]";
	}
}
public class PolyEx001 {
	public static void main(String[] args) {
		TestA2 ta = new TestB2();
		// Q2. TestA2 ta는 클래스의 무엇을 사용할 수 있는지?
		// ta: {int a=10, toString}
		// Q3. TestB2()는 클래스의 무엇을 사용할 수 있는지?
		// TestB2(): TestB2{int b=20, @toString} - TestA2{int a=10, toString}
		System.out.println(ta);
		// Q4. 출력 내용과 이유? TestA2 / TestB2
		// TestB2, ta가 사용할 수 있는 범위가 {int b=20, @toString} - {int a=10, toString}까지인데 오버라이드 되어 자식 메서드인 @toString 출력
		System.out.println(ta.a);
		// Q5. 사용 가능?
		// 가능하며 int a값인 10 출력 사용 범위에 int a가 있으므로 타입캐스팅 없이 출력 가능함
		// System.out.println(ta.b);
		// Q6. 사용 가능?
		// 불가능하며 사용하려면 ta를 TestB2로 타입캐스팅하여 사용 범위를 int b까지 늘려야 함
	}

}

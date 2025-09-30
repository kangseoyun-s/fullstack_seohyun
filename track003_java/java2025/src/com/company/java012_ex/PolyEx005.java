package com.company.java012_ex;
/*
 Object
   ↑
 Parent7 {int x = 100; void method()}
   ↑
 Child7 {int x = 200; void method()}
  */

// Parent7 멤버 변수: int x = 100; 멤버 함수: void method()
// Child7 멤버 변수: int x = 200; 멤버 함수: void method()
class Parent7 extends Object {
	int x = 100;

	public Parent7() {
		super();
	}

	void method() {
		System.out.println("Parent Method");
	}
}

class Child7 extends Parent7 {
	int x = 200;

	public Child7() {
		super();
	}

	@Override
	void method() {
		System.out.println("Child Method");
	}
	void papaMethod() {
		super.method();
	}
}
public class PolyEx005 {
	 public static void main(String[] args) {
	      Parent7 p = new Child7();     
	      // Q3.  Parent7 p   보장하는 범위 
	      // {int x = 100; void method()}
	      // Q4. 인스턴스화 했을때 사용가능한 범위 : new Child7()  
	      // {int x = 200; @void method()} - {int x = 100; void method()}
	      Child7 c = new Child7();     
	      System.out.println("p.x = " + p.x);
	      // Q5. 출력되는 내용
	      // p.x = 100, Parent7 p가 보장하는 범위가 {int x = 100; void method()}이므로 p.x가 100을 출력
	      p.method(); // X 인스턴스 변수 기준으로 오버라이드 된 메서드는 직접 호출하는 건 불가능
	      ((Child7)p).papaMethod(); // 타입 캐스팅 - 부모가 자식메서드 호출 가능
	      c.papaMethod(); // 자식에서 부모 호출 가능
	      // Q6. 출력되는 내용
	      // Child Method, 오버라이드 때문에 자식인 Child Method 출력 (범위에는 없더라도 오버라이드 때문에 최신 메서드인 자식 메서드가 출력)
	      System.out.println("c.x = " + c.x);
	      // Q7. 출력되는 내용
	      // c.x = 200, Child7 c가 보장하는 범위가 {int x = 200; @void method()} - {int x = 100; void method()}이고,
	      // 생성자 출력 순서가 Child7 → Parent7 → Object이므로 c.x가 200 출력
	      c.method();
	      // Q8. 출력되는 내용
	      // Child Method, 오버라이드 때문에 자식인 Child Method 출력
	   }
}

package com.company.java012_ex;

//Q1. 상속도를 그리시오. 
/*
 Object
   ↑
 TestA3 {int a=10; toString}
   ↑
 TestB3 {int b=10; toString}
 */
class TestA3  extends Object{  
 int a=10;
 @Override public String toString() { return "TestA3 [a=" + a + "]"; }
}
class TestB3  extends TestA3{  
 int b=10;
 @Override public String toString() { return "TestB3 [b=" + b + "]"; }
} 
public class PolyEx002 {
	public static void main(String[] args) {
	      TestB3  tb =  (TestB3) new TestA3();
	      //Q2. 15번째줄에서   TestB3  tb는 클래스의 무엇을 사용할수 있을까요? 코드의 의미
	      // tb: TestB3{int b=10; @toString}-TestA3{int a=10; toString}, 생성자로 인스턴스 변수 초기화
	      //Q3. 15번째줄에서   (TestB3) new TestA3() 클래스의 무엇을 사용할 수 있을까요?
	      // (TestB3) new TestA3(): {int a=10; toString}
	      //Q4. 코드상에서는 문제가 없는데 코드를 실행하면 오류가 나는 이유는?
	      // 생성자로 초기화하지 않아서 {int b=10}이 보장되지 않기 때문
	   }
}

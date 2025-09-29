package com.company.java012_ex;
//Q1. 상속도를 그리시오. 
/*
	 Object 3)                      4)
	   ↑
	 TestA4 2) {int a=10, toString} 5)
	   ↑
	 TestB4 1) {int b=20, toString} 6)
 */
class TestA4  extends Object{  
 int a=10;
 @Override public String toString() { return "TestA4 [a=" + a + "]"; }
}
class TestB4  extends TestA4{  
 int b=20;
 @Override public String toString() { return "TestB4 [b=" + b + "]"; }
}
public class PolyEx003 {
	public static void main(String[] args) {
	      TestA4  ta = new TestA4();
	      //Q2. TestA4  ta 사용할수 있는범위는?
	      // ta: {int a, toString}
	      //Q3. new TestA4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
	      // 생성자: TestA4 → Object 객체: Object → TestA4
	      TestB4  tb = new TestB4();  
	      //Q4. TestB4  tb 사용할수 있는범위는?
	      // tb: {int b, @toString} - {int a, toString}
	      //Q5. new TestB4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
	      // 생성자: TestB4 → TestA4 → Object 객체: Object → TestA4 → TestB4
	      ta = new TestB4();
	      //Q6. ta가 사용할수 있는 보장하는 변수와 메서드는?
	      // ta: {int a, toString}
	      //Q7.ta = new TestB4(); 에서 new TestB4() 에서 사용할수 있는 범위는? 
	      // TestB4(){int b, [@toString} - TestA4(){int a], toString}
	      tb         = (TestB4) ta;   
	      //Q8. tb         = (TestB4) ta;   에서 tb가 사용할수 있는 범위는?
	      // TestB4(){int b, [@toString} - TestA4(){int a], toString}
	      //Q9. 컴피일러시  tb         = (TestB4) ta;  오류가 안나는 이유는?
	      // 생성자로 인스턴스 변수를 초기화해 사용할 수 있게 하고, TestB4로 타입 캐스팅을 해서 {int b, @toString} 범위를 보장함
	      System.out.println(tb);  //Q10. 출력내용과 그이유는? TestA4  vs  TestB4
	      // TestB4, 오버라이드로 인해 자식인 TestB4가 출력됨 
	      System.out.println(tb.b);//Q11. 출력내용?
	      // 20, tb에서 int b가 범위에 존재하기 때문에 20이 출력됨
	      System.out.println(tb.a);//Q12. 출력내용?
	      // 10, tb에서 int a가 범위에 존재하기 때문에 10이 출력됨
	      
	   }
}

package com.company.java015;

class RefClass{
	void method(String str) {System.out.println(str);}
}
interface InterUsing{
	void inter(RefClass c, String str);
}

public class Lambda003 {
	public static void main(String[] args) {
		// 1. 익명 클래스
		InterUsing a1 = new InterUsing() {

			@Override
			public void inter(RefClass c, String str) {
				// TODO Auto-generated method stub
				c.method(str);
			}
			
		};
		a1.inter(new RefClass(), "Hello :)");
		// 2. 람다 ()->{} 
		//InterUsing a2 = (RefClass c, String str) -> {c.method(str);};
		InterUsing a2 = (c, str) -> {c.method(str);}; // 직접 구현
		a1.inter(new RefClass(), "Hello :):)"); // RefClass 클래스의 method 사용
		// 3. :: 표현식 (참조)
		InterUsing a3 = RefClass::method; // 자동 연결 1) RefClass 2) method
		a3.inter(new RefClass(), "Hello :):):)"); 
		
		// 4. interface InterBasic{int method(int a, int b);}
		InterBasic basic = (int a, int b) -> {return Math.max(a, b);}; // math.max(더 큰 값)
		System.out.println(basic.method(10, 3));
		
		InterBasic basic2 = (a, b) -> Math.max(a, b); // math.max(더 큰 값)
		System.out.println(basic2.method(100, 3));
		
		InterBasic basic3 = Math::max; // math.max(더 큰 값), ()-> return 생략 가능
		System.out.println(basic3.method(1000, 3));
		
		InterBasic basic4 = (a, b) -> Math.min(a, b); // math.min(더 작은 값)
		System.out.println(basic4.method(10, 3));
		
		InterBasic basic5 = Math::min; // math.min(더 작은 값), ()-> return 생략 가능
		System.out.println(basic5.method(10, 3));
	}
}

interface InterBasic{int method(int a, int b);}
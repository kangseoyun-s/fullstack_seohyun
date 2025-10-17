package com.company.java015;

// 1. 클래스는 부품객체 - 설계도(틀, can do this)
// 2. 상태 + 행위 - interface(public static final / public abstract)

interface Inter1{ void method(); }
class Inter1Impl implements Inter1{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("Hello :D");
	}
	
}

public class Lambda001 {

	public static void main(String[] args) {
		// 1. interface 구현 객체 (자식)
		// 부모 = 자식
		Inter1 i1 = new Inter1Impl(); i1.method();
		// 2. 익명 이너 클래스(test 목적, 한 번 쓰고 버릴 목적, 잘 안 쓰는 이벤트)
		// Inter1 i2 = new Inter1(); 추상 메서드라 구현부가 없어 new 사용 불가
		Inter1 i2 = new Inter1() {

			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("일회용 - Hello :D");
			}
			
		}; i2.method();
		Inter1 i22 = new Inter1() {

			@Override
			public void method() {
				// TODO Auto-generated method stub
				System.out.println("일회용 - Hello :D");
			}
			
		}; i22.method();
		// 3. lambda 
		Inter1 i3 = () -> {System.out.println("일회용 - Hello :D");};
		i3. method();
	}

}

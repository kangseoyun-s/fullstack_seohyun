package com.company.java013;

/*
S - SRP (단일 책임 원칙)   클래스는 하나의 책임만 가져야 함. 즉, 변경의 이유가 하나여야 함.
O - OCP (개방-폐쇄 원칙)   확장에는 열려 있고, 변경에는 닫혀 있어야 함. 기존 코드를 수정하지 않고 기능을 추가할 수 있어야 함.
L - LSP (리스코프 치환 원칙)   하위 클래스는 상위 클래스의 기능을 대체할 수 있어야 함. 즉, 다형성을 지켜야 함.
I - ISP (인터페이스 분리 원칙)   클라이언트는 자신이 사용하지 않는 메서드에 의존하면 안 됨. 인터페이스는 작고 명확하게 분리해야 함.
D - DIP (의존 역전 원칙)   고수준 모듈은 저수준 모듈에 의존하면 안 되고, 추상화에 의존해야 함. 즉, 인터페이스에 의존하라는 뜻.

1. S: (한 클래스는 하나만)한 클래스는 한 가지 일만(쿠키 반죽은 반죽만, 쿠키 굽기는 쿠키 굽기만)
2. O: (수정하지 말고 추가만)새로운 쿠키 쉽게 추가
3. L: (다형성: 같은 방식으로 처리)모든 쿠키는 같은 방식으로 만들기
4. I: (필요한 기능만 딱!) 인터페이스 나누기 
5. D: (추상적인 쿠키 의존) 
  */
// 1. S: 단일 책임의 원칙
//class CookieMaker{
//	public void bakeCookie(String type) {
//		System.out.println(type + "쿠키를 구워요!");
//	}
//}
// 2. O: 개방-폐쇄 원칙 (새로운 쿠키 추가 O, 기존 코드 변경 X) + //3. L: 리스코프 치환(어떤 쿠키든 Cookie 인터페이스를 바꿔 써도 문제 없어요! 부모 = 자식)
//interface Cookie{void make();}
//
//class MalchaCookie implements Cookie {@Override public void make() {System.out.println("말차쿠키");}}
//class DeepMalchaCookie implements Cookie {@Override public void make() {System.out.println("딥말차쿠키");}}
//class RedVelvetCookie implements Cookie {@Override public void make() {System.out.println("레드벨벳쿠키");}}
//
//class CookieFactory{
//	public void makeCookie(Cookie cookie) {
//		cookie.make();
//	}
//} 
//
//4. I: 인터페이스
//5. D: CookieFactory 구체적인 쿠키가 아니라 추상적인 쿠키에 의존
//class CookieShop{
//	private Cookie cookie;
//	
//}
//////////////////////////////////////////////////////////
//public class SoildBasic {
//	public static void main(String[] args) {
//		System.out.println("1. S: 단일 책임의 원칙 - 쿠키 굽기");
//		CookieMaker maker = new CookieMaker();
//		maker.bakeCookie("말차");
//		maker.bakeCookie("레드벨벳");
//		maker.bakeCookie("쫀득");
//		// O + L
//		System.out.println("개방 폐쇄(레시피 추가")); 
//		// 4. 인터페이스 분리
//		// 5. 
//	}
//
//}
////////////////////////////////////////////////////////
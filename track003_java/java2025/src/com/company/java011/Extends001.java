package com.company.java011;

// 1. 상속? 클래스의 재사용
/* 실선 - 속이 빈 화살표
  Object        3)            {Object()}              4)
    ↑
    A  int a    2)            {a → A()                a=10} 5)
    ↑
    B  int b    1) new > 1번지 {b → B()                b=20} 6
    -------------------------------------------------------------
    B b1 = new B(); b1.show();
    -------------------------------------------------------------
    1) extend 상속 
    2) is a: applessms A는 Object이고, B도 Object
    3) 생성자 호풀 B() > A() > Object
    4) 객체 생성 Object B
 */
class A extends Object {
	int a=10;
	public A() {super();}
} 
class B extends A{
	int b=20;
	public B() {super();}
	public void show() {System.out.println(super.a + "\t" + this.b);}
}
public class Extends001 {
	public static void main(String[] args) {
		B b1 = new B(); b1.show();
	}

}

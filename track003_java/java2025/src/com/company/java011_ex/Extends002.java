package com.company.java011_ex;
/* 
Object                    ●3. Object() {            }   ●4.
↑                                      
Color 클래스:               ●2. Color()  {name=null / num=0}   ●5.
↑        
Green 클래스: void show(){} ●1. Green(){               show()      }    ●6.
                          ●0. 1번지)
------------------------------------
Green mygreen = new Green();
------------------------------------
1) Cat은 Animal이다
2) 생성자 호출: Cat() → Animal() → Object()
3) 객체 생성: Object → Animal → Cat
*/
class Color{
	public String name;
	private int num;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Color [name=" + name + ", num=" + num + "]";
	}
}
class Green extends Color {

	public void show() {
		System.out.println("GREEN");
		System.out.println("NAME :" + this.name);
		System.out.println("NUM :" + this.getNum());
	}
}
public class Extends002 {
	public static void main(String[] args){
		
	}

}

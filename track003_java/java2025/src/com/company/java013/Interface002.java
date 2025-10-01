package com.company.java013;
//1. 클래스는 단일 상속
//2. 부품객체는 상태(멤버변수)와 행위(멤버함수)
//3. 상속: 클래스의 재사용, 단일 상속
//4. 인터페이스: can do this, 다중 상속
/*
Papa{brain}     Mama{brain} 
       ↑      ↑
         Son()  

*/
class Papa2{int brain;}
class Mama2{int brain;}
// class Son2 extends Papa, Mama{}
//2. 인터페이스는 다중 상속                      
/*            inter()                       method()                 method()
 *        <<interface>>Inter20      <<interface>>Inter21    <<interface>>Inter22        
                                                  ↑              ↑ (실선 + 속이 빈 화살표)
                                                <<interface>>Inter23 method()
  
       <<class>> Papa2 ⋯⋯⋯△                        ⋯⋯⋯△
(실선 + 속이 빈 화살표)  ↑
                   Using1 extends Papa2 implements Inter23, Inter20
                   - {@method()}
                   - {@inter()}
  */ 
interface Inter20 {void inter();}
interface Inter21 {void method();}
interface Inter22 {void method();}
interface Inter23 extends Inter21, Inter22{}
class Using1 extends Papa2 implements Inter23, Inter20{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inter() {
		// TODO Auto-generated method stub
		
	}

} 
public class Interface002 {
	public static void main(String[] args) {
	//	Inter my = new Inter();
		Using1 my = new Using1();
		//if(my interfaceof Object) {System.out.println("1.Object");}
		//if(my interfaceof Papa) {System.out.println("2.Papa");}
		//
		//if(my interfaceof Inter20) {System.out.println("4. Inter20");}
	}
}

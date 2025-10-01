package com.company.java013;
//1. 클래스는 부품객체
//2. 부품객체는 상태(멤버변수)와 행위(멤버함수)
//3. 상속: 클래스의 재사용, 단일 상속
//4. 인터페이스: can do this, 다중 상속
/*
Papa{brain}     Mama{brain} 
         ↑      ↑
           Son()  

*/
class Papa{int brain;}
class Mama{int brain;}
//class Son extends Papa, Mama{}
/*
  Animal2    {Company="(주)메가스터디", eat()}}    
  ↑     ↑ (속이 빈 점선)
Saram  Pig           
{@eat()} {@eat()}

1. 부모 = 자식           > 하나의 자료 타입(부모)으로 여러타입(자식, 자식, 자식...)을 관리
2. 업캐스팅, 타입 캐스팅 X, > 자식의 메서드가 호출 @Override
*/
interface Animal2{
	String Company="(주)메가스터디";
	// public static final - [공용]클래스 변수, Animal2.Company, method area, new X, this 각각 X
	void eat(); // public abstract 메서드
}
class Saram implements Animal2{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		/*Company="kakao";*/ System.out.println(Animal2.Company + "랍스타... 냠냠");
	} // The final field Animal2.Company cannot be assigned
	
}
class Pig implements Animal2{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		/*Company="kakao";*/ System.out.println(Animal2.Company + "꾸꾸리... 냠냠");
	} // The final field Animal2.Company cannot be assigned
	
}
public class Interface001 {
	public static void main(String[] args) {
		// Animal2 ani = new Animal(); // Cannot instantiate the type Animal
		Animal2 [] anis = {new Saram(), new Saram(), new Pig()};
		for(Animal2 a : anis) {a.eat();}
	}

}

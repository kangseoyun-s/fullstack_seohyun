package com.company.java009;
//1. 클래스는 부품객체
//2. 클래스는 속성(멤버 변수)과 행위(멤버 함수)
class Animal002{
	// 속성 - 멤버 변수
	String name ;
	int age ;
	// 행위 = 멤버 함수
	void show() {System.out.println(this.name + "\t" + this.age );}
}
/////////////////////////////////////////////////////
public class Class002 {
	public static void main(String[] args) {
		Animal002 a1 = new Animal002(); a1.name ="sally"; a1.age=3; a1.show();
		//1. new(1번지, 객체 생성) 2. Animal002() 초기화 3. a1 주소 = 1번
		Animal002 a2 = new Animal002(); a2.name ="alpha"; a2.age=7; a2.show();
	}

}
//////////////////////////////////////////////////////
/* [runtime data area]
 * -----------------------------
 * [method: 클래스 정보, static, final : 공용 정보]
 *  Animal002.class, Class001.class 2)                        클래스 : 설계도 > (인스턴스화) 객체(Object/a1,a2) > 인스턴스 (sally, alpha)
 * -----------------------------                                                                      
 * [heap : 동적]      | [stack: 빌리기]
 * 18번째: 2번지{name=alpha,age=7} < a2[2번지]       a2,show() {this.name(2번지의 namse)} 
 * 18번째: 2번지{name=null,age=0} < a2[2번지]             
 * 17번째: 1번지{name=sally,age=03} < a1[1번지]      a1.show(){this.name(1번지의 name)}            
 * 15번째: 1번지{name=null,age=0} < a1[1번지]                 
 *                  
 *                  | main   
 * ------------------------------                      
 */

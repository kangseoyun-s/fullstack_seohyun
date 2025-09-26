package com.company.java011_ex;
/* 클래스의 재사용
 Object
 ↑
 MobileNote
 ↑
 MobileNote7
 ↑
 MobileNote8
 ↑
 MobileNote9
 -----------------------------------------
  MobileNote9 my9 = new MobileNote9();
 -----------------------------------------
 1. MobileNote9는 MobileNote
 2. 생성자 호출 순서: MobileNote9 → MobileNote8 → MobileNote7 → MobileNote → Object
 3. 객체 생성 순서: Object → MobileNote → MobileNote7 → MobileNote8 → MobileNote9
     3번지 {battery/newShow} → {face / newShow} → {iris, face / newShow} → {show()}
     Q. note8, note7의 newShow() 호출 방법은?
 -----------------------------------------
 MobileNote8 my8 = new MobileNote8();
 -----------------------------------------
 1. MobileNote8는 MobileNote
 2. 생성자 호출 순서: MobileNote8 → MobileNote7 → MobileNote → Object
 3. 객체 생성 순서: Object → MobileNote → MobileNote7 → MobileNote8
     2번지 {face / newShow} → {iris, face / newShow} → {show()}
     오버라이딩: 상속 시 부모와 같은 메서드 자식에게 맞게 수정
 -----------------------------------------
 MobileNote7 my7 = new MobileNote7();
 -----------------------------------------
 1. MobileNote7는 MobileNote
 2. 생성자 호출 순서: MobileNote7 → MobileNote → Object
 3. 객체 생성 순서: Object → MobileNote → MobileNote7
    1번지: {iris, face / newShow} - {show()}
 */
class MobileNote extends Object {
	void show() {
		
	}
	
}
class MobileNote7 extends MobileNote {
	private String iris;
	private String face;
	void newShow() {System.out.print("iris = " + this.iris +"\n" +"face = " + this.face +"\n");}
	public String getIris() {
		return iris;
	}
	public void setIris(String iris) {
		this.iris = iris;
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
}
class MobileNote8 extends MobileNote7 {
	private String face;
	@Override void newShow() {
		System.out.println("face = " + this.face);
	}
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	
}
class MobileNote9 extends MobileNote8 {
	private int battery;
	@Override void newShow() {
		System.out.print("battery 예쁘게 사용하기!\n" + "battery =" + this.battery);
	}

	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}

}
public class ClassEx002 {
	public static void main(String[] args) {
		//        MobileNote7 my7 = new MobileNote7();
		//        my7.setIris("brown");
		//        my7.setFace("pretty");
		//        my7.newShow();
		//
		//        MobileNote8 my8 = new MobileNote8();
		//        my8.setFace("pretty");
		//        my8.newShow();

		//        MobileNote9 my9 = new MobileNote9();
		//        my9.setBattery(24);
		//        my9.newShow();
		MobileNote9 my92 = new MobileNote9();
		my92.setIris("black");
		my92.setFace("cute");
		my92.setBattery(24);
		my92.newShow();
		
    }

}

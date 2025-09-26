package com.company.java009_ex;

import java.util.Scanner;

class AnimalCharacter{
	@Override
	public String toString() {
		return "AnimalCharacter [name=" + name + ", type=" + type + ", baseSpeed=" + baseSpeed + ", specialBoost="
				+ specialBoost + ", finalSpeed=" + finalSpeed + "]";
	}
	public AnimalCharacter(String name, String type, int baseSpeed, int specialBoost) {
		super();
		this.name = name;
		this.type = type;
		this.baseSpeed = baseSpeed;
		this.specialBoost = specialBoost;
	}
	public AnimalCharacter() {
		super();
		// TODO Auto-generated constructor stub
	}
	String name;  
    String type;  // 육식 or 초식  
    int baseSpeed;  
    int specialBoost;  
    double finalSpeed;
    
    void input() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("\n동물 이름 > "); name = scanner.next();
    	System.out.print("동물 타입(육식/초식) > "); type = scanner.next();
    	System.out.print("기본 속도 > "); baseSpeed = scanner.nextInt();
    	System.out.print("특수 능력치 > "); specialBoost = scanner.nextInt();
    } 
    void calculateSpeed() {
    	if(type.equals("초식")) {finalSpeed = (specialBoost*0.1) + baseSpeed; }
    	else {finalSpeed = (specialBoost*0.2) + baseSpeed;}
    }
    void show() {
        this.calculateSpeed();
    	System.out.println("🦁 동물 캐릭터:" + this.name);
    	System.out.println("🌿 타입:" + this.type );
    	System.out.printf("%s %.2f", "🚀 최종 속도:", this.finalSpeed);
    }
}
public class ClassEx008 {
	public static void main(String[] args) {
        AnimalCharacter a1 = new AnimalCharacter("치타", "육식", 100, 30);
        a1.show();

        AnimalCharacter a2 = new AnimalCharacter();
        a2.input();
        a2.show();
    }
}

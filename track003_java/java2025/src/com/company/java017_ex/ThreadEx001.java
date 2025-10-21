package com.company.java017_ex;

import java.util.Scanner;

class QuestionCount extends Thread {

	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.print(i + "\n");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
		super.run();
	}
	
}
public class ThreadEx001 {

	public static void main(String[] args) {
		QuestionCount qc = new QuestionCount(); qc.start();
		String name ="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("사과 알파벳을 입력하세요. > ");
		name = scanner.next();
		if("apple".equals(name)) {
			System.out.println("정답입니다.");
		}
		else if("사과".equals(name)) {
			System.out.println("정답입니다.");
		}
		else {System.out.println("정답이 아닙니다.");}
		
	}

}

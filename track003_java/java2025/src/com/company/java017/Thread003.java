package com.company.java017;

class Animal{ String name;}
// class Dog extends 
// 1)Thread 상속 → Runnable 구현 2) 수행 내용 3) 실행

class Dog extends Animal implements Runnable {// enxtends Thread

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("멍");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} 
	
	
}
public class Thread003 {

	public static void main(String[] args) {
	     Thread sound = new Thread(new Dog()); sound.start();
	     for(int i=0; i<5; i++) {
	    	 System.out.println("  ◖⚆ᴥ⚆◗  ");
	    	 try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     }
	}

}

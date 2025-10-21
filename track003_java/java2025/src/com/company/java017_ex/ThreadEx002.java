package com.company.java017_ex;

//1.Candy Mentol 클래스가 1초에 1개 팔렸다고 실행 클래스 만들려고 함

class Candy {
	String name;
	public void sell() {System.out.println(name + "가 1개 팔렸습니다.");}
}

//class MentolSeller extends Candy implements Runnable {
//
//	@Override
//	public void run() {
//		for(int i=0; i<5; i++) {
//			sell();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		// TODO Auto-generated method stub
//		
//	}
//	// MentolSeller extends Thread 불가능 Runnable 이용
//	// 구현 내용인 Run 이용 1초에 Thread.sleep(1000); sell
//	
//}
class MentolSeller extends Candy implements Runnable {

	@Override
	public void run() {
			while(true){
          sell(); 
			try {
				Thread.sleep(1000); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(); 
				break;
			} 
		}
		// TODO Auto-generated method stub
		
	} 
	// MentolSeller extends Thread 불가능 Runnable 이용
	// 구현 내용인 Run 이용 1초에 Thread.sleep(1000); sell

}
public class ThreadEx002 {

	public static void main(String[] args) {
		MentolSeller seller = new MentolSeller();
		seller.name= "멘톨 캔디";
		Thread t = new Thread(seller);
		t.start();
		for(int i=0; i<5; i++) {
			System.out.println("손님 기다리는 중...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

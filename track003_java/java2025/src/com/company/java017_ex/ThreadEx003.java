package com.company.java017_ex;

import java.util.Scanner;

import javax.swing.JOptionPane;

//class Count1 extends Thread {
//
//	@Override
//	public void run() {
//		for(int i =10; i>0; i--) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				break;
//			}
//		}
//		// TODO Auto-generated method stub
//		super.run();
//	}
//	
//	
//}
class Count2 implements Runnable{
	@Override
	public void run() {
		for(int i =10; i>0; i--) {
			if(Thread.currentThread().isInterrupted()) {
				System.out.println("... stop");
				break;
			}
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				Thread.currentThread().interrupt();
			}
		}
	}
}
public class ThreadEx003 {
	public static void main(String[] args) {
		String info ="계속 카운트 합니다.";
		Thread timer1 = new Thread(new Count2()); timer1.start();
		String answer = JOptionPane.showInputDialog("count stop?  y/n");
		if(answer.toLowerCase().equals("y")) {
			timer1.interrupt(); answer="count를 멈춥니다.";
		}
		System.out.println(info);
		System.out.println("> main end....");
	}

}

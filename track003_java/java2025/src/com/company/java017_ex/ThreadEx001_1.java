package com.company.java017_ex;

import java.util.Scanner;

import javax.swing.JOptionPane;
class Count extends Thread {

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
class Question extends Thread {

	@Override
	public void run() {
		String answer =JOptionPane.showInputDialog("사과 알파벳을 입력하세요. > ");
		System.out.println(answer.toLowerCase().equals("apple")? "정답":"오답");
		// TODO Auto-generated method stub
		super.run();
	}
	
}

public class ThreadEx001_1 {
	public static void main(String[] args) {
		Thread question = new Question(); question.start();
		Thread count = new Count(); count.start();
		
	}

}

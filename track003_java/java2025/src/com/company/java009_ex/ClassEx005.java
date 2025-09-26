package com.company.java009_ex;

import java.util.Scanner;

class Card{
	@Override
	public String toString() {
		return "Card [cardNum=" + cardNum + ", isMembership=" + isMembership + "]";
	}
	public Card(int cardNum, boolean isMembership) {
		super();
		this.cardNum = cardNum;
		this.isMembership = isMembership;
	}
	public Card() {
		super();
		// TODO Auto-generated constructor stub
	}
	int cardNum; 
	boolean isMembership;
	void show(){
		System.out.println("Card[cardNum=" + this.cardNum + "isMembership=" + this.isMembership +"]");
	}
}
public class ClassEx005 {
	public static void main(String[] args) {
		   Card c1= new Card(); 
		   System.out.println(c1);  

	}
}

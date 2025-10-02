package com.company.Bank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserInfo {
	private String id, pass;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public List<UserInfo> getUsers() {
		return users;
	}
	public void setUsers(List<UserInfo> users) {
		this.users = users;
	}
	public BankController[] getController() {
		return controller;
	}
	public void setController(BankController[] controller) {
		this.controller = controller;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", pass=" + pass + ", balance=" + balance + ", users=" + users + ", controller="
				+ Arrays.toString(controller) + "]";
	}
	private double balance;
	private List<UserInfo> users; // add, get, size, remove, contains
	private BankController[] controller;
	public UserInfo(String id, String pass, double balance) {
		super();
		this.id = id;
		this.pass = pass;
		this.balance = balance;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
}

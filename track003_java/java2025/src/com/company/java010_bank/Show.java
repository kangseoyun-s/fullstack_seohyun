package com.company.java010_bank;

public class Show {
	private UserInfo userinfo;

	public Show() {
		super();
		// TODO Auto-generated constructor stub
	}
	// 집약
	public Show(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}
	public void exec(){
		System.out.println("\nID > " + this.userinfo.getId()
		                    + "\nPASS > " + this.userinfo.getPass()
		                    + "\nBALANCE > " + this.userinfo.getBalance());
	}

}
/* 기능: 유저 정보 보여 주기
 * /
 */
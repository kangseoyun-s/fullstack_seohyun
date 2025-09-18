package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx009 {
	public static void who_are_you(String [][] users) {// 아이디 입력 받아서 나라 조회
		Scanner scanner = new Scanner(System.in);
		String tempid="" ;
		String result="정보를 확인해 주세요." ;
		System.out.print("아이디를 입력해 주세요 > ");
		tempid = scanner.next();
		// if(tempid.equals(users[0][0])){result = tempid +"의 나라는" +users[0][2]+"입니다."}
		// if(tempid.equals(users[0][1])){result = tempid +"의 나라는" +users[1][2]+"입니다."}
		for (int i = 0; i < users.length; i++) {
			if (tempid.equals(users[i][0])) {
				System.out.print(tempid + "의 나라는 " + users[i][2] + "입니다." +"\n"); 
				break;
			}
		}		
	}
	public static void who_pass_change(String [][] users) {
		String tempid ="";
        String temppass= "";
        String newpass ="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디를 입력해 주세요 > ");
		tempid = scanner.next();
		System.out.print("비밀 번호를 입력해 주세요 > ");
		temppass = scanner.next();
		for (int i = 0; i < users.length; i++) {
	         if(tempid.equals(users[0][i]) && temppass.equals(users[i][1])) {
	            System.out.print("변경하실 비밀 번호를 입력해 주세요 > ");
	            newpass = scanner.next();
	            users [i][1] = newpass ;
	            System.out.println("정보 확인 :" +"[" + tempid +","+ users[i][1] +"," + users[i][2] + "]");
	            break;
	         }
	      }
	}
	// if(tempid.equals(users[0][0]) && temppass.equals(users[0][1])){result = "변경하실 비밀 번호를 입력해 주세요" + change; break; }
	// if(tempid.equals(users[0][1]) && temppass.equals(users[1][1])){result = "변경하실 비밀 번호를 입력해 주세요" + change }
	public static void main(String[] args) {
		// 변수
		   String [][] users = {{ "aaa"  , "111"   , "한국"     } ,     // 00 01 02
		                      { "bbb" , "222"   , "호주"       } ,       // 10 11 12
		                      { "ccc"  , "333"   , "중국"      }};      // 20 21 22
		  
		   
		   // 입력
		   who_are_you(users);    
		   //  public static void who_are_you(String [][] users){  아이디를입력받아서 나라조회 }
		   who_pass_change(users); 
		   //  public static void who_pass_change(String [][] users){ 아이디,비밀번호가 맞으면 비밀번호 바꾸기}
		}

		//출력내용) who_are_you(users);    
		//  public static void who_are_you(String [][] users){  아이디를입력받아서 나라조회 }
		//아이디를 입력해주세요>aaa
		//aaa는 한국사람입니다.
	}



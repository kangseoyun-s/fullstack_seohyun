package com.company.java005_ex;

import java.util.Scanner;

public class Bank_ver3 {
	public static void main(String[] args) {
		int num = 0;
		String id = "", pass = "";
		double balance = 0;
		// 통계용 변수 추가
		int depositCount = 0, withdrawCount = 0;
		double totalDeposit = 0, totalWithdraw = 0;
		Scanner scanner = new Scanner(System.in);
		// 입력 처리 출력
		for (;;) {
			System.out.print( "=== 🕵️‍♂️ 탐정의 은행 사건부 ===\n"
		            + "📁 1. 사건 파일 추가\n"
		            + "🔎 2. 사건 조회\n"
		            + "💼 3. 증거 입금\n"
		            + "🕰️ 4. 증거 출금\n"
		            + "🗃️ 5. 사건 파일 폐기\n"
		            + "🎩 6. 추리 미니게임\n"
		            + "📚 7. 전체 사건 열람\n"
		            + "🚪 9. 사건 종료\n"
		            + "🖋️ 사건 번호 입력 >>> ");
			num = scanner.nextInt();
			if (num == 9) {
				System.out.println("사건을 종료합니다.");
				break;
			} else if (num == 1) {
				System.out.println("사건 파일 추가 중입니다.");
				// 아이디 입력 > _입력받기
				// 비밀번호 입력 > _입력받기
				// 잔액 입력 > _입력받기
				System.out.print("아이디 입력: ");
				id = scanner.next();
				System.out.print("비밀번호 입력: ");
				pass = scanner.next();
				System.out.print("잔액 입력: ");
				balance = scanner.nextDouble();
				continue;
			} else if (num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7) {
				System.out.print("아이디 입력 > ");
				String tempid = scanner.next();
				System.out.print("비밀 번호 입력 > ");
				String temppass = scanner.next();
				if (!(id.equals(tempid)) && pass.equals(temppass)) {
					System.out.println("사건 정보를 확인해 주세요!");
					continue;
				}
				// ■1. 사용자 인증
				// 2. 2,3,4,5 각각에 해당하는 처리
				switch (num) {
				case 2:
					System.out.println("사건 조회 중입니다.");
					// 사용자에게 임시 아이디와 임시 비번 입력받기
					// 아이디와 비번이 맞다면 사용자 정보 출력
					// 아니라면 사용자 정보를 다시 확인해 주세요
					System.out.println("==사건 조회");
					if (id.equals(tempid) && pass.equals(temppass)) {
						System.out.println("ID:" + id);
						System.out.println("PASS:" + pass);
						System.out.println("잔액:" + balance); 
						// 조회 시
						if (balance >= 5000000) {
						    System.out.println("등급: 🎩 명탐정");
						} else if (balance >= 1000000) {
						    System.out.println("등급: 🕵️‍♂️ 수석 조사관");
						} else {
						    System.out.println("등급: 🔍 견습 탐정");
						}

					} else { System.out.println("사건 정보를 확인해 주세요."); }
					break;
			case 3: {
				System.out.println("증거 입금 중입니다.");
				double balance2 = 0;
				if (id.equals(tempid) && pass.equals(temppass)) {
					System.out.print("입금:");
					balance2 = scanner.nextDouble();
					balance += balance2;
			        depositCount++;
			        totalDeposit += balance2;
					System.out.println("✅ 입금 완료" +"\n" +"잔액:" + balance);
				} else { System.out.println("사건 정보를 확인해 주세요."); }
				// 입금 또는 출금 후
				if (Math.random() < 0.1) {
				    System.out.println("🎮 미니게임 이벤트 발생! 숫자 맞추기 도전!");
				    // 게임 로직은 case 6에 따로 구현
				}

			}
				break;
			case 4: {
				System.out.println("증거 출금 중입니다.");
				double balance3 = 0;
				if (id.equals(tempid) && pass.equals(temppass)) {
					System.out.print("출금:");
					balance3 = scanner.nextDouble();
					if(balance - balance3>=0){
			            balance -= balance3;
			            withdrawCount++;
			            totalWithdraw += balance3;
					{System.out.println("✅ 출금 완료" + "\n" + "잔액:" + balance);}}
					else {System.out.println("잔액이 모자릅니다.");}
				} else { System.out.println("사건 정보를 확인해 주세요."); }
				// 입금 또는 출금 후
				if (Math.random() < 0.1) {
				    System.out.println("🎮 미니게임 이벤트 발생! 숫자 맞추기 도전!");
				    // 게임 로직은 case 6에 따로 구현
				}

			} 
				break;
			case 5: {
				System.out.println("사건 파일 폐기 중입니다.");
				char delete;
				if (id.equals(tempid) && pass.equals(temppass)) {
					System.out.println("사건 파일을 삭제하시겠습니까? (Y/N)");
					delete = scanner.next().charAt(0);
					if (delete == 'y') { id = ""; pass = ""; balance = 0; }
				} else { System.out.println("사건 정보를 확인해 주세요."); }
				break;
			}
			case 6: {

			    if(id.equals(tempid) && pass.equals(temppass)) {
			    	System.out.println("은행 추리 미니게임에 도전해 보세요! 성공하면 보너스 5% 이자 지급!");

			        // 미니 게임 시작: 1~10 사이 숫자 맞추기
			        int secretNum = (int)(Math.random() * 10) + 1;
			        System.out.println("1부터 10까지 숫자 중 하나를 맞춰보세요! 기회는 3번입니다.");

			        boolean success = false;
			        for(int i=0; i<3; i++) {
			            System.out.print((i+1) + "번째 시도 >>> ");
			            int guess = scanner.nextInt();
			            if(guess == secretNum) {
			                success = true;
			                break;
			            } else if (guess > secretNum) {
			                System.out.println("너무 높아요!");
			            } else {
			                System.out.println("너무 낮아요!");
			            }
			        }

			        if(success) {
			            double bonus = balance * 0.05;
			            balance += bonus;
			            System.out.printf("축하합니다! 추리를 성공했습니다. 보너스 이자 %.2f원이 지급되었습니다.\n", bonus);
			            System.out.printf("현재 잔액: %.2f\n", balance);
			        } else {
			            System.out.println("아쉽네요. 정답은 " + secretNum + "였습니다. 다음 기회에!");
			        }
			    } else {
			        System.out.println("사건 정보를 확인해 주세요.");
			    }
			}
			break;


			
			// 통계 기능 (case 7) 추가
		case 7: {
		    System.out.println("📊 사건 통계 조회");
		    System.out.println("입금 횟수: " + depositCount);
		    System.out.println("총 입금액: " + totalDeposit + "원");
		    System.out.println("출금 횟수: " + withdrawCount);
		    System.out.println("총 출금액: " + totalWithdraw + "원");
		    System.out.println("현재 잔액: " + balance + "원");
		} break;

			} 
			
		}
	}
	}
}

/*
 * for(;;) {
 * 메뉴판
 * if(9){빠져나오기}
 * else if(1){사용자에게 추가}
 * else if(2,3,4,5){
 * 1.사용자 인증
 * 2. 2,3,4,5 각각에 해당하는 처리
 * switch(){
 * case 2:
 * case 3:
 * case 4:
 * case 5:
 * }
 */

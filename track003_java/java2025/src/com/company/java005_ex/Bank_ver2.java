package com.company.java005_ex;

import java.util.Arrays;
import java.util.Scanner;

public class Bank_ver2 {
	public static void main(String[] args) {
		// 변수
		String[] id = new String[3];
		String[] pass = new String[3];
		double[] balance = new double[3];
		int num = -1;
		int depositCount = 0, withdrawCount = 0;
		double totalDeposit = 0, totalWithdraw = 0;
		Scanner scanner = new Scanner(System.in);
		// 입력 + 처리 + 출력
		while (num != 10) {// 9가 아니라면 무한 반복
			System.out.println(Arrays.toString(id));
			System.out.print("=== 🕵️‍♂️ 탐정의 은행 사건부 ===\n" + "📁 1. 사건 파일 추가\n" + "🔎 2. 사건 조회\n" + "💼 3. 증거 입금\n"
					+ "🕰️ 4. 증거 출금\n" + "🗃️ 5. 사건 파일 폐기\n" + "🎩 6. 추리 미니게임\n" + "📚 7. 전체 사건 열람\n"
					+ "🧠 8. 사건 심리 분석기\n" + "🧳 9. 사건 여행 시뮬레이션\n" + "🚪 10. 사건 종료\n" + "🖋️ 사건 번호 입력 >>> ");
			num = scanner.nextInt();
			if (num == 1) {
				// 1-1. 빈칸 확인
				// ver-1 if(0번이 빈칸이라면){find=0} if(1번이 빈칸이라면) {find=1}
				// ver-2 if(0번이 null이라면){find=0} if(1번이 null이라면) {find=1}
				// ver -3 if(id[0]=null){find=0;} if(id[1]=null) {find=1;}
				// ver-4 찾았으면 나오기 추가
				int find = -1;
				for (int i = 0; i < id.length; i++) {
					if (id[i] == null) {
						find = i;
						break;
					}
				}
				// 1-2.유저 계정에 입력 받기
				System.out.println("사건 파일 추가 중입니다.");
				System.out.print("아이디 입력: ");
				id[find] = scanner.next();
				System.out.print("비밀 번호 입력: ");
				pass[find] = scanner.next();
				System.out.print("금액: ");
				balance[find] = scanner.nextDouble();
			} else if (num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7 ||  num==8|| num==9) {
				int find = -1; String tempid=""; String temppass="";
				System.out.println("아이디 입력: ");
				tempid = scanner.next();
				System.out.println("비밀 번호 입력: ");
				temppass = scanner.next();
				for (int i = 0; i < id.length; i++) {
					if (tempid.equals(id[i])) {
						find = i;
						break;
					}
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
							for(int i1=0; i1<balance.length; i1++) {if (balance[i1] >= 5000000) {
							    System.out.println("등급: 🎩 명탐정");
							} else if (balance[i1] >= 1000000) {
							    System.out.println("등급: 🕵️‍♂️ 수석 조사관");
							} else {
							    System.out.println("등급: 🔍 견습 탐정");
							}}

						} else { System.out.println("사건 정보를 확인해 주세요."); }
						break;
					case 3: {
						System.out.println("증거 입금 중입니다.");
						double balance2 = 0;
						for(int i1=0; i1<balance.length; i1++)
							{if (id.equals(tempid) && pass.equals(temppass)) {
							System.out.print("입금:");
							balance2 = scanner.nextDouble();
							balance[i1] += balance2;
					        depositCount++;
					        totalDeposit += balance2;
							System.out.println("✅ 입금 완료" +"\n" +"잔액:" + balance);
						} else { System.out.println("사건 정보를 확인해 주세요."); }}
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
						for(int i1=0; i1<balance.length; i1++)
							{if (id.equals(tempid) && pass.equals(temppass)) {
							System.out.print("출금:");
							balance3 = scanner.nextDouble();
							if(balance[i1] - balance3>=0){
					            balance[i1] -= balance3;
					            withdrawCount++;
					            totalWithdraw += balance3;
							{System.out.println("✅ 출금 완료" + "\n" + "잔액:" + balance);}}
							else {System.out.println("잔액이 모자릅니다.");}
						} else { System.out.println("사건 정보를 확인해 주세요."); }}
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
						for(int i1=0; i1<balance.length; i1++) {
							if (id.equals(tempid) && pass.equals(temppass)) {
							System.out.println("사건 파일을 삭제하시겠습니까? (Y/N)");
							delete = scanner.next().charAt(0);
							if (delete == 'y') { id[i1] = ""; pass[i1] = ""; balance[i1] = 0; }
						} else { System.out.println("사건 정보를 확인해 주세요."); }}
						break;
					}
					case 6: {

					    if(id.equals(tempid) && pass.equals(temppass)) {
					    	System.out.println("은행 추리 미니게임에 도전해 보세요! 성공하면 보너스 5% 이자 지급!");

					        // 미니 게임 시작: 1~10 사이 숫자 맞추기
					        int secretNum = (int)(Math.random() * 10) + 1;
					        System.out.println("1부터 10까지 숫자 중 하나를 맞춰보세요! 기회는 3번입니다.");

					        boolean success = false;
					        for(int i1=0; i1<3; i1++) {
					            System.out.print((i1+1) + "번째 시도 >>> ");
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
					            double bonus = balance[0] * 0.05;
					            balance[0] += bonus;
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

				case 8: {
				    System.out.println("🧠 사건 심리 분석기");
				    if (depositCount + withdrawCount == 0) {
				        System.out.println("아직 활동 기록이 없어 분석할 수 없습니다.");
				    } else {
				        double activityRatio = (double) depositCount / (depositCount + withdrawCount);
				        double avgBalance = 0;
				        int validCount = 0;
				        for (int i1 = 0; i1 < balance.length; i1++) {
				            if (id[i1] != null && !id[i1].isEmpty()) {
				                avgBalance += balance[i1];
				                validCount++;
				            }
				        }
				        avgBalance = validCount > 0 ? avgBalance / validCount : 0;

				        System.out.println("총 활동 횟수: " + (depositCount + withdrawCount));
				        System.out.printf("입금 비율: %.2f%%\n", activityRatio * 100);
				        System.out.printf("평균 잔액: %.2f원\n", avgBalance);

				        if (activityRatio > 0.7 && avgBalance > 3000000) {
				            System.out.println("성향 분석: 🧠 '자산 축적형 탐정' - 신중하고 계획적인 스타일입니다.");
				        } else if (activityRatio < 0.3) {
				            System.out.println("성향 분석: 🔥 '위험 감수형 탐정' - 빠른 판단과 실행을 선호합니다.");
				        } else {
				            System.out.println("성향 분석: ⚖️ '균형형 탐정' - 상황에 따라 유연하게 대응합니다.");
				        }
				    }
				    break;
				}
				case 9:
				System.out.println("🧳 사건 여행 시뮬레이션");
				System.out.println("📍 장소: 런던 금융가\n상황: 고객 계좌에서 미확인 입금 발생");
				System.out.println("1. 고객에게 직접 연락한다");
				System.out.println("2. 내부 감사팀에 보고한다");
				System.out.println("3. 입금 경로를 추적한다");
				System.out.print("선택 >>> ");
				int choice = scanner.nextInt();

				switch (choice) {
				    case 1:
				        System.out.println("고객은 거래를 기억하지 못합니다. 단서 부족으로 사건이 미궁에 빠졌습니다.");
				        break;
				    case 2:
				        System.out.println("감사팀이 조사에 착수했지만 시간이 오래 걸립니다. 보상 없음.");
				        break;
				    case 3:
				        System.out.println("입금 경로 추적 성공! 🎉 보너스 ₩100,000 지급!");
				        for (int i1 = 0; i1 < balance.length; i1++) {
				            if (id[i1] != null && id[i1].equals(tempid)) {
				                balance[i1] += 100000;
				                break;
				            }
				        }
				        break;
				    default:
				        System.out.println("잘못된 선택입니다.");
				}

					} 
					
				}
			}
			}
		}
}


// tempid==id[0] pass==pass[0] user=0
// id==id[0] pass==pass[0] user=1
// if(id==id[i] && pass==pass[0]) {find=i; break;}
// for(int i=0; i<id.length;i++)
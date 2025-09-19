package com.company.java005_ex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

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
			System.out.print(
						    "🔍🔐 === 🕵️‍♂️ 셜록 뱅크: 미스터리 사건 파일 === 🔐🔍\n" +
						    "1. 📂 사건 파일 등록 - 새로운 미스터리를 기록합니다.\n" +
						    "2. 🧾 사건 정보 열람 - 단서와 배경을 조사합니다.\n" +
						    "3. 📦 증거 보관소 입금 - 수집한 증거를 안전하게 보관합니다.\n" +
						    "4. 🧤 증거 인출 요청 - 분석을 위해 증거를 꺼냅니다.\n" +
						    "5. 🔥 사건 파일 폐기 - 종결된 사건을 정리합니다.\n" +
						    "6. 🎭 추리 게임 - 탐정의 직감을 시험해 보세요.\n" +
						    "7. 🗂️ 전체 사건 열람 - 모든 미스터리를 한눈에 확인합니다.\n" +
						    "8. 🧵 심리 분석기 - 탐정의 투자 심리를 정리합니다.\n" +
						    "9. 🚕 사건 현장 시뮬레이션 - 시간과 공간을 넘나드는 추적.\n" +
						    "10. 🚪 사건 종료 - 탐정 사무소에서 나갑니다.\n" +
						    "🖋️ 사건 번호 입력 >>> "
					
				);
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
			} else if (num == 2 || num == 3 || num == 4 || num == 5 || num == 6 || num == 7 || num == 8 || num == 9) {
				int find = -1;
				String tempid = "";
				String temppass = "";
				System.out.print("아이디 입력: ");
				tempid = scanner.next();
				System.out.print("비밀 번호 입력: ");
				temppass = scanner.next();
				for (int i = 0; i < id.length; i++) {
					if (tempid.equals(id[i]) && temppass.equals(pass[i])) {
						find = i;
						break;
					}
				}
				switch (num) {
				case 2:
					System.out.println("사건 조회 중입니다.");
					// 사용자에게 임시 아이디와 임시 비번 입력받기
					// 아이디와 비번이 맞다면 사용자 정보 출력
					// 아니라면 사용자 정보를 다시 확인해 주세요
					System.out.println("==사건 조회");
					if (id[find].equals(tempid) && pass[find].equals(temppass)) {
						System.out.println("ID:" + id[find]);
						System.out.println("PASS:" + pass[find]);
						System.out.println("잔액:" + balance[find]);
						// 조회 시
						if (balance[find] >= 5000000) {
					        System.out.println("등급: 🎩 명탐정");
					    } else if (balance[find] >= 1000000) {
					        System.out.println("등급: 🕵️‍♂️ 수석 조사관");
					    } else {
					        System.out.println("등급: 🔍 견습 탐정");
					    }

					} else {
						System.out.println("사건 정보를 확인해 주세요.");
					}
					break;
				case 3: {
					System.out.println("증거 입금 중입니다.");
				    if (find != -1) {
				        System.out.print("입금: ");
				        double balance2 = scanner.nextDouble();
				        balance[find] += balance2;
				        depositCount++;
				        totalDeposit += balance2;
				        System.out.println("✅ 입금 완료\n잔액: " + balance[find]);
				        
				        if (Math.random() < 0.1) {
				            System.out.println("🎮 미니게임 이벤트 발생! 숫자 맞추기 도전!");
				            // case 6 로직 호출
				        }
				    } else {
				        System.out.println("사건 정보를 확인해 주세요.");
				    }
				}
				break;
				case 4: {
				    System.out.println("증거 출금 중입니다.");
				    if (find != -1) {
				        System.out.print("출금: ");
				        double balance3 = scanner.nextDouble();
				        if (balance[find] - balance3 >= 0) {
				            balance[find] -= balance3;
				            withdrawCount++;
				            totalWithdraw += balance3;
				            System.out.println("✅ 출금 완료\n잔액: " + balance[find]);
				        } else {
				            System.out.println("잔액이 모자릅니다.");
				        }

				        if (Math.random() < 0.1) {
				            System.out.println("🎮 미니게임 이벤트 발생! 숫자 맞추기 도전!");
				            // case 6 로직 호출
				        }
				    } else {
				        System.out.println("사건 정보를 확인해 주세요.");
				    }
				}
				break;

				case 5: {
				    System.out.println("사건 파일 폐기 중입니다.");
				    if (find != -1) {
				        System.out.println("사건 파일을 삭제하시겠습니까? (Y/N)");
				        char delete = scanner.next().charAt(0);
				        if (delete == 'Y' || delete == 'y') {
				            id[find] = null;
				            pass[find] = null;
				            balance[find] = 0;
				            System.out.println("✅ 사건 파일이 폐기되었습니다.");
				        }
				    } else {
				        System.out.println("사건 정보를 확인해 주세요.");
				    }
				}
				break;

				case 6: {
				    if (find != -1) {
				        System.out.println("🏦 은행 추리 챌린지에 오신 걸 환영합니다!");
				        System.out.println("🧠 오늘은 세 명의 NPC가 조언을 해줍니다. 누구를 믿을지는 당신의 선택입니다...");

				        int secretNum = (int) (Math.random() * 10) + 1;
				        boolean success = false;

				        // NPC 설정
				        String[] npcNames = {"청소부 할머니", "경비원 아저씨", "은행장님"};
				        boolean[] npcTruths = new boolean[3];
				        for (int i = 0; i < 3; i++) {
				            npcTruths[i] = Math.random() < 0.5; // 진실 여부 랜덤
				        }

				        // NPC 조언 출력
				        System.out.println("👥 NPC들의 조언:");
				        for (int i = 0; i < 3; i++) {
				            String truthHint = (secretNum % 2 == 0) ? "짝수" : "홀수";
				            String lieHint = (secretNum % 2 == 0) ? "홀수" : "짝수";
				            String hint = npcTruths[i] ? truthHint : lieHint;

				            switch (npcNames[i]) {
				                case "청소부 할머니":
				                    System.out.printf("🧓 %s: \"내가 살아보니 말이야, %s가 정답일 확률이 높더라고. 믿거나 말거나~\"\n", npcNames[i], hint);
				                    break;
				                case "경비원 아저씨":
				                    System.out.printf("👮 %s: \"내가 본 바로는 %s가 정답일 거야. 틀릴 리가 없지.\"\n", npcNames[i], hint);
				                    break;
				                case "은행장님":
				                    System.out.printf("🧑‍💼 %s: \"내 경험상 말이야, 이건 확실해. %s가 정답이야.\"\n", npcNames[i], hint);
				                    break;
				            }
				        }

				        System.out.println("🎯 1부터 10까지 숫자 중 하나를 맞춰보세요! 기회는 3번입니다.");

				        for (int i = 0; i < 3; i++) {
				            System.out.print("🔎 " + (i + 1) + "번째 시도 >>> ");
				            int guess = scanner.nextInt();

				            // 2번째 시도 후 시스템 힌트 제공
				            if (i == 1) {
				                System.out.println("📡 시스템 힌트 도착!");
				                System.out.println("💡 정답은 " + (secretNum % 2 == 0 ? "짝수" : "홀수") + "입니다.");
				                System.out.println("💡 정답은 " + (secretNum <= 5 ? "1~5 사이" : "6~10 사이") + "입니다.");
				            }

				            // 정답 판별
				            if (guess == secretNum) {
				                success = true;
				                break;
				            } else if (guess > secretNum) {
				                System.out.println("📉 너무 높아요!");
				            } else {
				                System.out.println("📈 너무 낮아요!");
				            }
				        }

				        // 결과 처리
				        if (success) {
				            double bonus = balance[find] * 0.05;
				            balance[find] += bonus;
				            System.out.printf("🎉 정답은 %d! 보너스 이자 %.2f원이 지급되었습니다.\n", secretNum, bonus);
				            System.out.printf("💳 현재 잔액: %.2f\n", balance[find]);
				            System.out.println("🏅 칭호 획득: '심리 추리 마스터'");

				            // NPC 진실 여부 요약
				            System.out.println("🧾 NPC 진실 여부:");
				            for (int i = 0; i < 3; i++) {
				                System.out.printf("🔍 %s: %s\n", npcNames[i], npcTruths[i] ? "진실" : "거짓");
				            }
				        } else {
				            System.out.println("😢 아쉽네요. 정답은 " + secretNum + "였습니다.");
				            double consolation = balance[find] * 0.01;
				            balance[find] += consolation;
				            System.out.printf("💔 위로 이자 %.2f원이 지급되었습니다. 현재 잔액: %.2f\n", consolation, balance[find]);

				            // NPC 진실 여부 요약
				            System.out.println("🧾 NPC 진실 여부:");
				            for (int i = 0; i < 3; i++) {
				                System.out.printf("🔍 %s: %s\n", npcNames[i], npcTruths[i] ? "진실" : "거짓");
				            }
				        }
				    } else {
				        System.out.println("⚠️ 사건 정보를 먼저 확인해 주세요.");
				    }
				}
				break;

				case 7: {
				    System.out.println("📊 사건 통계 조회");
				    System.out.println("입금 횟수: " + depositCount);
				    System.out.println("총 입금액: " + totalDeposit + "원");
				    System.out.println("출금 횟수: " + withdrawCount);
				    System.out.println("총 출금액: " + totalWithdraw + "원");
				    for (int i = 0; i < balance.length; i++) {
				        if (id[i] != null && !id[i].isEmpty()) {
				            System.out.println("[" + id[i] + "] 현재 잔액: " + balance[i] + "원");
				        }
				    }
				}
				break;

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
				                avgBalance += balance[find];
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
				}
				break;

				case 9: {
				    System.out.println("🧳 사건 여행 시뮬레이션");
				    System.out.println("🌍 사건지를 선택하세요:");
				    System.out.println("1. 런던 금융가");
				    System.out.println("2. 도쿄 암호화폐 거래소");
				    System.out.println("3. 뉴욕 고급 호텔");
				    System.out.println("4. 베를린 미술품 경매장");
				    System.out.print("선택 >>> ");
				    int location = scanner.nextInt();

				    if (find == -1) {
				        System.out.println("사건 정보를 확인해 주세요.");
				        break;
				    }

				    Random rand = new Random();
				    int outcome = rand.nextInt(3); // 0, 1, 2

				    switch (location) {
				        case 1: // 런던 금융가
				            System.out.println("📍 장소: 런던 금융가\n상황: 고객 계좌에서 미확인 입금 발생");
				            System.out.println("1. 고객에게 직접 연락한다");
				            System.out.println("2. 내부 감사팀에 보고한다");
				            System.out.println("3. 입금 경로를 추적한다");
				            break;

				        case 2: // 도쿄 암호화폐 거래소
				            System.out.println("📍 장소: 도쿄 암호화폐 거래소\n상황: 지갑 주소 간의 불법 자금 흐름 의심");
				            System.out.println("1. 블록체인 분석 도구를 사용한다");
				            System.out.println("2. 거래소 관리자에게 문의한다");
				            System.out.println("3. 해커 커뮤니티를 잠입 조사한다");
				            break;

				        case 3: // 뉴욕 고급 호텔
				            System.out.println("📍 장소: 뉴욕 고급 호텔\n상황: VIP 고객의 카드가 도난당함");
				            System.out.println("1. CCTV를 분석한다");
				            System.out.println("2. 카드 사용 내역을 추적한다");
				            System.out.println("3. 호텔 직원들을 심문한다");
				            break;

				        case 4: // 베를린 미술품 경매장
				            System.out.println("📍 장소: 베를린 미술품 경매장\n상황: 위조된 작품이 낙찰됨");
				            System.out.println("1. 작품 감정 전문가에게 의뢰한다");
				            System.out.println("2. 낙찰자와 접촉한다");
				            System.out.println("3. 경매장 내부 기록을 조사한다");
				            break;

				        default:
				            System.out.println("잘못된 장소 선택입니다.");
				            break;
				    }

				    System.out.print("행동 선택 >>> ");
				    int choice = scanner.nextInt();

				    // 결과 처리
				    switch (location) {
				        case 1: // 런던 금융가
				            switch (choice) {
				            case 1:
				                System.out.println(outcome == 0 ? 
				                    "고객이 연락을 끊었습니다. 사건 미궁. 보상 없음." : 
				                    outcome == 1 ? 
				                    "고객이 거래 내역을 기억해냅니다! 단서 확보! ₩70,000 지급!" : 
				                    "고객이 의심하며 협조를 거부합니다. 수사 난항. 보상 없음.");
				                if (outcome == 1) balance[find] += 70000;
				                    break;
				                case 2:
				                    System.out.println(outcome == 0 ? "감사팀이 조사에 착수했지만 지연됨. 보상 없음." :
				                                       outcome == 1 ? "감사팀이 보너스 ₩50,000 지급!" :
				                                                      "감사팀이 실수로 다른 사건을 조사함.");
				                    if (outcome == 1) balance[find] += 50000;
				                    break;
				                case 3:
				                    System.out.println(outcome == 0 ? "입금 경로 추적 성공! ₩100,000 지급!" :
				                                       outcome == 1 ? "해커 흔적 발견! ₩150,000 지급!" :
				                                                      "암호화된 경로로 추적 실패.");
				                    if (outcome == 0) balance[find] += 100000;
				                    else if (outcome == 1) balance[find] += 150000;
				                    break;
				                default:
				                    System.out.println("잘못된 선택입니다.");
				            }
				            break;

				        case 2: // 도쿄 암호화폐 거래소
				            switch (choice) {
				                case 1:
				                    System.out.println(outcome == 0 ? "분석 도구 오류 발생. 정보 부족." :
				                                       outcome == 1 ? "자금 흐름 포착! ₩70,000 지급!" :
				                                                      "의심 주소가 삭제됨. 추적 실패.");
				                    if (outcome == 1) balance[find] += 70000;
				                    break;
				                case 2:
				                    System.out.println(outcome == 0 ? "관리자가 협조를 거부함." :
				                                       outcome == 1 ? "관리자가 내부 로그 제공! ₩50,000 지급!" :
				                                                      "관리자가 실수로 다른 지갑 정보를 제공.");
				                    if (outcome == 1) balance[find] += 50000;
				                    break;
				                case 3:
				                    System.out.println(outcome == 0 ? "커뮤니티 접근 실패. 정체 발각됨." :
				                                       outcome == 1 ? "해커와 접촉 성공! ₩120,000 지급!" :
				                                                      "정보는 얻었지만 신뢰도 낮음.");
				                    if (outcome == 1) balance[find] += 120000;
				                    break;
				                default:
				                    System.out.println("잘못된 선택입니다.");
				            }
				            break;

				        case 3: // 뉴욕 고급 호텔
				            switch (choice) {
				                case 1:
				                    System.out.println(outcome == 0 ? "CCTV 화질 불량. 단서 없음." :
				                                       outcome == 1 ? "용의자 포착! ₩80,000 지급!" :
				                                                      "CCTV가 삭제됨. 수사 중단.");
				                    if (outcome == 1) balance[find] += 80000;
				                    break;
				                case 2:
				                    System.out.println(outcome == 0 ? "사용 내역이 평범함. 단서 없음." :
				                                       outcome == 1 ? "도난 시점 확인! ₩60,000 지급!" :
				                                                      "카드가 해외에서 사용됨. 추적 어려움.");
				                    if (outcome == 1) balance[find] += 60000;
				                    break;
				                case 3:
				                    System.out.println(outcome == 0 ? "직원들이 협조하지 않음." :
				                                       outcome == 1 ? "직원이 용의자 목격! ₩90,000 지급!" :
				                                                      "직원 진술이 엇갈림. 혼란 가중.");
				                    if (outcome == 1) balance[find] += 90000;
				                    break;
				                default:
				                    System.out.println("잘못된 선택입니다.");
				            }
				            break;

				        case 4: // 베를린 미술품 경매장
				            switch (choice) {
				                case 1:
				                    System.out.println(outcome == 0 ? "감정 결과 불확실. 추가 조사 필요." :
				                                       outcome == 1 ? "위조 판명! ₩110,000 지급!" :
				                                                      "감정사가 실수함. 신뢰도 하락.");
				                    if (outcome == 1) balance[find] += 110000;
				                    break;
				                case 2:
				                    System.out.println(outcome == 0 ? "낙찰자가 연락 두절." :
				                                       outcome == 1 ? "낙찰자가 위조 사실 인정! ₩70,000 지급!" :
				                                                      "낙찰자가 법적 대응 예고.");
				                    if (outcome == 1) balance[find] += 70000;
				                    break;
				                case 3:
				                    System.out.println(outcome == 0 ? "기록이 누락됨. 단서 없음." :
				                                       outcome == 1 ? "위조 흔적 발견! ₩130,000 지급!" :
				                                                      "기록이 조작됨. 수사 혼란.");
				                    if (outcome == 1) balance[find] += 130000;
				                    break;
				                default:
				                    System.out.println("잘못된 선택입니다.");
				            }
				            break;
				    }
				}
				break;
				}
			}
			else if (num == 10) {
		        System.out.println("🕵️‍♂️ 오늘도 진실을 향한 여정이 끝났습니다. 다음 사건에서 만나요.");}
		}
	}
}
	
// tempid==id[0] pass==pass[0] user=0
// id==id[0] pass==pass[0] user=1
// if(id==id[i] && pass==pass[0]) {find=i; break;}
// for(int i=0; i<id.length;i++)
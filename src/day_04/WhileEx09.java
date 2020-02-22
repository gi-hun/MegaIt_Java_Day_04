/*
 * # ATM[2단계]
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 */
//01:09-01:19

package day_04;

import java.util.Scanner;

public class WhileEx09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean run = true;
		while(true) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("입금할 돈을 입력하시오");
				int money = sc.nextInt();
				myMoney = myMoney + money;
			}
			else if(select == 2) {
				System.out.println("출금할 돈을 입력하시오");
				int money = sc.nextInt();
				if(money > myMoney)
				{
					System.out.println("잔액이 부족합니다.");
				}
				else
				{
					myMoney = myMoney - money;
				}
			}
			else if(select == 3) {
				System.out.println("상대방의 계좌를 입력하시오");
				int input = sc.nextInt();
				
				if(input == yourAcc)
				{
					System.out.println("이체할 돈을 입력하시오");
					int money = sc.nextInt();
					if(money > myMoney)
					{
						System.out.println("잔액이 부족합니다.");
					}
					else
					{
						yourMoney = yourMoney + money;
						myMoney = myMoney - money;
					}
				}
				else
				{
					System.out.println("상대방의 계좌를 확인해주세요");
				}
			}
			else if(select == 4) {
				System.out.println("내 계좌 잔액"+myMoney);
				System.out.println("상대방 계좌 잔액"+yourMoney);
			}
			else if(select == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}

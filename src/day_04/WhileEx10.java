/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 */
//01:21-01:41

package day_04;

import java.util.Scanner;

public class WhileEx10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		int count = 0;
		
		while(true) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				if(count == 1)
				{
					System.out.println("이미 로그인 되어있는 상태 입니다.");
					break;
				}
				
				System.out.println("아이디를 입력하여라");
				int ID = sc.nextInt();
				if(ID == dbAcc1)
				{
					System.out.println("비밀번호를 입력해주세요");
					int PW = sc.nextInt();
					if(PW == dbPw1)
					{
						System.out.println("로그인 성공하였습니다");
						count++;
					}
					else
					{
						System.out.println("비밀번호를 확인해주세요");
					}
				}
				else if(ID == dbAcc2)
				{
					System.out.println("비밀번호를 입력해주세요");
					int PW = sc.nextInt();
					if(PW == dbPw2)
					{
						System.out.println("로그인 성공하였습니다");
						count++;
					}
					else
					{
						System.out.println("비밀번호를 확인해주세요");
					}
				}
				else
				{
					System.out.println("ID를 확인해주세요");
				}
			}
			
			else if(select == 2) {
				if(count == 1)
				{
					count--;
					System.out.println("로그아웃 되었습니다");
				}
			}
			
			else if(select == 3) {
				if(count == 1)
				{
					System.out.println("입금할 계좌를 선택해주세요");
					int acc = sc.nextInt();
					if(acc == dbAcc1)
					{
						System.out.println("입금할 돈을 입력해주세요");
						int money = sc.nextInt();
						dbMoney1 = dbMoney1 + money;
					}
					else if(acc == dbAcc2)
					{
						System.out.println("입금할 돈을 입력해주세요");
						int money = sc.nextInt();
						dbMoney2 = dbMoney2 + money;
					}
					else
					{
						System.out.println("계좌를 확인해주세요");
					}
				}
				else
				{
					System.out.println("로그인 후 사용해주세요");
				}
			}
			else if(select == 4) {
				if(count == 1)
				{
					System.out.println("출금할 계좌를 선택해주세요");
					int acc = sc.nextInt();
					if(acc == dbAcc1)
					{
						System.out.println("출금할 돈을 입력해주세요");
						int money = sc.nextInt();
						if(dbMoney1 < money)
						{
							System.out.println("잔고가 부족합니다.");
						}
						else
						{
							dbMoney1 = dbMoney1 - money;
						}
					}
					else if(acc == dbAcc2)
					{
						System.out.println("출금할 돈을 입력해주세요");
						int money = sc.nextInt();
						if(dbMoney2 < money)
						{
							System.out.println("잔고가 부족합니다.");
						}
						else
						{
							dbMoney2 = dbMoney2 - money;
						}
					}
					else
					{
						System.out.println("계좌를 확인해주세요");
					}
				}
				else
				{
					System.out.println("로그인 후 사용해주세요");
				}
			}
			else if(select == 5) {
				if(count == 1)
				{
					System.out.println("이체할 계좌를 선택해주세요");
					int acc = sc.nextInt();
					if(acc == dbAcc1)
					{
						System.out.println("이체할 돈을 입력해주세요");
						int money = sc.nextInt();
						if(dbMoney1 < money)
						{
							System.out.println("잔고가 부족합니다.");
						}
						else
						{
							dbMoney1 = dbMoney1 + money;
							dbMoney2 = dbMoney2 - money;
						}
					}
					else if(acc == dbAcc2)
					{
						System.out.println("이체할 돈을 입력해주세요");
						int money = sc.nextInt();
						if(dbMoney2 < money)
						{
							System.out.println("잔고가 부족합니다.");
						}
						else
						{
							dbMoney1 = dbMoney1 - money;
							dbMoney2 = dbMoney2 + money;
						}
					}
					else
					{
						System.out.println("계좌를 확인해주세요");
					}
				}
				else
				{
					System.out.println("로그인 후 사용해주세요");
				}
			}
			else if(select == 6) {
				System.out.println("dbAcc1의 잔액:"+dbMoney1);
				System.out.println("dbAcc1의 잔액:"+dbMoney2);
			}
			else if(select == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}

	}
}

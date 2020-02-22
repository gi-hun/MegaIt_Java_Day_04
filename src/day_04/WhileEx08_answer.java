/*
 * # ATM[2단계]
 * 1. 로그인
 * 2. 로그아웃
 */


package day_04;

import java.util.Scanner;

public class WhileEx08_answer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		while(true)
		{
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					System.out.println("계좌번호 입력: ");
					int myAcc = sc.nextInt();
					
					System.out.println("비밀번호 입력: ");
					int myPw = sc.nextInt();
					
					if(myAcc == dbAcc1 && myPw == dbPw1)
					{
						log = 1;
						System.out.println(dbAcc1 + "님, 환영합니다.");
					}
					else if(myAcc == dbAcc2 && myPw == dbPw2)
					{
						log = 2;
						System.out.println(dbAcc2+"님, 환영합니다.");
					}
					else {
						System.out.println("계좌번호와 비밀번호를 확인해주세요");
					}
				}
				else {
					if(log == 1)
					{
						System.out.println("현재 " + dbAcc1 + "님, 로그인 중...");
					}
					else if(log ==2)
					{
						System.out.println("현재 " + dbAcc2 + "님, 로그인 중...");
					}
				}
			}
			else if(sel == 2) {
				if(log != -1)
				{
					log = -1;
					System.out.println("로그아웃되었습니다.");
				}
				else {
					System.out.println("로그인후 이용해주세요");
				}
			}
			else if(sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}

		}


	}
}

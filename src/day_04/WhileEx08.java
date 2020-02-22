/*
 * # ATM[2단계]
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 */
//12:37-12:53
package day_04;

import java.util.Scanner;

public class WhileEx08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int count = 0;
		
		while(true) {
						
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				if(count == 1)
				{
					System.out.println("이미 로그인 되어있는 상태 입니다.");
					break;
				}
				
				System.out.println("아이디를 입력해주세요");
				int ID = sc.nextInt();
				
				if(ID == dbAcc1)
				{
					System.out.println("비밀번호를 입력해주세요");
					int PW = sc.nextInt();
					if(PW == dbPw1)
					{
						System.out.println("로그인 성공");
						count++;
						System.out.println(count);
					}
					else if(PW != dbPw1)
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
						System.out.println("로그인 성공");
						count++;
						System.out.println(count);
					}
					else if(PW != dbPw2)
					{
						System.out.println("비밀번호를 확인해주세요");
					}
				}
				else
				{
					System.out.println("아이디를 확인해주세요");
				}
				
			}
			if(select == 2) {
				if(count == 1)
				{
					System.out.println("로그아웃 되었습니다.");
					count--;
				}
			}
			if(select == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}

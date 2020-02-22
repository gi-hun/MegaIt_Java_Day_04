/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */
//11:57-12:09
package day_04;

import java.util.Scanner;

public class WhileEx05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		int i = 0;
		int total = 0;     //전체 값
		int num = 1;
	
		while(i<5)
		{
			System.out.println(num+".메뉴를 선택해주세요");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				cnt1++;
			}
			else if(select == 2)
			{
				cnt2++;
			}
			else if(select == 3)
			{
				cnt3++;
			}
			num++;
			i++;
		}
		
		total = price1*cnt1 + price2*cnt2 + price3*cnt3;
		System.out.println("총 금액:"+total);
		System.out.println("현금을 입력해주세요:");
		int cash = sc.nextInt();
		
		if(total > cash)
		{
			System.out.println("현금이 부족합니다.");
		}
		else
		{
			System.out.println("=== 롯데리아 영수증===");
			System.out.println("1.불고기 버거 : " + cnt1 + "개");
			System.out.println("2.새우    버거 : " + cnt2 + "개");
			System.out.println("3.콜         라 : " + cnt3 + "개");
			System.out.println("4.총    금   액 : " +total+ "원");
			System.out.println("5.잔          돈:"+(cash-total));
		}
	}
}

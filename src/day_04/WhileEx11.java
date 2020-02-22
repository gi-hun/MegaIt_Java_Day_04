/*
 * # 베스킨라빈스31
 * 1. p1과 p2가 번갈아가면서 1~3을 입력한다.
 * 2. br은 p1과 p2의 입력값을 누적해서 저장한다.
 * 3. br이 31을 넘으면 게임은 종료된다.
 * 4. 승리자를 출력한다.
 * 
 * 예) 
 * 1턴 : p1(2)	br(2)
 * 2턴 : p2(1)	br(3)
 * 3턴 : p1(3)	br(6)
 * ...
 */
//01:43-01:50

package day_04;

import java.util.Scanner;

public class WhileEx11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true)
		{
			System.out.println("p1의 숫자를 입력하시오");
			int num1 = sc.nextInt();
			sum = sum + num1;
			System.out.println("sum:" + sum);
			if(sum > 31)
			{
				System.out.println("p1이 31을 넘겼습니다. 게임 종료");
				break;
			}
			
			System.out.println("p2의 숫자를 입력하시오");
			int num2 = sc.nextInt();
			sum = sum + num2;
			System.out.println("sum:" + sum);
			if(sum > 31)
			{
				System.out.println("p2가 31을 넘겼습니다. 게임 종료");
				break;
			}
			
		}
	}
}

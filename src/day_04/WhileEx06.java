/*
 * # 반복문 종료(-100)
 * 1. 무한 반복을 하면서 숫자를 입력받는다.
 * 2. 입력한 숫자가 -100이면, 프로그램은 종료된다.
 */
//12:10-12:13

package day_04;

import java.util.Scanner;

public class WhileEx06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		/*boolean run = true;
		while(run == true)
		{
			if(num == -100)
			{
				run = false;
			}
		}*/
		
		while(i < 100)
		{
			System.out.println("숫자를 입력해주세요");
			int num = sc.nextInt();
			
			if(num == -100)
			{
				System.out.println("-100이 입력되면 프로그램은 종료합니다.");
				return;
			}
		}
	}
}

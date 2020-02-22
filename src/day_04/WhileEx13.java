/*
 * # 소수찾기[1단계]
 * 1. 소수란, 1과 자기자신으로만 나눠지는 수
 * 2. 예) 2, 3, 5, 7, 11, 13, ..
 * 3. 힌트
 * 1) 해당 숫자를 1부터 자기자신까지 나눈다.
 * 2) 나머지가 0일 때마다 카운트를 센다.
 * 3) 그 카운트 값이 2이면 소수이다.
 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	소수x
 * 
 * 정수 한 개를 입력받아, 해당 숫자가 소수인지 아닌지 판별한다.
 */

package day_04;

import java.util.Scanner;

public class WhileEx13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("숫자를 한개 입력하여라");
			int input = sc.nextInt();
			
			if(input==0)
			{
				System.out.println("프로그램 종료");
				break;
				
			}
			int num = 1;
			int count = 0;
			
			while(num <= input)
			{
				if((input % num) == 0)
					
				{
					count++;
				}
				num++;
			}
	
			if(count == 2)
			{
				
				System.out.println(num-1 + "은 소수이다.");
			}
			else
			{
				System.out.println(num-1 + "은 소수가 아니다");
			}
			System.out.println("");
		}
	}
}

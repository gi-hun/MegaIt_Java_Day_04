/*
 * # Up & Down 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */
//12:17-12:25

package day_04;

import java.util.Scanner;
import java.util.Random;

public class WhileEx07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int count = 0;
		boolean run = true;
		
		while(run == true)
		{
			int com = ran.nextInt(100) + 1;
			//1~100까지 생성
			System.out.println("랜덤 숫자="+com);
			
			System.out.println("정답은 무엇인가요?");
			int me = sc.nextInt();
			
			if(me < com)
			{
				System.out.println("UP!");
				count++;
			}
			else if(me > com)
			{
				count++;
				System.out.println("DOWN!");
			}
			else if(me == com)
			{
				System.out.println("BINGO!");
				System.out.println("정답이라서 프로그램이 종료됩니다.");
				run = false;
			}
		}
		
		int total = 100-5*count;
		System.out.println("총점수는=" + total);
	}
}

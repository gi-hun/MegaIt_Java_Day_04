/*
 * # Up & Down 게임[2단계]
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 */

package day_04;

import java.util.Random;
import java.util.Scanner;

public class WhileEx07_mine {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
	
		int count = 0;
		
		while(true) {
			int com = ran.nextInt(100) + 1;     ////1~100까지 생성
			
			System.out.println(com);
			System.out.println("숫자를 입력하시오");
			int me = sc.nextInt();
			
			if(com > me) {
				System.out.println("UP!");
				count = count++;
			}
			else if (com < me) {
				System.out.println("DOWN!");
				count = count++;
			}
			else if (com == me) {
				System.out.println("BINGO!");
				break;
			}
		}
		int total = 100 - 5*count;
		//return 사용하면 반복문 끝나는걸로 인식하지 못한다.
	}
}

//신기하네


package day_04;

import java.util.Scanner;

public class WhileEx11_answer {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int p1 = 0;
		int p2 = 0;
		
		int br = 0;
		int turn = 0;
		
		boolean run = true;
		while(run) {
			
			if(turn % 2 == 0) {     //짝수턴
				System.out.print("[p1차례]1~3 입력 : ");
				p1 = scan.nextInt();
				br = br + p1;
				turn += 1;
			}
			else if(turn % 2 == 1) {     //홀수턴
				System.out.print("[p2차례]1~3 입력 : ");
				p2 = scan.nextInt();
				br = br + p2;
				turn += 1;
			}
			System.out.println("br = " + br);     //p1, p2 합 저장하는 변수 br
			
			if(br >= 10) {
				if(turn % 2 == 0) {
					System.out.println("[p1]승리");
				}
				else if(turn % 2 == 1) {
					System.out.println("[p2]승리");
				}
				run = false;
				System.out.println("게임 종료");
			}
		}
		
	}
}

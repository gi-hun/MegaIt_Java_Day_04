//�ű��ϳ�


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
			
			if(turn % 2 == 0) {     //¦����
				System.out.print("[p1����]1~3 �Է� : ");
				p1 = scan.nextInt();
				br = br + p1;
				turn += 1;
			}
			else if(turn % 2 == 1) {     //Ȧ����
				System.out.print("[p2����]1~3 �Է� : ");
				p2 = scan.nextInt();
				br = br + p2;
				turn += 1;
			}
			System.out.println("br = " + br);     //p1, p2 �� �����ϴ� ���� br
			
			if(br >= 10) {
				if(turn % 2 == 0) {
					System.out.println("[p1]�¸�");
				}
				else if(turn % 2 == 1) {
					System.out.println("[p2]�¸�");
				}
				run = false;
				System.out.println("���� ����");
			}
		}
		
	}
}

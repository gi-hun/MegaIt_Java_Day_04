/*
 * # ATM[2�ܰ�]
 * 1. �Ա�
 * . �Ա��� �ݾ��� �Է¹޾�, myMoney�� �Ա�
 * 2. ���
 * . ����� �ݾ��� �Է¹޾�, myMoney���� ���
 * . ��, ����� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ݺҰ�
 * 3. ��ü
 * . yourAcc ���¹�ȣ�� �Է¹޾�, ��ü
 * . ��ü�� �ݾ��� myMoney �ܾ��� �ʰ��� ��� ��ü �Ұ�
 * . ��ü �� yourMoney �ܾ� ����
 * 4. ��ȸ
 * . myMoney�� yourMoney �ܾ� ��� ���
 */
//01:09-01:19

package day_04;

import java.util.Scanner;

public class WhileEx09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean run = true;
		while(true) {
			
			System.out.println("1.�Ա�");
			System.out.println("2.���");
			System.out.println("3.��ü");
			System.out.println("4.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				System.out.println("�Ա��� ���� �Է��Ͻÿ�");
				int money = sc.nextInt();
				myMoney = myMoney + money;
			}
			else if(select == 2) {
				System.out.println("����� ���� �Է��Ͻÿ�");
				int money = sc.nextInt();
				if(money > myMoney)
				{
					System.out.println("�ܾ��� �����մϴ�.");
				}
				else
				{
					myMoney = myMoney - money;
				}
			}
			else if(select == 3) {
				System.out.println("������ ���¸� �Է��Ͻÿ�");
				int input = sc.nextInt();
				
				if(input == yourAcc)
				{
					System.out.println("��ü�� ���� �Է��Ͻÿ�");
					int money = sc.nextInt();
					if(money > myMoney)
					{
						System.out.println("�ܾ��� �����մϴ�.");
					}
					else
					{
						yourMoney = yourMoney + money;
						myMoney = myMoney - money;
					}
				}
				else
				{
					System.out.println("������ ���¸� Ȯ�����ּ���");
				}
			}
			else if(select == 4) {
				System.out.println("�� ���� �ܾ�"+myMoney);
				System.out.println("���� ���� �ܾ�"+yourMoney);
			}
			else if(select == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}

/*
 * # ATM[2�ܰ�]
 * 1. �α���
 * 2. �α׾ƿ�
 */


package day_04;

import java.util.Scanner;

public class WhileEx08_answer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int log = -1;						// -1(�α׾ƿ�), 1(dbAcc1�α���), 2(dbAcc2�α���)
		
		while(true)
		{
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					System.out.println("���¹�ȣ �Է�: ");
					int myAcc = sc.nextInt();
					
					System.out.println("��й�ȣ �Է�: ");
					int myPw = sc.nextInt();
					
					if(myAcc == dbAcc1 && myPw == dbPw1)
					{
						log = 1;
						System.out.println(dbAcc1 + "��, ȯ���մϴ�.");
					}
					else if(myAcc == dbAcc2 && myPw == dbPw2)
					{
						log = 2;
						System.out.println(dbAcc2+"��, ȯ���մϴ�.");
					}
					else {
						System.out.println("���¹�ȣ�� ��й�ȣ�� Ȯ�����ּ���");
					}
				}
				else {
					if(log == 1)
					{
						System.out.println("���� " + dbAcc1 + "��, �α��� ��...");
					}
					else if(log ==2)
					{
						System.out.println("���� " + dbAcc2 + "��, �α��� ��...");
					}
				}
			}
			else if(sel == 2) {
				if(log != -1)
				{
					log = -1;
					System.out.println("�α׾ƿ��Ǿ����ϴ�.");
				}
				else {
					System.out.println("�α����� �̿����ּ���");
				}
			}
			else if(sel == 0) {
				System.out.println("���α׷� ����");
				break;
			}

		}


	}
}

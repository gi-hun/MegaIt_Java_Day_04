/*
 * # ATM[2�ܰ�]
 * 1. �α���
 * . �α��� �� �� �α��� �Ұ�
 * . �α׾ƿ� ���¿����� �̿� ����
 * 2. �α׾ƿ�
 * . �α��� �� �̿밡��
 */
//12:37-12:53
package day_04;

import java.util.Scanner;

public class WhileEx08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int count = 0;
		
		while(true) {
						
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				if(count == 1)
				{
					System.out.println("�̹� �α��� �Ǿ��ִ� ���� �Դϴ�.");
					break;
				}
				
				System.out.println("���̵� �Է����ּ���");
				int ID = sc.nextInt();
				
				if(ID == dbAcc1)
				{
					System.out.println("��й�ȣ�� �Է����ּ���");
					int PW = sc.nextInt();
					if(PW == dbPw1)
					{
						System.out.println("�α��� ����");
						count++;
						System.out.println(count);
					}
					else if(PW != dbPw1)
					{
						System.out.println("��й�ȣ�� Ȯ�����ּ���");
					}
				}
				else if(ID == dbAcc2)
				{
					System.out.println("��й�ȣ�� �Է����ּ���");
					int PW = sc.nextInt();
					if(PW == dbPw2)
					{
						System.out.println("�α��� ����");
						count++;
						System.out.println(count);
					}
					else if(PW != dbPw2)
					{
						System.out.println("��й�ȣ�� Ȯ�����ּ���");
					}
				}
				else
				{
					System.out.println("���̵� Ȯ�����ּ���");
				}
				
			}
			if(select == 2) {
				if(count == 1)
				{
					System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
					count--;
				}
			}
			if(select == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}
	}
}

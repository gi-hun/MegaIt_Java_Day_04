/*
 * # ATM[2�ܰ�]
 * 1. �α���
 * . �α��� �� �� �α��� �Ұ�
 * . �α׾ƿ� ���¿����� �̿� ����
 * 2. �α׾ƿ�
 * . �α��� �� �̿밡��
 * 3. �Ա�
 * . �α��� �� �̿밡��
 * 4. ���
 * . �α��� �� �̿밡��
 * 5. ��ü
 * . �α��� �� �̿밡��
 * 6. ��ȸ
 * . �α��� �� �̿밡��
 * 7. ����
 */
//01:21-01:41

package day_04;

import java.util.Scanner;

public class WhileEx10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		int count = 0;
		
		while(true) {
			
			System.out.println("1.�α���");
			System.out.println("2.�α׾ƿ�");
			System.out.println("3.�Ա�");
			System.out.println("4.���");
			System.out.println("5.��ü");
			System.out.println("6.��ȸ");
			System.out.println("0.����");
			
			System.out.print("�޴� ���� : ");
			int select = sc.nextInt();
			
			if(select == 1) {
				if(count == 1)
				{
					System.out.println("�̹� �α��� �Ǿ��ִ� ���� �Դϴ�.");
					break;
				}
				
				System.out.println("���̵� �Է��Ͽ���");
				int ID = sc.nextInt();
				if(ID == dbAcc1)
				{
					System.out.println("��й�ȣ�� �Է����ּ���");
					int PW = sc.nextInt();
					if(PW == dbPw1)
					{
						System.out.println("�α��� �����Ͽ����ϴ�");
						count++;
					}
					else
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
						System.out.println("�α��� �����Ͽ����ϴ�");
						count++;
					}
					else
					{
						System.out.println("��й�ȣ�� Ȯ�����ּ���");
					}
				}
				else
				{
					System.out.println("ID�� Ȯ�����ּ���");
				}
			}
			
			else if(select == 2) {
				if(count == 1)
				{
					count--;
					System.out.println("�α׾ƿ� �Ǿ����ϴ�");
				}
			}
			
			else if(select == 3) {
				if(count == 1)
				{
					System.out.println("�Ա��� ���¸� �������ּ���");
					int acc = sc.nextInt();
					if(acc == dbAcc1)
					{
						System.out.println("�Ա��� ���� �Է����ּ���");
						int money = sc.nextInt();
						dbMoney1 = dbMoney1 + money;
					}
					else if(acc == dbAcc2)
					{
						System.out.println("�Ա��� ���� �Է����ּ���");
						int money = sc.nextInt();
						dbMoney2 = dbMoney2 + money;
					}
					else
					{
						System.out.println("���¸� Ȯ�����ּ���");
					}
				}
				else
				{
					System.out.println("�α��� �� ������ּ���");
				}
			}
			else if(select == 4) {
				if(count == 1)
				{
					System.out.println("����� ���¸� �������ּ���");
					int acc = sc.nextInt();
					if(acc == dbAcc1)
					{
						System.out.println("����� ���� �Է����ּ���");
						int money = sc.nextInt();
						if(dbMoney1 < money)
						{
							System.out.println("�ܰ� �����մϴ�.");
						}
						else
						{
							dbMoney1 = dbMoney1 - money;
						}
					}
					else if(acc == dbAcc2)
					{
						System.out.println("����� ���� �Է����ּ���");
						int money = sc.nextInt();
						if(dbMoney2 < money)
						{
							System.out.println("�ܰ� �����մϴ�.");
						}
						else
						{
							dbMoney2 = dbMoney2 - money;
						}
					}
					else
					{
						System.out.println("���¸� Ȯ�����ּ���");
					}
				}
				else
				{
					System.out.println("�α��� �� ������ּ���");
				}
			}
			else if(select == 5) {
				if(count == 1)
				{
					System.out.println("��ü�� ���¸� �������ּ���");
					int acc = sc.nextInt();
					if(acc == dbAcc1)
					{
						System.out.println("��ü�� ���� �Է����ּ���");
						int money = sc.nextInt();
						if(dbMoney1 < money)
						{
							System.out.println("�ܰ� �����մϴ�.");
						}
						else
						{
							dbMoney1 = dbMoney1 + money;
							dbMoney2 = dbMoney2 - money;
						}
					}
					else if(acc == dbAcc2)
					{
						System.out.println("��ü�� ���� �Է����ּ���");
						int money = sc.nextInt();
						if(dbMoney2 < money)
						{
							System.out.println("�ܰ� �����մϴ�.");
						}
						else
						{
							dbMoney1 = dbMoney1 - money;
							dbMoney2 = dbMoney2 + money;
						}
					}
					else
					{
						System.out.println("���¸� Ȯ�����ּ���");
					}
				}
				else
				{
					System.out.println("�α��� �� ������ּ���");
				}
			}
			else if(select == 6) {
				System.out.println("dbAcc1�� �ܾ�:"+dbMoney1);
				System.out.println("dbAcc1�� �ܾ�:"+dbMoney2);
			}
			else if(select == 0) {
				System.out.println("���α׷� ����");
				break;
			}
		}

	}
}

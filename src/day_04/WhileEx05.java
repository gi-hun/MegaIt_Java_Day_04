/*
 * # ������ ���[2�ܰ�]
 * 1. 5�� �ֹ��� �޴´�.
 * 2. �ֹ��� ���� ��, ���� �Է¹޴´�.
 * 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
 * 
 * ��)
 * �޴� ���� : 1
 * �޴� ���� : 1
 * �޴� ���� : 2
 * �޴� ���� : 2
 * �޴� ���� : 3
 * �� �ݾ� = 31300��
 * ���� �Է� : 32000
 * === �Ե����� ������ ===
 * 1. �Ұ�� ���� : 2��
 * 2. ����    ���� : 2��
 * 3. ��         �� : 1��
 * 4. ��   ��   �� : 31300��
 * 5. ��         �� : 700��
 */
//11:57-12:09
package day_04;

import java.util.Scanner;

public class WhileEx05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		
		int i = 0;
		int total = 0;     //��ü ��
		int num = 1;
	
		while(i<5)
		{
			System.out.println(num+".�޴��� �������ּ���");
			int select = sc.nextInt();
			
			if(select == 1)
			{
				cnt1++;
			}
			else if(select == 2)
			{
				cnt2++;
			}
			else if(select == 3)
			{
				cnt3++;
			}
			num++;
			i++;
		}
		
		total = price1*cnt1 + price2*cnt2 + price3*cnt3;
		System.out.println("�� �ݾ�:"+total);
		System.out.println("������ �Է����ּ���:");
		int cash = sc.nextInt();
		
		if(total > cash)
		{
			System.out.println("������ �����մϴ�.");
		}
		else
		{
			System.out.println("=== �Ե����� ������===");
			System.out.println("1.�Ұ�� ���� : " + cnt1 + "��");
			System.out.println("2.����    ���� : " + cnt2 + "��");
			System.out.println("3.��         �� : " + cnt3 + "��");
			System.out.println("4.��    ��   �� : " +total+ "��");
			System.out.println("5.��          ��:"+(cash-total));
		}
	}
}

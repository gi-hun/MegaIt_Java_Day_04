/*
 * # ����Ų���31
 * 1. p1�� p2�� �����ư��鼭 1~3�� �Է��Ѵ�.
 * 2. br�� p1�� p2�� �Է°��� �����ؼ� �����Ѵ�.
 * 3. br�� 31�� ������ ������ ����ȴ�.
 * 4. �¸��ڸ� ����Ѵ�.
 * 
 * ��) 
 * 1�� : p1(2)	br(2)
 * 2�� : p2(1)	br(3)
 * 3�� : p1(3)	br(6)
 * ...
 */
//01:43-01:50

package day_04;

import java.util.Scanner;

public class WhileEx11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while(true)
		{
			System.out.println("p1�� ���ڸ� �Է��Ͻÿ�");
			int num1 = sc.nextInt();
			sum = sum + num1;
			System.out.println("sum:" + sum);
			if(sum > 31)
			{
				System.out.println("p1�� 31�� �Ѱ���ϴ�. ���� ����");
				break;
			}
			
			System.out.println("p2�� ���ڸ� �Է��Ͻÿ�");
			int num2 = sc.nextInt();
			sum = sum + num2;
			System.out.println("sum:" + sum);
			if(sum > 31)
			{
				System.out.println("p2�� 31�� �Ѱ���ϴ�. ���� ����");
				break;
			}
			
		}
	}
}

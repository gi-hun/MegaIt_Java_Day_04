/*
 * # �Ҽ�ã��[1�ܰ�]
 * 1. �Ҽ���, 1�� �ڱ��ڽ����θ� �������� ��
 * 2. ��) 2, 3, 5, 7, 11, 13, ..
 * 3. ��Ʈ
 * 1) �ش� ���ڸ� 1���� �ڱ��ڽű��� ������.
 * 2) �������� 0�� ������ ī��Ʈ�� ����.
 * 3) �� ī��Ʈ ���� 2�̸� �Ҽ��̴�.
 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	�Ҽ�x
 * 
 * ���� �� ���� �Է¹޾�, �ش� ���ڰ� �Ҽ����� �ƴ��� �Ǻ��Ѵ�.
 */

package day_04;

import java.util.Scanner;

public class WhileEx13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("���ڸ� �Ѱ� �Է��Ͽ���");
			int input = sc.nextInt();
			
			if(input==0)
			{
				System.out.println("���α׷� ����");
				break;
				
			}
			int num = 1;
			int count = 0;
			
			while(num <= input)
			{
				if((input % num) == 0)
					
				{
					count++;
				}
				num++;
			}
	
			if(count == 2)
			{
				
				System.out.println(num-1 + "�� �Ҽ��̴�.");
			}
			else
			{
				System.out.println(num-1 + "�� �Ҽ��� �ƴϴ�");
			}
			System.out.println("");
		}
	}
}

/*
 * # �ݺ��� ����(-100)
 * 1. ���� �ݺ��� �ϸ鼭 ���ڸ� �Է¹޴´�.
 * 2. �Է��� ���ڰ� -100�̸�, ���α׷��� ����ȴ�.
 */
//12:10-12:13

package day_04;

import java.util.Scanner;

public class WhileEx06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		/*boolean run = true;
		while(run == true)
		{
			if(num == -100)
			{
				run = false;
			}
		}*/
		
		while(i < 100)
		{
			System.out.println("���ڸ� �Է����ּ���");
			int num = sc.nextInt();
			
			if(num == -100)
			{
				System.out.println("-100�� �ԷµǸ� ���α׷��� �����մϴ�.");
				return;
			}
		}
	}
}

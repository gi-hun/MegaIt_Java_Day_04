/*
 * # Up & Down ����[2�ܰ�]
 * 1. ������ ���߸� ������ ����ȴ�.
 * 2. 100������ ������ ������ �Է��� ������ 5���� �����ȴ�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
 */
//12:17-12:25

package day_04;

import java.util.Scanner;
import java.util.Random;

public class WhileEx07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int count = 0;
		boolean run = true;
		
		while(run == true)
		{
			int com = ran.nextInt(100) + 1;
			//1~100���� ����
			System.out.println("���� ����="+com);
			
			System.out.println("������ �����ΰ���?");
			int me = sc.nextInt();
			
			if(me < com)
			{
				System.out.println("UP!");
				count++;
			}
			else if(me > com)
			{
				count++;
				System.out.println("DOWN!");
			}
			else if(me == com)
			{
				System.out.println("BINGO!");
				System.out.println("�����̶� ���α׷��� ����˴ϴ�.");
				run = false;
			}
		}
		
		int total = 100-5*count;
		System.out.println("��������=" + total);
	}
}

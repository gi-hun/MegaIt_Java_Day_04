/*
 * # Up & Down ����[2�ܰ�]
 * 1. ������ ���߸� ������ ����ȴ�.
 * 2. 100������ ������ ������ �Է��� ������ 5���� �����ȴ�.
 * 3. ���� ���� ��, ������ ����Ѵ�.
 */

package day_04;

import java.util.Random;
import java.util.Scanner;

public class WhileEx07_mine {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
	
		int count = 0;
		
		while(true) {
			int com = ran.nextInt(100) + 1;     ////1~100���� ����
			
			System.out.println(com);
			System.out.println("���ڸ� �Է��Ͻÿ�");
			int me = sc.nextInt();
			
			if(com > me) {
				System.out.println("UP!");
				count = count++;
			}
			else if (com < me) {
				System.out.println("DOWN!");
				count = count++;
			}
			else if (com == me) {
				System.out.println("BINGO!");
				break;
			}
		}
		int total = 100 - 5*count;
		//return ����ϸ� �ݺ��� �����°ɷ� �ν����� ���Ѵ�.
	}
}

/*
 * # 369����[2�ܰ�]
 * 1. 1~50���� �ݺ��� �Ѵ�.
 * 2. �� �ȿ��� �ش� ������ 369������ ����� ����Ѵ�.
 * ��) 1 2 ¦ 4 5 ¦ 7 8 ¦ 10 11 12 ¦ ...
 */
//02:02 - 
package day_04;

public class WhileEx12_answer {
	public static void main(String[] args) {
		
		int i = 1;
		int count = 0;
		
		while(i <= 50)
		{
			int x = i / 10;     //���� �ڸ�
			int y = i % 10;
			
			if( x == 3 || x == 6 || x == 9 )
			{
				count++;
			}
			
			if( y == 3 || y == 6 || y == 9 )
			{
				count++;
			}
			
			if(count == 2)
			{
				System.out.println(i + "¦¦");
			}
			else if(count == 1)
			{
				System.out.println(i + "¦");
			}
			else
			{
				System.out.println(i);
			}
			
			
			i++;
		}
	}
}

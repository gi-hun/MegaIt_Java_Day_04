/*
 * # 369게임[2단계]
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 */
//02:02 - 
package day_04;

public class WhileEx12_answer {
	public static void main(String[] args) {
		
		int i = 1;
		int count = 0;
		
		while(i <= 50)
		{
			int x = i / 10;     //십의 자리
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
				System.out.println(i + "짝짝");
			}
			else if(count == 1)
			{
				System.out.println(i + "짝");
			}
			else
			{
				System.out.println(i);
			}
			
			
			i++;
		}
	}
}

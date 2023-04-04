/*
 * 숫자를 반복적으로 입력받아서 1000이상이 되면 1000을 넘은 수와 평균을 출력
 * 
 */

package ch05;
import java.util.Scanner;


public class breaktest {

	public static void main(String[] args) {
		
		int sum=0,i=0,val=0,temp=0;
		while(true)
		{
			Scanner stdin = new Scanner(System.in);
			System.out.print("반복 정수 입력 : ");
			int num = stdin.nextInt();
		
			sum=sum+num;
			i++;
			
			if(sum>=1000) break;
			temp=num;
		}
		val=sum/i;
		System.out.print("정수와 평균 출력 : "+temp+" " +val);
	}

}

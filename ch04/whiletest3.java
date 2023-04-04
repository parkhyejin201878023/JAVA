package ch04;

import java.util.Scanner;

public class whiletest3 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("두 숫자 입력 : ");
		int num=stdin.nextInt();
		int a=stdin.nextInt();
		
		int i,sum=0;
		
		for(i=num;i<=a;i++)
		{
			if (i%2==1)
			{
			sum=sum+i;
			}
			
		}
		System.out.println("두 숫자 사이의 홀수의 합"+sum);

	}

}

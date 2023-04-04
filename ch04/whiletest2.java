package ch04;

import java.util.Scanner;

public class whiletest2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("원하는 숫자 입력 : ");
		
		int num=stdin.nextInt();
		int i,sum=0;
		for(i=1;i<=1000;i++)
		{
			if (i%num==0)
			{
			sum=sum+i;
			}
			
		}
		System.out.println("배수의 합"+sum);

	}

}

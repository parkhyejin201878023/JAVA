/*
 * 두 숫자를 입력받아서 두 수 사이의 합계 출력하기 
 * 
 * #문제분석
 * 변수:first,second,total
 * #알고리즘
 * 1.정수입력(num1,num2)
 * 2.선택문(if(num1<num2))
 * 3.반복문(for(num1;num2;num1++)
 * 4.sum=num1+sum;
 */

package ch05;

import java.util.Scanner;

public class testex5 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("두 숫자 입력 : ");

		int num1=stdin.nextInt();
		int num2=stdin.nextInt();
		int i,sum=0;
		int temp=0;
		
		if(num1>num2)
		{
			temp=num1;
			num1=num2;
			num2=num1;
		
		}
			while(num1<=num2)
			{
				sum=sum+num1;
				num1=num1+1;
			}
		System.out.println("두 숫자 사이의 합계"+sum);
	}
}
	

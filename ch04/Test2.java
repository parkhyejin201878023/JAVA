package ch04;

import java.util.Scanner;
public class Test2 
{

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("imput score : ");
		int grade = stdin.nextInt();
		
		
		if (grade>=90)
			System.out.println("A");
		else if (grade>=80)
			System.out.println("B");
		else if (grade>=70)
			System.out.println("C");
		else if (grade>=60)
			System.out.println("D");
		else
			System.out.println("F");
	}
}

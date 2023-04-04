package ch04;

import java.util.Scanner;
public class Test1 
{

	public static void main(String[] args) 
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("imput score : ");
		int grade = stdin.nextInt();
		
		if (grade>=90)
		{
			System.out.println("pass");
			System.out.println("cougraturation");
			System.out.println("thank you");

		}
		else
			System.out.println("not pass");

	}

}

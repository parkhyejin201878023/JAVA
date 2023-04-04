package ch04;

import java.util.Scanner;

public class Test3 
{
	
public static void main(String[] args)
{
	Scanner stdin = new Scanner(System.in);
	System.out.print("imput score : ");
	int grade = stdin.nextInt();
	
	switch (grade/10)
	{
	case 10:
	
	case 9:
		System.out.println("A");
		break;
	case 8:
		System.out.println("B");
		break;
	case 7:
		System.out.println("C");
		break;
	case 6:
		System.out.println("D");
		break;
	default:
		System.out.println("F");
		break;
	}
}
}
	/*
	String Mtos;
	switch (grade)
	{
	case 100:
	case 1:
	case 60:
		Mtos = "F";
		break;
	case 61 :
	case 70 :
		Mtos = "D";
		break;
	case 71 :
	case 80 :
		Mtos = "C";
		break;
	case 81 :
	case 90 :
		Mtos = "B";
		break;
	case 91 : 
		Mtos = "A";
		break;
		
		default : 
			Mtos = "?";
	}
	System.out.println(Mtos);
	*/



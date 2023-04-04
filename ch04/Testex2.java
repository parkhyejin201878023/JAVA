/*
 * 입력된 숫자가 양수인지 음수인지 판별하는 프로그램
 */
package ch04;
import java.util.Scanner;

public class Testex2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num=stdin.nextInt();
		
		if (num >0)
		{
			System.out.println("양수");
		}
		else if (num == 0)
		{
			System.out.println("0");
		}
		else
			System.out.println("움수");

	}

}

/*
 * 박혜진
 * 두 개의 숫자를 입력받아서 두 숫자 사이의 홀수값을 모두 더해서 출력하기
 */

package ch04;
import java.util.Scanner;

public class Testex1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("직급과 나이를 입력하세요 : ");
		int num1=stdin.nextInt();
		int num2=stdin.nextInt();
		
		if ((num1 == 7 || num1 == 8) && (40<=num2 && num2 <=49))
		{
			System.out.println("연금 50%.");
		}
		else if ((num1 == 5 || num1 == 6) && (50<=num2 && num2 <=59))
		{
			System.out.println("연금 100%.");
		}
		else
			System.out.println("연금 대상자 아님");
		
	}

}

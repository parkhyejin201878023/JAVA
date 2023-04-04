/*
 * 입력받은 숫자의 팩토리얼 계산
 * 
 * 변수:fac,facvalue
 * #알고리즘
 * 1.원하는 팩토리얼 fac 입력
 * 2.반복
 * 	while(fac>1)
 * {
 * 		facvalue=fac을 1씩 감소하면서 곱한다
 * }
 * 3.출력
 * 
 */
package ch05;
import java.util.Scanner;

public class whiletest2 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("원하는 숫자 입력 : ");
		
		int fac=stdin.nextInt();
		int facvalue= 1;
		
		while (fac>1)
		{
			System.out.print(fac+"*");
			facvalue*=--fac;
		}
		System.out.println("1="+facvalue);
	}
}

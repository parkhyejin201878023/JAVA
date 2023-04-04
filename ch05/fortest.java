/*
 * 입력받은 숫자의 약수를 모두 출력
 * 문제분석
 * 1. 변수 num,i
 * #알고리즘
 * 1.액수를 구할 숫자 입력(num)
 * 2. 약수를 구할 숫자 i
 * 3. 출력
 */

package ch05;
import java.util.Scanner;


public class fortest {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = stdin.nextInt();
		int i=1;
		System.out.println(num+ "의 약수 : ");
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
				System.out.print(i+" ");
				
		}
	}

}

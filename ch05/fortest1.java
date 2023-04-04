package ch05;
import java.util.Scanner;

public class fortest1 {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = stdin.nextInt();
		int i=1;
		int j=1;
		
		for(i=1;i<=num;i++) {
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();

		}

	}

}

package ch06;
import java.util.Scanner;


public class triangle {

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num=stdin.nextInt();
		int i=0,j=0,k=0;
		
		for(i=0;i<num;i++)
		{
			for(j=1;j<num-i;j++)
			{
				System.out.print(" ");
			}
			for(k=0;k<i*2+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	

}

package ch06;

import java.util.Scanner;

public class arraytest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inum[]= {8,7,3,6,9,6,8,7,0,4,1,2};
		Scanner stdin= new Scanner(System.in);
		System.out.print("imput number:");
		int key=stdin.nextInt();
		int count=0;
		for(int i=0;i<inum.length;i++)
		{
			if(inum[i]==key)
			{
				count++;
				System.out.println((i+1)+"match");
				
			}
		}
		if(count==0)
			System.out.println(key+"not match");
		else
			System.out.println(key+"is"+count);
		

	}

}

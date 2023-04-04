package ch05;

public class whiletest {

	public static void main(String[] args) 
	{
		/*
		int sum=0, cnt=1;
		
		while(cnt<=10)
		{
			sum=sum+cnt;
			cnt=cnt+1;
		}
		System.out.println("1~10의 합 : "+sum);
		*/
		
		/*
		for(cnt=1; cnt<=10; cnt++)
		{
			sum=sum+cnt;
		}
		System.out.println("1~10의 합 : "+sum);
	}
	*/
	
	int hap=0, j=1;
	do
	{
		hap=hap+j;
		j=j+1;
		
	}	while(j<=10);
	System.out.println("1~10의 합 : "+hap);
	}

}

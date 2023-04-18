package ch06;
import java.util.Arrays;
public class arraycopy {

	public static void main(String[] args) {
		{
		int num1[]= {10,20,30};
		int num2[]= {40,50,60};
		String str3[]= {"java","array","copy"};
		String str4[]=new String[5]; //str4는 null로 초기화
		
		//배열 요소 값을 각각 복사
		for (int i=0; i<num1.length; i++)
			num2[i]=num1[i];
		
		System.out.print("num2 value:");
		for(int i:num2) //num2출력(10 20 30)
			System.out.print(i+" ");
		
		//system.arraycopy()로 복사
		System.arraycopy(str3, 0, str4, 0, 3);
		
		System.out.print("\nstr4 value:");
		
		for(String value:str4) //str4 출력
			System.out.print(value+" "); //복사되지 않는 초기값 출력
		
		//system.arraycopy()로 복사
		String str[]=Arrays.copyOf(str3,2);	//str3배열의 인덱스 0~길이 2만큼 str5에 복사
		
		System.out.print("\nstr5 value:");
		
		for(String value:str5) //str5 출력
			System.out.print("\nstr5 value:"); //복사되지 않는 초기값 출력
		
		
		
}

	}

}

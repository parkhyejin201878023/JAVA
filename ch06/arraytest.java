package ch06;

public class arraytest {

	public static void main(String[] args) {
		int score[]= {88,97,53,62,92,68,82};
		int max=score[0]; //배열의 첫번쨰 요소를 max 지정
		
		for (int i:score) //for(int i=1;i<score.length;i++)
		{
			if(i>max)
				max=i;
			
		}
		System.out.println("배열 요소의 최대값은 "+max+"입니다");

	}

}

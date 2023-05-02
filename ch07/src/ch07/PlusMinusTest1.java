package ch07;

public class PlusMinusTest1 {
	
	public static void main(String[] args) {
		PlusMinus ob1=new PlusMinus(); //ㅍ,ㄹ러스마이너스 클래스로부터 객체 생성
		
		String ssum,sminus;
		
		ssum=ob1.plus(50,30); //
		sminus=ob1.minus(50,30);
		
		System.out.println(ssum);
		
		
	}

}

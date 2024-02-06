package day02;

public class Ex04 {

	public static void main(String[] args) {
		char ch = 'A';
		System.out.println( ch );
		int num = ch;	// 자동형 변환(자료형의 크기가 작은 것을 큰 것으로 형 변환할때는 자동으로 변환이 가능하다. int : 4byte, char : 2byte)
		System.out.println( num );
		char ch02 = (char)num;	// 강제형 변환(자료형의 크기가 큰 것에서 작은 것으로 변환할 때)
		System.out.println( ch02 );
		
		double d = 1.111;
		//float f = 1.111; 오류난다.
		float f = (float)1.111;	// 일반적으로 1.111인 실수는 double로 인식해서 강제형 변환을 해줘야 오류가 안난다.
		float f1 = 1.111f;		// 이렇게 하면 오류 안난다.
	}

}

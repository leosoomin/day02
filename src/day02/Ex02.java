package day02;

public class Ex02 {

	public static void main(String[] args) {
		int number = 123;
		System.out.println("변경 전 num : " + number);
		number = 100;		// 값을 변경할 때는 따로 자료형을 안써줘도 된다.
		System.out.println("변경 후 num : " + number);
		number = number + 200;
		System.out.println("변경 후 num : " + number);

	}

}

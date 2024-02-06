package day02;

public class Ex03 {

	public static void main(String[] args) {
		char ch = 'A';			// 캐릭터는 작은 따옴표 하나로 문자 하나만 사용해야한다.
		int num = 5;
		int ret;
		ret = ch + num;
		System.out.println("A + S = " + ret);
		System.out.println("ch : " + ch);
		System.out.println("num : " + num);
		
		String str = "hello";
		System.out.println("변경 전 str : " + str);
		str = "test";
		System.out.println("변경 후 str : " + str);

	}

}


package day02;

import java.util.Scanner;		// import는 특정 기능을 현재 페이지로 불러올 때 사용한다.
//import java.util.*; 

public class Ex06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		// Scanner 사용할때는 import 해주고 옆에 한 줄 무조건 써줘야한다.
		int num;
		String name;
		System.out.println("이름 입력 : ");	// 입력받는 줄이 다음 줄로 넘어감.
		name = input.next();		// 문자열을 입력받을 때 사용하는 기능 next();
		
		System.out.print("수 입력 : ");
		num = input.nextInt();		// 정수를 입력받을 때 사용하는 기능  nextInt();
		
		double dou;
		System.out.print("실수 입력 : ");
		dou = input.nextDouble();	// 실수를 입력받을 떄 사용하는 기능 nextDouble();
		
		System.out.println("이름 : " + name);
		System.out.println("입력 수 : " + num);
		System.out.println("실수 : " + dou);

	}

}

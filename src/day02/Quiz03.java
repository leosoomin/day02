package day02;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, num1, num2;
		
		System.out.print("수 입력 : ");
		a = sc.nextInt();
		String result;
		result = (a % 2 == 0)?"짝수":"홀수";
		System.out.println(a + " = " + result);
		result = (a % 3 == 0)?"3의 배수이다.":"3의 배수가 아니다.";
		System.out.println(a + " = " + result);
		
		System.out.print("두 수 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("num1 : " + num1 + " , " + "num2 : " + num2);
		result = (num1 > num2)?"num1이 num2보다 크다,":"num2가 num1보다 크다";
		System.out.println(result);
	}

}

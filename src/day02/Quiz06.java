package day02;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		//두 수를 입력 받아 큰수가 짝수면 "큰수는 짝수입니다" 아니면 "아님"출력
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("두 수를 입력하시오 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int max;
		max = (a>b)?a:b;
		if(max % 2 == 0) {
			System.out.println("큰수는 짝수입니다.");
		} else {
			System.out.println("아님");
		}
	}

}

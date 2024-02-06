package day02;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("============1===============");
		int this_year, birth_year, age;
		System.out.print("올해의 년도를 4자리로 입력하세요?");
		this_year = sc.nextInt();
		System.out.print("당신이 태어난 년도를 4자리로 입력하세요?");
		birth_year = sc.nextInt();
		age = this_year - birth_year + 1;
		System.out.println("당신의 나이는 "+ age +"살 입니다.");
		
		System.out.println("============2===============");
		double first, second, available;
		System.out.print("첫 번째 물건의 무게를 입력하시오?");
		first = sc.nextDouble();
		System.out.print("두 번째 물건의 무게를 입력하시오?");
		second = sc.nextDouble();
		available = 600 - first - second;
		System.out.println("현재 엘리베이터에 허용 무게는 " + available + "입니다.");
		*/
		System.out.println("============3===============");
		int height;
		double weight;
		System.out.print("키를 입력하세요? ");
		height = sc.nextInt();
		System.out.print("현재 체중을 입력하세요? ");
		weight = sc.nextDouble();
		double common_weight = (height - 100) * 0.9;
		double obesity = (weight / common_weight) * 100;
		// System.out.println("표준 체중은 " + common_weight + "이고 비만도는 " + obesity + "입니다.");
		// 비만도 obesity를 double형으로 선언했는데 소수점 2자리까지만 출력하는 방법 알아두기!!
		System.out.printf("표준 체중은 " + common_weight + "이고 비만도는 " + "%.2f", obesity );
		System.out.println("입니다.");
	}
	

}

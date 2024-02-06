package day02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		String name;
		int kor, eng, math, sum;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=====================");
		System.out.print("이 름 : ");
		name = scanner.next();
		
		System.out.println("=====================");
		System.out.print("국 어 : ");
		kor = scanner.nextInt();
		
		System.out.print("영 어 : ");
		eng = scanner.nextInt();
		
		System.out.print("수 학 : ");
		math = scanner.nextInt();
		System.out.println("=====================");
		
		sum = kor + eng + math;
		System.out.println("합 계 : " + sum);
		System.out.println("=====================");

	}
	

}

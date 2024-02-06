package day02;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, math, sum;
		double avg;
		
		System.out.println("<결과>");
		System.out.print("학생 이름 : ");
		name = sc.next();
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
		sum = kor + eng + math;
		avg = sum / 3.0;	
		// avg = sum / 3 이라고 쓰면 결과값이 1이 나온다.(정수형으로 자동 형 변환됨.)
		System.out.println("====================학생정보====================");
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
		System.out.println("----------------------------------------------");
		System.out.printf(name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+sum+"\t" + "%.2f",avg);
		// System.out.printf("%.2f", avg); 평균만 소수점 두 번째 자리까지만 출력하는 코드
		// --> prinln()대신 printf()를 사용해서 첫 번째 인자로 몇 번째 자리까지 출력할지 정해주고 
		// --> 사용하는 방법 알아두기
		
	}

}

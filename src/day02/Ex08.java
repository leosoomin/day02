package day02;

public class Ex08 {

	public static void main(String[] args) {
		int n1 = 9, n2 = 2;
		System.out.println( n1 / n2 );				// 정수 / 정수 --> 실수가 안나오고 연산하면 몫만 나온다.
		System.out.println( n1 / (double)n2 );		// n1 / 2.0 --> 피연산자중 하나라도 실수이면 그 결과는 실수값이 나온다 4.5
		System.out.println( n1 % n2 );				// 나머지가 나온다.
		/*
		if(n1 % 2 == 0) {
			System.out.println("n1은 짝수");
		}
		else {
			System.out.println("n1은 홀수");
		}
		if(n2 % 2 == 0) {
			
			System.out.println("n2은 짝수");
		}
		else {
			System.out.println("n2은 홀수");
		}
		*/
		System.out.println("====복합대입연산자====");
		n1 = n2 = 5;
		n1 += 1;
		System.out.println(n1);		// n1 = 6
		n1 -= 1;
		System.out.println(n1);		// n1 = 5
		n1 *= n2;
		System.out.println(n1);		// n1 = 25
		n1 /= n2;
		System.out.println(n1);		// n1 = 5
		n1 %= n2;
		System.out.println(n1);		// n1 = 0
		
		System.out.println("====관계 연산자====");		// 관계연산자 true 또는 false 값이 나온다.
		n1 = 5;
		n2 = 2;
		System.out.println(n1 > n2);	// true
		System.out.println(n1 <= n2);	// flase
		System.out.println(n1 == n2);	// false	
		System.out.println(n1 != n2);	// true
		
		boolean bool;
		bool = n1 > n2;
		System.out.println(bool);
		bool = n1 <= n2;
		System.out.println(bool);
		
		System.out.println("====논리 연산자====");
		int n3 = 10;
		n1 = 5; n2 = 7;
		System.out.println(n1 > n2 && n1 > n3);		// false
		System.out.println(n2 > n1 && n2 > n3);		// flase
		System.out.println(n3 > n2 && n3 > n1);		// true
		
		System.out.println(n1 > n2 || n1 > n3);		// false
		System.out.println(n2 > n1 || n2 > n3);		// true
		System.out.println(n3 > n2 || n3 > n1);		// true
		
		System.out.println( !(n1>n2) );				// true
		System.out.println( !(n1>n3) );				// true
		System.out.println( !(n2>n3) );				// true
		
		System.out.println("---- or ----");		// or 연산 : 하나라도 참이면 참 
		System.out.println( true || true );			// true
		System.out.println( true || false );		// true
		System.out.println( false || true );		// true
		System.out.println( false || false );		// false
		System.out.println("---- and ----");
		System.out.println( true && true );			// true
		System.out.println( true && false );		// false
		System.out.println( false && true );		// false
		System.out.println( false && false );		// false
		
		System.out.println("---- not ----");
		System.out.println( !false );				// true
		System.out.println( !true );				// false
		System.out.println( !(10>5) );				// false
		
		n1 = 10; n2 = 9;
		bool = n1 > n2 && n1 % 2 == 0;
		System.out.println(bool); 					// true
		
		// System.out.println( true && false || true);	// true
		// System.out.println((10>5) && (6 < 4) || (4 > 1));	//true
		
		System.out.println("==== 증감 연산자 ====");		// 앞쪽에 부호가 붙든, 뒤쪽에 부호가 붙던 결과적으로 1씩 증가/감소하는건 똑같다.
		n1 = 5;
		++n1;
		System.out.println(n1);			// 6
		
		n2 = 5;
		n2++;
		System.out.println(n2);			// 6
		
		System.out.println("----------");
		n1 = 10;
		n2 = ++n1;		// n1을 1 먼저 증가시키고 n2에 대입해라
		System.out.println("n1 : " + n1);		// n1 = 11
		System.out.println("n2 : " + n2);		// n2 = 11
		
		n1 = 10;
		n2 = n1++;		// 연산을 먼자하고(n2 = n1인 대입 연산을 먼저하고) n1을 1만큼 증가시킨다.
		System.out.println("n1 : " + n1);		// n1 = 11
		System.out.println("n2 : " + n2);		// n2 = 10
		// --> 연산자가 앞에 붙으면 증감 연산을 먼저하고 대입 연산하고, 연산자가 뒤에 붙으면 대입 연산을 먼저 하고 증감 연산을 한다.
		
		int a =5, b=6, c=10, d;
		d = ++a * b--;								// d = 6 * 6 = (36),  a = (6),  b = (5) 
		System.out.println(a+","+b+","+d);			// 6,5,36
		
		d = a++ + ++c - b--;						// d = 6 + 11 - 5 = (12),  a = (7),  b = (4),  c = (11)
		System.out.println(a+","+b+","+c+","+d);	// 7,4,11,12
		
		System.out.println("==== 삼항 연산자(조건 연산자) ====");
		n1 = 20;
		n2 = 10;
		String result;
		result = (n1>n2)?"참인경우":"거짓인경우";		// (n1>n2)?true:false
		System.out.println( result );
	}
}

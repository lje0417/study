package sec01.exam01;

public class TypeCastingExam {

	public static void main(String[] args) {
		
		int a = 2 + (2 * 2);
		
		long b = (long)a; // int인 a를 long type로 바꿈
						   // long이 long 타입에 들어가는 건 문제가 안 됨
		long c = a; // 작은 것에서 큰 것으로 바뀔 때는 손실이 없으므로 형변환 생략 가능
					// 자동 형변환
					// 묵시적, 암시적 (암묵적) 형변환
		System.out.println("c " + c);
		
		a = (int)c; // 큰 것에서 작은 것으로 바뀔 때는 손실이 있을 수 있다
					// 그래서 형변환을 생략할 수 없다
					// 명시적 (강제) 형변환
		
		double d2 = 3.14;
		int i = (int)d2;
		System.out.println("i " + i);
		
//		int result = 43;
//		double result = (double)43;
		double result = 43;
		int count = 10;
		System.out.println("(double)count" + (double)count);
		System.out.println(result / (double)count);
		System.out.println(result / count);
		// double과 int가 연산할 때 int가 double로 자동 형변환 되어서 연산됨
		
		int i2 = 2100000000;
		int i3 = i2 * 2; // int끼리 연산해서 java가 문제없다고 생각
		System.out.println("i3 : " + i3); // int 허용 범위 값을 넘어서 이상한 결과가 나온다
		
		System.out.println(3 + "문자");
		System.out.println(3 + 4 + "문자");
		System.out.println("" + 1 + 300 + "px"); // 문자로 시작하면 계산 안 됨
		System.out.println("" + (1+300) + "px"); // 괄호치면 괄호 먼저 계산됨
		
		System.out.println("----------hr------------");
		
		System.out.print("첫번째줄"); // span과 같음
		System.out.print("두번째줄");
		System.out.println("i3의 값은 : ");
		System.out.println(i3);
		System.out.println("--------hr---------");
		System.out.println("i3의 값은 : %d, i3 ");
		System.out.println(); //br의 의미
		System.out.printf("i2의 값은 : "+ i2 +", i3 : " + i3);
		System.out.println();
		System.out.printf("i2의 값은 : + %d,  i3 : %d" , i2 , i3);
		
		System.out.println("------hr---------");
		
//		System.out.println("아무거나입력하세요");
//		Scanner scan = new Scanner (System.in); // 입력받으려고 준비
//		String input = scan.nextLine();
//		System.out.println("input : " + input);
		
	}

}

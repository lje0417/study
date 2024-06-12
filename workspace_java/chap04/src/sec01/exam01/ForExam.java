package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {

		// 1씩 증가하는걸 5번 반복할 것
		// 1 + 1 + 1 + 1 + 1
		int sum = 0;
		sum = sum + 1;
//		sum += 1;
//		sum++;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		System.out.println(sum);
		
		// 참고로 1 ~ n까지 더한 값
		// n*(n+1)/2
		// 1 + 2 + 3 + 4 + 5
		sum = 0;
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		sum = sum + 5;
		System.out.println(sum);
		
		// 이번엔 1, 2, 3..에 해당하는 것을 변수에 넣어보자
		sum = 0;
		int i = 0; // 초기화식
		
		i++; // i == 1 // 증감식
		sum = sum + i; // +1 // sum = sum + 1; // 실행문
//		sum = sum + i+1; // +2
		
		i++; // i == 2
		sum = sum + i; // +2 // sum = sum + 2;
		
		i++; // i == 3
		sum = sum + i;
		
		i++;
		sum = sum + i;
		
		/*
		 * 반복문 만드는 원리
		 * 
		 * 반복되는 것 찾기 : ctrl+c, v 해도 바뀌지 않는 것
		 * 반복되지 않는 것
		 * 		패턴(규칙)을 찾을 수 있다면 반복문으로 만들 수 있음
		 * 		변수를 활용해서 반복되게 만들기
		 * 
		 * 반복되지 않는 것의 시작 조건 찾기
		 * 					  종료 조건 찾기
		 * 
		 * for : 반복 횟수를 아는 경우
		 * while : 반복 횟수를 모르는 경우
		 */
		
//		맨 처음 한 번만 초기화식 실행
//		조건이 참 - <실행블럭 실행 - 증감식 실행 - 다시 조건 보기> 반복
//		for(초기화식;조건;증감식) {
//			실행블럭
//		}
		
		int sum2 = 0;
		for(int e = 1 ; e <= 5 ; e++) {
			sum2 = sum2 + e;
			System.out.println("안쪽에서는 e : " + e + ", sum2 : " + sum2);
		}
		System.out.println("for 사용 sum2 : " + sum2);
		
		System.out.println("-----------------------------");
		
		// 1 ~ 10까지의 합 구하기
		int sum3 = 0;
		for(int t = 1 ; t <= 10 ; t++) {
			sum3 = sum3 + t;
			System.out.println("t : " + t + ", sum3 : " + sum3);
		}
		System.out.println("for 사용 sum3 : " + sum3);
		
		System.out.println("----------------------");
		
		// 선생님
		// 1 ~ 10까지 출력
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		// 반복되는 것을 찾는 쉬운 방법
		// 일단 복사 - 붙여넣기 - 변경할 것을 찾기 - 변경 규칙 찾기
		// 변경되는 것을 변수로 바꾸기
		System.out.println(5);
		int i2 = 5 + 1;
		System.out.println(i2); // 6
		i2 = i2 + 1;
		System.out.println(i2); // 7
		i2 = i2 + 1;
		System.out.println(i2); // 8
		
		System.out.println("-----");
		
		// for문으로 만들자
		for(int i3 = 1 ; i3 <= 10 ; i3 = i3 + 1) {
			System.out.println(i3);
		}
		for(int i3 = 1 ; i3 <= 10 ; i3 = i3 + 1) {
			System.out.print(i3 + ","); // print는 옆으로 출력
		}
		
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		
		// 문제 1
		// 1 ~ 10까지 짝수만 출력하기
		
		// 1. 증감식 이용하기
		System.out.println(2);
		int i4 = 4;
		System.out.println(i4);
		i4 = i4 + 2; // 6
		System.out.println(i4);
		i4 = i4 + 2; // 8
		System.out.println(i4);
		i4 = i4 + 2; // 10
		System.out.println(i4);
		
		System.out.println("-----------");
		
		for(int i5 = 2 ; i5 <= 10 ; i5 = i5 + 2) {
			System.out.println(i5);
		}

		System.out.println("-----------");
		
		System.out.println("-----------------------");
		// 2. if문 이용하기
		int num = 1;
		num = num + 1;
		if(num % 2 == 0) {
			System.out.println(num);
		}
		
		System.out.println("-----------");
		
		for(int num2 = 1 ; num2 <= 10 ; num2++) {
			if(num2 % 2 == 0) {
				System.out.println(num2);
			}
		}
		
		
		/* 나
		int a = 1;
		a = a * 2;
		
		if(a <= 10 && a <= a * 2) {
			System.out.println("1~10까지의 짝수 : " + a);
		}
		
		if(a <= 10) {
			System.out.println("짝수 : " + a);
		}
		
		for(int a2 = 1 ; a2 <= 10 ; a2++) {
			if(a2 % 2 == 0) {
				System.out.println(a2);
			}
		}
		*/
		
		
		System.out.println("-----------------------");
		
		// 문제 2 - 조금 어려운 문제
		// 1 ~ 10까지 한 줄에 3개씩 출력
		
		System.out.println(123);
		System.out.println(456);
		
		System.out.print(1);
		System.out.print(2);
		System.out.print(3); // 3
		System.out.println();
		
		int num3 = 3;
		num3++;
		System.out.print(num3);
		num3++;
		System.out.print(num3);
		num3++;
		System.out.print(num3); // 6
		if(num3 % 3 == 0) {
			System.out.println();
		}
		
//		System.out.print(num3);
//		num3++;
//		System.out.print(num3);
//		num3++;
//		System.out.print(num3); // 6
//		if(num3 % 3 == 0) {
//			System.out.println();
//		}
		
		
		for(int num4 = 1 ; num4 <= 10 ; num4++) {
			System.out.print(num4);
			if(num4 % 3 == 0) {
				System.out.println();
				}
		}
		
		System.out.println("-----------------------");
		
		// 문제 3
		// 1 ~ 100까지 3의 배수가 몇 개 있는가?
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3); //
		System.out.println(4);
		System.out.println(5);
		System.out.println(6); //
		int three = 6;
		three = three + 3;
		System.out.println(7);
		System.out.println(8);
		System.out.println(9); //
		
		for(int three2 = 3 ; three2 <= 100 ; three2 = three2 + 3) {
			System.out.println("3의 배수 : " + three2);
		}
		
		int count = 0;
		for(int three3 = 1 ; three3 <= 100 ; three3 += 1) {
			if(three3 % 3 == 0) {
				count++;
			}
		}
		System.out.println("3의 배수는 " + count + "개");
		
		System.out.println("-------------------------");
		
	}

}
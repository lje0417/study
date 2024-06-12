package sec01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {

		// if문은 참일 때만 동작
		// 거짓이면 안 나옴
		
		int score = 91;
		
		if(score >= 90) {
			System.out.println("90점 이상");
			
			if(score >= 95) {
				System.out.println("95점 이상");
			}
		}
		if(score < 90) {
			System.out.println("90점 미만");
		}
		
		// 참고
		boolean up90 = score >= 90;
		if(up90) {
			System.out.println("up90");
		}
		if(!up90) {
			System.out.println("!up90");
		}
		
		if(up90) {
			System.out.println("참");
		} else {
			// else: 위의 조건이 하나도 만족하지 않은 경우 무조건 실행
			System.out.println("거짓");
		}
		
		System.out.println("-------------------------");
		
		if(score >= 90) {
			System.out.println("A학점");
		} else if(score < 90 && score >= 80) {
			System.out.println("B학점");
		} else {
			System.out.println("C학점");
		}
		
		// if, else if, else 이런 식은 하나만 실행된다
		if(score >= 90) {
			System.out.println("A학점");
		} else if(score >= 80) {
			System.out.println("B학점");
		} else {
			System.out.println("C학점");
		}
		
		if(score >= 90) {
			System.out.println("90점 이상");
			System.out.println("A학점");
		}
		if(score >= 80) {
			System.out.println("90점 미만 80점 이상");
			System.out.println("B학점");
		}
		
		System.out.println("-------------------------");
		
//		// 3은 짝수인가?
//		int num = 3;
		Scanner input = new Scanner(System.in);
//		num = input.nextInt();
//		if(num % 2 == 1) {
//			System.out.println("홀수");
//		} else {
//			System.out.println("짝수");
//		}
		
		String a = "abc";
		String b = "abc";
//		b = input.nextLine();
//		if(a == b)
		if(a.equals(b)) {
			System.out.println("a와 b가 같다");
		} else {
			System.out.println("a와 b가 다르다");
		}
		
		System.out.println("---------------------------");
		
//		double rand = Math.random();
//		System.out.println("rand : " + rand);
//		// 0 이상 1 미만
		
		// 주사위 : 1 ~ 6 까지
		double rand = Math.random();
		int dice = (int)(rand * 6);
		dice = dice + 1;
		dice = (int)(rand * 6) + 1;
		
//		dice = ((int)(rand * 10000)) % 6 + 1;
//		System.out.println(dice);
		
		rand = Math.random();
		dice = (int)(rand * 6) + 1;
		System.out.println(dice);
		
		if(dice == 1) {
			System.out.println("1이 나왔음");
		}
		
		System.out.println("---------------------------");
		
		// 가위바위보
		double rand2 = Math.random();
		int number2 = (int)(rand2 * 3);
		number2 = number2 + 1;
		number2 = (int)(rand2 * 3) + 1;
		
		rand2 = Math.random();
		number2 = (int)(rand2 * 3) + 1;
//		System.out.println(number2);
		
		if(number2 == 1) {
			System.out.println("가위");
		} else if(number2 == 2) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
		
		System.out.println("---------------------------");
		
		// 선생님 풀이
		// 가위바위보
		
		rand = Math.random();
		int rsp = (int)(rand * 3); // 0 ~ 2 : 3개
		if(rsp == 0) {
			System.out.println("가위");
		} else if(rsp == 1) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
		
		int my = 1; // 바위
		if(rsp == my) {
			System.out.println("비김");
		}
		if(rsp == 0 && my == 0) {
			System.out.println("비김");
		} else if (rsp == 0 && my == 1) {
			System.out.println("내가 이김");
		} else if (rsp == 0 && my == 2) {
			System.out.println("내가 짐");
		}
		
		System.out.println("---------------------------");
		
		// 주사위 : 1 ~ 6 까지
		double rand3 = Math.random();
		int dice2 = (int)(rand3 * 6);
		dice2 = dice2 + 1;
		dice2 = (int)(rand3 * 6) + 1;
		
		rand3 = Math.random();
		dice2 = (int)(rand3 * 6) + 1;
		System.out.println(dice2);
		
//		if(dice2 == 1) {
//			System.out.println("주사위 1이 나왔습니다");
//		} else if(dice2 == 2) {
//			System.out.println("주사위 2가 나왔습니다");
//		}
		
		// if중에서 == 또는 equals인 경우 switch로 바꿀 수 있다
		switch(dice2) {
			case 1 :
				System.out.println("주사위 1이 나왔습니다");
				break;
			case 2 :
				System.out.println("주사위 2가 나왔습니다");
				break;
			case 3 :
				System.out.println("주사위 3이 나왔습니다");
				break;
			case 4 :
				System.out.println("주사위 4가 나왔습니다");
				break;
			case 5 : // else if(dice == 5)
				System.out.println("주사위 5가 나왔습니다");
				break;
			default : // if의 else
				System.out.println("주사위 6이 나왔습니다");
				break;
		}
		
		
		System.out.println("---------------------------");
		
		int month = 3;
		
		if(month >= 3 && month <= 5) {
			System.out.println("봄");
		} else if(month >= 6 && month <=8) {
			System.out.println("여름");
		} else if(month >= 9 && month <=11) {
			System.out.println("가을");
//		} else if(month == 12 || month == 1 || month == 2) {
//		} else if(month == 12 || (month >= 1 && month <= 2)) {
		} else {
			System.out.println("겨울");
		}
		
		// break가 없을 때 다음 case도 실행되는 원리
		switch(month) {
			case 3 :
			case 4 :
			case 5 :
				System.out.println("봄2");
				break;
			case 6 :
			case 7 :
			case 8 :
				System.out.println("여름2");
				break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("가을2");
				break;
			default :
				System.out.println("겨울2");
				break;
		}
		
		// char, byte, short, int (즉, int 이하), String만 허용됨
		// boolean, long, float, double은 못 씀
		
		if(true) System.out.println("한 줄이면 중괄호 생략해도 가능 그러나 계속 쓰는 것이 좋다");
	}
	

}

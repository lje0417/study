package sec01.exam01;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {
		
		// 은행 계좌의 잔고 관리 시스템
		// 1. 입금, 2. 출금, 3. 조회, 4. 종료
		// 입금 : 잔액에 더하기
		//			* 0, 음수는 실행되지 않게 - "금액을 확인하세요"
		// 출금 : 잔액에서 빼기
		//			* 잔액보다 큰 금액은 실행되지 않게 - "잔액이 부족합니다"
		// 조회 : 잔액 출력
		// 종료 : 반복 종료
		
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔액 | 4. 종료");
			System.out.println("--------------------");
			System.out.println("선택> ");
		}

	}

}

package sec01.exam01;

public class 연산자Exam {

	public static void main(String[] args) {

		int a = 10;
//		a = 11;
//		a = 10 + 1;
		int b = a + 1;
		
//		a = 10 + 1;
		a = a + 1; // a = 1 + a;
		a += 1; // a = a + 1 과 같다
		a++; // a += 1 과 같다
		++a;
		
		a = 10;
		a++;
		System.out.println("a : " + a);
		
		a = a - 2;
		a -= 2;
		a -= 1;
		a--; // a = a- 1과 같다
		
		a= 10;
		a--;
		System.out.println("a : " + a);
		// 현재 9
		System.out.println("++a : " + ++a); // 출력 10
		// 현재 10
		System.out.println("++a : " + a++); // 출력 10
		System.out.println("a : " + a);
		// 현재 a가 11
		
		System.out.println(a++ + ++a);
		// 11 + (a가 12가 된 상태)에 1 더하기 (11+13)
		// 위 내용을 풀어쓰기
		a = 11;
		int result = a; // a
		a = a + 1; // a 다음에 오는 ++
		a = a + 1; // 두번째 a 앞에 오는 ++
		result = result + a;
		System.out.println(result);
		
		boolean c = true;
		System.out.println("c : " + c);
		c = !c;
		System.out.println("!c : " + c);
		// !는 반대를 뜻한다 (참이 아니다)
		
		int d = 9;
		System.out.println(d / 3); // int 나누기 int라서 3이 나옴
//		System.out.println(3 / 0); // 0은 무한대로 넘어감
								   // double일 때는 infinity
		
		int f = 10;
		int p = 5;
		System.out.println("몫 : " + (f / p));
		System.out.println("나머지  : " + (f % p));
		// 나머지는 3 이상 나올 수가 없다
		
		// 돈(h)이 10000원이 있음
		// 커피(u) 4500원짜리 몇 잔 살 수 있나
		
		int h = 10000;
		int u = 4500;
		int count = h / u;
		System.out.println("만원 : " + (h / u));
		int change = h % u;
		System.out.println("잔돈 : " + u);
		
		// 올리브영에서 전품목 15% 행사를 합니다.
		// 1. 꿀홍차 5000원을 샀을 때 얼마를 내야 하나요?
		// 2. 꿀홍차 5000원과 립스틱 10000원을 샀어요
		//    얼마를 내야 하나요?
		
		double percent = 0.15;
		int tea = 5000;
		double discount = tea * percent;
		System.out.println("할인 받을 금액 : " + discount);
		double pay = tea - discount;
		System.out.println("내야 하는 돈 : " + pay);
		
		// 7234원이 있어요
		// 5000원, 1000원, 500원, 100원, 50원, 10원 1원
		// 각각 최대 몇 개까지로 표현할 수 있나요?
		
		String left = "수박";
		String right = "멜론";
		// 단, left = "멜론" 금지
		System.out.println(left); // 결과 : 멜론
		System.out.println(right); // 결과 : 수박
		
		System.out.println(3 > 5);
		boolean bool = 3 > 5;
		System.out.println(bool);
		
		System.out.println(0.1 == 0.1f); // 결과 false
		// 같은 타입으로 변경해서 비교하자
		System.out.println((float)0.1 == 0.1f);
		
		System.out.println("3 == 3 : " + (3 == 3));
		System.out.println("3 != 3 : " + (3 != 3));
		
		String str1 = "이정은";
		String str2 = "이정은";
//		System.out.println(str1 == str2);
		// 글씨 비교는 == 사용 금지
		// String 변수나 ""에 . equals() 붙여서 사용 - () 안에 글씨와 비교
		System.out.println(str1.equals(str2));
		
		System.out.println(10 & 3);
		System.out.println(10 | 3);
		
		int i1 = 3;
		int i2 = 5;
		int i3 = 7;
		System.out.println("i3이 가장 큰 값인가? " + ((i3 >= i1) && (i3 >= i2)));
		boolean i4 = i3 > i2;
		System.out.println(i4 ? "i3이 크다" : "i3이 작거나 같다");
		
		// 150쪽 5번
		int var1 = 5;
		int var2 = 2;
		double var3 = var1 / var2;
		int var4 = (int) (var3 * var2);
		System.out.println(var4);
		
		// 151쪽 6번
		int value = 356;
		System.out.println(value / 100 * 100);
		System.out.println(value - (value % 100));

	}

}

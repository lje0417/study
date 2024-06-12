package chap05;

public class ReferenceExam {

	public static void main(String[] args) {
		
		int a;
//		System.out.println(a);
//		int b = a;
		
		String c = "이정은";
		// =을 기준으로 오른쪽 먼저 실행
		// "이정은"이 heap 영역에 비어있는 번지에 들어간다
		// stack 영역의 c에 그 번지가 기록된다
		
		System.out.println("c : " + c);
		System.out.println("c == null : " + (c == null));
		System.out.println("c != null : " + (c != null));
		
		c = null; // 주소값을 비워서 연결 끊기
		System.out.println("c : " + c);
		System.out.println("c == null : " + (c == null));
		System.out.println("c != null : " + (c != null));
		
		String d;
		// 기본타입과 마찬가지로
		// 값을 할당하지 않으면 사용할 수 없다
//		System.out.println(d);
		d = "이정은";
		c = "이정은"; 
		System.out.println(c == d); // 결과: true
		// 이건 String 특별대우
		
		c = new String("이정은"); // 새로운 주소에 할당
		System.out.println(c == d); // 결과: false
		// c가 가지고 있는 주소와 d의 주소값이 다르다
		
		System.out.println("c.equals(d) : " + c.equals(d));
		// scan.nextInt()
		
		c = null;
//		System.out.println("c.equals(d) : " + c.equals(d));
		String e = c + "abc";
		System.out.println(e);
		
		
	}

}

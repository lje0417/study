package sec01.exam01;

public class For구구단문제 {

	public static void main(String[] args) {
		
		// 1단계 - 한 단을 옆으로 출력
		
		System.out.println("1단계");
		
		for(int dan = 2 ; dan <= 9 ; dan++) {
			for(int k = 1 ; k <= 9 ; k++) {
				System.out.print(dan + " * " + k + " = " + (dan*k));
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
		System.out.println("--------------------------------------------------------");
		
		// 2단계 - 옆으로 3단씩 출력
		
		System.out.println("2단계");
		
//		for(int dan = 2 ; dan <= 4 ; dan++) {
//			for(int k = 1 ; k <= 9 ; k++) {
//				System.out.println(dan + " * " + k + " = " + (dan*k));
//			}
//		}
//		
//		
		int k = 1 ;		
		for(int dan = 2 ; dan <= 4 ; dan++) {

			System.out.print(dan + " * " + k + " = " + (dan*k));
			System.out.print(" ");

		}
		System.out.println();
		k++;
		for(int dan = 2 ; dan <= 4 ; dan++) {

			System.out.print(dan + " * " + k + " = " + (dan*k));
			System.out.print(" ");

		}
		System.out.println();
		
		System.out.println("--------------------------------------------------------");
		
		for(int k2 = 1 ; k2 <= 9 ; k2++) {
			for(int dan = 2 ; dan <= 4 ; dan++) {

				System.out.print(dan + " * " + k2 + " = " + (dan*k2));
				System.out.print(" ");

			}
			System.out.println();
		}
		System.out.println();
		
		for(int k2 = 1 ; k2 <= 9 ; k2++) {
			for(int dan = 5 ; dan <= 7 ; dan++) {
				
				System.out.print(dan + " * " + k2 + " = " + (dan*k2));
				System.out.print(" ");
				
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("--------------------------------------------------------");
		
//		for(int dan = 2 ; dan <= 10 ; dan++) {
//			for(int k2 = 1 ; k2 <= 9 ; k2++) {
//				System.out.print(dan + " * " + k2 + " = " + (dan*k2));
//				System.out.print(" ");
//			}
//			System.out.println();
//		}
		
		

		for(int dan2 = 2 ; dan2 <= 9 ; dan2 = dan2 + 3) {
			
			for(int k2 = 1 ; k2 <= 9 ; k2++) {
				for(int dan = dan2 ; dan <= dan2 + 2 ; dan++) {

					System.out.print(dan + " * " + k2 + " = " + (dan*k2));
					System.out.print(" ");

				}
				System.out.println();
			}
			System.out.println();
			
		}
		
		
	}

}

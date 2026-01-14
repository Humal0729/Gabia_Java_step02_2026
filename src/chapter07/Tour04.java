package chapter07;

import java.util.Scanner;

import chapter08.A03;


public class Tour04 extends A03{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean menu = true;
		
		System.out.print("관광객 수: ");
		int n = s.nextInt();

		Guide guide = new Guide(n);
		System.out.println();
		
		for(int i=0; i<n; i++) {
			System.out.println((i+1)+ "번 관광객 등록");
			System.out.print("이름: ");
			String name = s.next();
			guide.guest[i].setName(name);
			
			System.out.print("성별: ");
			String gender = s.next();
			guide.guest[i].setGender(gender);
			
			System.out.println();
		}
		
		while(menu) {
			System.out.println("========================");
			System.out.println("1. 관광객 정보");
			System.out.println("2. 목적지 변경");
			System.out.println("3. 종료");
			System.out.print("선택>> ");
			
			int select = s.nextInt();
			
			switch (select) {
			case 1: 
				for(int i=0; i<n; i++) {
					System.out.println((i+1) + "번 관광객: " + guide.guest[i].getName() + ", " + guide.guest[i].getGender());
				}
				break;                                    
			case 2: 
				System.out.println("현재 목적지는 " + guide.getPoint() + "입니다.");
				System.out.print("변경할 목적지: ");
				guide.setPoint(s.next());
				System.out.println("목적지가 " + guide.getPoint() + "로 변경되었습니다.");
				break;
			case 3: 
				menu = false;
				break;
			default:
				System.out.println("없는 숫자입니다.");
			}
		}//while
		

	}

}

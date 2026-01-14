package chapter11;

import java.util.Scanner;

public class EmumMain08 {
	
	public enum Item{
		Start, Pause, Exit
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요[0:게임시작, 1:일시정지, 2:게임종료] :  ");
			int n = s.nextInt();
			
			Item start = Item.Start;
			Item Pause = Item.Pause;
			Item Exit = Item.Exit;
			
			if(n == start.ordinal()) System.out.println("시작");
			else if(n == Pause.ordinal()) System.out.println("정지");
			else if(n == Exit.ordinal()) { System.out.println("종료");return;}
		}

	}

}

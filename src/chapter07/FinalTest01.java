package chapter07;

import javax.swing.JOptionPane;

public class FinalTest01 {
	//final = 재선언 불가, 읽기 전용
	private static final int MAX = 3;
	

	public static void main(String[] args) {
		int num=1;
		
		for(int i=0; i<MAX; i++) {
			num = Integer.parseInt(JOptionPane.showInputDialog("값 입력"));
			if(num>MAX) System.out.println("3보다 큼");
			else if(num<MAX) System.out.println("3보다 작음");
			else System.out.println("3");
		}

	}

}

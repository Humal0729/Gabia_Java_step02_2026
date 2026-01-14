package chapter07;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain05 {

	public static void main(String[] args) {
		String point = JOptionPane.showInputDialog("지점명");
		String tel = JOptionPane.showInputDialog("전화번호");
		Scanner s = new Scanner(System.in);
		
		
		Bank bank = new Bank(point, tel);
		
		System.out.println(point + " 지점의 퇴직연금 이자를 입력하세요: ");
		bank.interest = s.nextFloat();
		
		System.out.println();
		
		String point2 = JOptionPane.showInputDialog("지점명");
		String tel2 = JOptionPane.showInputDialog("전화번호");
		
		Bank bank2 = new Bank(point2, tel2);
		System.out.println(point2 + " 지점의 퇴직연금 이자를 입력하세요: ");
		bank.interest = s.nextFloat();
		bank.getBank();

	}

}

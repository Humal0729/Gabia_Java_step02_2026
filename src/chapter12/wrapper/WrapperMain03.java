package chapter12.wrapper;

import javax.swing.JOptionPane;

public class WrapperMain03 {

	public static void main(String[] args) {
		String str1="";
		String str2="";
		char ch=65;
		double num1,num2;
		
		num1 = Double.parseDouble(JOptionPane.showInputDialog("값1"));
		num2 = Double.parseDouble(JOptionPane.showInputDialog("값2"));
		
		if(num2 != 0) System.out.println(num1/num2);
		
		if(Character.isDigit(ch)) System.out.println(ch + "는 숫자");
		else System.out.println(ch + "는 문자");

	}

}

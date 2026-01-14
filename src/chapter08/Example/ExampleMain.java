package chapter08.Example;

import java.util.Scanner;

public class ExampleMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Example ex1 = new CalPlus();
		Example ex2 = new CalMinus();
		int n1 = 20;
		int n2 = 10;
		// 방법1
		Example[] calculators = { new CalPlus(), new CalMinus() };
		
		System.out.print("num1: ");
		n1 = s.nextInt();
		
		System.out.print("num2: ");
		n2 = s.nextInt();
		
		for(int i=0; i<calculators.length; i++) {
			System.out.println(calculators[i].getClass().getSimpleName()+": "+calculators[i].getResult(n1, n2));
		}
		
		//System.out.println("CalPlus: " + ex1.getResult(n1, n2));
		//System.out.println("CalMinus: " + ex2.getResult(n1, n2));
		//방법2
		int plus = calc(new CalPlus(),n1,n2);
		int minus = calc(new CalMinus(),n1,n2);

	}
	//방법2
	public static int calc(Example ex, int a, int b) {
		return ex.getResult(a, b);
	}

}
   
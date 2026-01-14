package chapter08;

public class ChildMain06 {

	public static void main(String[] args) {
		child ch = new child();
		
		ch.method1();
		ch.method2();
		ch.method3();
		System.out.println();
		
		Parent pa = ch;
		pa.method1();
		pa.method2();
		System.out.println();
		
		Parent pa2 = new Parent();
		pa2.method1();
		pa2.method2();

	}

}

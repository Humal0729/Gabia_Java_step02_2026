package chapter10.Interface;

public class MyClassMain04 {

	public static void main(String[] args) {

		MyClass mc = new MyClass();
		
		X x = mc;
		Y y = mc;
		MyInterface mi = mc;
		
		x.x();
		
		y.y();
		
		mi.x();
		mi.y();
		mi.myMethod();

	}

}

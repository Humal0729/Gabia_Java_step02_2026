package chapter08;


public class B {
	
	public void method() {
		A03 a = new A03();
		a.field="Adios";
		a.method();
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.method();
	}

}

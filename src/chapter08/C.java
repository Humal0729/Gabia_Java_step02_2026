package chapter08;

public class C extends A03{
	public C() {
		super();
		this.field="Adios";
		this.method();
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.method();
	}

}

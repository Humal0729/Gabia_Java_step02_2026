package chapter08;

public class A03 {
	//같은 패키지 내에서는 public 판정, 다른 패키지에서는 private처럼 제한.
	protected String field;
	
	protected void method() {
		System.out.println("A Class");
		System.out.println(field);
	}

}

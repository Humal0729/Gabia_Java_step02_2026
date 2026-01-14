package chapter10.Interface;

public interface Calc {
	
	public static final double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int substaract(int num1, int num2);
	int times(int num1, int num2);
	int divied(int num1, int num2);
	
	default void description() {
		myMethod();
		System.out.println("계산기");
	}
	
	static int total(int arr[]) {
		int total = 0;
		for(int i: arr) {
			total += i;
		}
		myMethod2();
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드");
	}
	
	private static void myMethod2() {
		System.out.println("private 메서드");
	}

}

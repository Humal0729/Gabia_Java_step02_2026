package chapter11;

public class StaticInner03 {
	int a=10;
	private int b=10;
	static int c=200;
	
	static class Inner{
		static int d = 1000;
		
		public void printData() {
			System.out.println("메타스페이스 영역이 아니므로 a 사용불가능");
			System.out.println("메타스페이스 영역이 아니므로 b 사용불가능");
			System.out.println("c 사용가능" + c);
			System.out.println("d 사용가능" + d);
			
		}
	}

	public static void main(String[] args) {
		Inner inner = new Inner();
		inner.printData();
		

	}

}

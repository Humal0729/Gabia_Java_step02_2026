package chapter19;

public class ThreadMain02 {

	public static void main(String[] args) {
		Thread02 t1 = new Thread02();
		t1.start();
		
		try {
			Thread.sleep(11000);
			System.out.println("Program End");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

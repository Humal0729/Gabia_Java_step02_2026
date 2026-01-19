package chapter19;

class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println("Thread " + Thread.currentThread().getName() + ": " + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class Thread03 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.start();
		t2.start();

	}

}

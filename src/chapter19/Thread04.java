package chapter19;

class Counter{
	private int count = 0;
	
	//synchronized 공유 자원에 대해 한번에 하나의 스레드만 접근
	synchronized void increment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}

public class Thread04 {
	
	public static void main(String[] args) {
		Counter cnt = new Counter();
		
		Runnable task = () -> {
			for(int i=0; i<1000; i++) {
				cnt.increment();
			}
		};
		
		Thread thr1 = new Thread(task);
		Thread thr2 = new Thread(task);
		
		thr1.start();
		thr2.start();
		
		try {
			thr1.join();
			thr2.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(cnt.getCount());
		
	}

}

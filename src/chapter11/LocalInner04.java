package chapter11;

class Outter{
	int outNum=100;
	static int sNum=200;
	Runnable getRunnable(int i) {
		int num = 100;
		
		class MyRunnable implements Runnable{
			
			int localnum=10;

			@Override
			public void run() {
				System.out.println("num="+num);
				System.out.println("localnum="+localnum);
				System.out.println("outnum="+outNum);
				System.out.println("snum="+sNum);
			}
			
		}
		return new MyRunnable();
	}
}

public class LocalInner04 {

	public static void main(String[] args) {
		Outter out = new Outter();
		Runnable r = out.getRunnable(10);
		
		r.run();

	}

}

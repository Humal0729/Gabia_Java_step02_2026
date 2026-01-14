package chapter11;

class outerRun{
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
				
			}
		};
	}
}

public class AnonyMousInnerMain05 {

	public static void main(String[] args) {
		outerRun out = new outerRun();
		Runnable r = out.getRunnable(10);
		r.run();

	}

}

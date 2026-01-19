package chapter19;

public class Thread02 extends Thread{
	private int[] temp;
	
	public Thread02() {
		temp = new int[10];
		for(int i=0; i<temp.length; i++) {
			temp[i] = i;
		}
	}

	@Override
	public void run() {
		for(int i: temp) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(temp[i]+"초");
		}
	}
	
	
	
}

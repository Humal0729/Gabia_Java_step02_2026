package chapter19;

public class DemonThread09 implements Runnable{
	
	static boolean autoSave = false;

	public static void main(String[] args) {
		DemonThread09 dm = new DemonThread09();
		Thread t = new Thread(dm); // 일반 객체를 스레드로 변환
		t.setDaemon(true); // 스레드를 데몬스레드로 변환 : 메인이 종료시 자동 종료
		t.start();
		
		for(int i=0; i<15; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
			if(i==3) {
				autoSave=true;
			}
		}

	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(autoSave) {
				System.out.println("자동 저장");
			}
		}
	}
	
	

}

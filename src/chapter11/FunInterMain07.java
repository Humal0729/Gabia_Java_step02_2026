package chapter11;

public class FunInterMain07 {
	
	public void test() {
		
		new FunInter() {
			
			@Override
			public void printData() {
				System.out.println("목요일");
				
			}
		}.printData();;
	}

	public static void main(String[] args) {
		FunInterMain07 fi = new FunInterMain07();
		fi.test();

	}

}

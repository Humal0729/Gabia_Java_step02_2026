package chapter19;

public class ThreadMultiMain06 {

	public static void main(String[] args) {
		ThreadMulti05 t1 = new ThreadMulti05();
		ThreadMulti06 t2 = new ThreadMulti06();
		
		t1.start();
		t2.start();

	}

}

package chapter19;

public class ThreadMain01 {
	
	public static void main(String[] args) {
		Thread01 t = new Thread01();
		t.start(); //run() : 독립적인 공간은 있으나 스레드 역할은 못함
		System.out.println("Main End");
	}
	
}

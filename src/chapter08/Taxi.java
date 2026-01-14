package chapter08;

public class Taxi extends Vehicle{
	int taxi = 1000;

	@Override
	public void run() {
		System.out.println(taxi + "번 택시가 달린다");
	}
	
	

}

package chapter09.Car;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행 시작");
		System.out.println("스스로 방향전환");
		
	}

	@Override
	public void stop() {
		System.out.println("스스로 정지");
		
	}

}

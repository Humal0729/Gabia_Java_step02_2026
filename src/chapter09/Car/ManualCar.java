package chapter09.Car;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("인간 주행 시작");
		System.out.println("핸들로 방향전환");
		
	}

	@Override
	public void stop() {
		System.out.println("브레이크로 정지");
		
	}

}

package chapter09.Computer;

public abstract class Computer {
	//추상메서드 - 바디가없음
	public abstract void display();
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원 킴");
	}
	public void turnOff() {
		System.out.println("전원 끔");
	}
	

}

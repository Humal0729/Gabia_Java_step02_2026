package chapter09.Phone;

public class PhoneMain04 {

	public static void main(String[] args) {
		SmartPhone p = new SmartPhone("자바");
		System.out.println(p.owner);
		p.turnOn();
		p.intersearch();
		p.turnOff();

	}

}

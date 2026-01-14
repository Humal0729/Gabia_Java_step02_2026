package chapter08;

public class ApplianceMain {

	public static void main(String[] args) {
		TV tv = new TV("LG");
		tv.turnOn();
		
		Appliance washer = new Washer("드럼");
		washer.turnOn();
		
		Appliance list[] = new Appliance[3];
		list[0] = new Washer("LG");
		list[1] = new Washer("Samsung");
		list[2] = new Washer("Daewoo");
		
		for(Appliance a: list) {
			a.turnOff();
		}

	}

}

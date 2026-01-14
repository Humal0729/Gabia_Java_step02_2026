package chapter08;

public class DriverMain10 {

	public static void main(String[] args) {
		Driver dr = new Driver();
		Vehicle Bus = new Bus();
		dr.drive(Bus);
		dr.drive(new Taxi());

	}

}

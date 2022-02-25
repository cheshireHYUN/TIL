package chapter07;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		
		Bus bus = new Bus();
		// Vehicle bus = new Bus(); 쓸 수 있음
		Taxi taxi = new Taxi();
		//Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(new Bus());
	}
	

}

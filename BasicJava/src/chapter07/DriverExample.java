package chapter07;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		
		Bus bus = new Bus();
		// Vehicle bus = new Bus(); �� �� ����
		Taxi taxi = new Taxi();
		//Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(new Bus());
	}
	

}

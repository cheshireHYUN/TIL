package Chapter06;

public class Car5Example {
	public static void main(String[] args) {
		Car5 mycar = new Car5();
		
		mycar.setSpeed(-50);
		System.out.println("����ӵ� : "+mycar.getSpeed());
		
		mycar.setSpeed(60);
		
		if(!mycar.isStop()) {
			mycar.setStop(true);
		}
		System.out.println("����ӵ�: "+mycar.getSpeed());
		
	}

}

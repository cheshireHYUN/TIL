package chapter07;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation=car.run();
			
			switch(problemLocation) {
			case 1 : System.out.println("앞왼쪽 한국타이어로 교체");
				
			}
		}
	}

}

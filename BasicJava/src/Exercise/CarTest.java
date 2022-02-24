package Exercise;

public class CarTest {
	
	public static void main(String[] args) {
		Car myCar = new Car("red");
		System.out.println("myCar의 색: "+myCar.getColor());
		System.out.println("차의 최대속력: "+Car.getMaxSpeed()+"km/h");
		
		System.out.println("첫번째 speedUp(100.0km/h): ");
		if(myCar.speedUp(100.0)) {
			System.out.println("속도 변경 가능");
		} else {
			System.out.println("속도변경 불가능,");
		}
		System.out.println("현재 차의 속력: "+myCar.getSpeed()+"km/h");
		
		System.out.println("두번째 speedUp(90.0km/h): ");
		if(myCar.speedUp(90.0)) {
			System.out.println("속도 변경 가능");
		} else {
			System.out.println("속도변경 불가능,");
		}
		System.out.println("현재 차의 속력: "+myCar.getSpeed()+"km/h");
		
		
		
		Car yourCar = new Car("blue");
		System.out.println();
		System.out.println("yourCar의 색: "+yourCar.getColor());
		System.out.println("차의 최대속력: "+Car.getMaxSpeed()+"km/h");
		
		System.out.println("첫번째 speedUp(-100.0km/h): ");
		if(yourCar.speedUp(-100.0)) {
			System.out.println("속도 변경 가능");
		} else {
			System.out.println("속도변경 불가능,");
		}
		System.out.println("현재 차의 속력: "+yourCar.getSpeed()+"km/h");
		
		
		
		System.out.println("두번째 speedUp(210.0km/h): ");
		if(myCar.speedUp(210.0)) {
			System.out.println("속도 변경 가능");
		} else {
			System.out.println("속도변경 불가능,");
		}
		System.out.println("현재 차의 속력: "+myCar.getSpeed()+"km/h");
	}

}

package Exercise;

public class Car {
	//
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200.0;
	
	//
	public Car() {}
	public Car(String color) {
		this.color=color;
	}
	
	
	// 값만큼 속도를 증가시킨다는 문제...!
	public double getSpeed () {
		return speed;
	}
	public void setSpeed () {
		this.speed = speed;
	}

	public String getColor () {
		return color;
	}
	public void setColor () {
		this.color = color;
	}
	
	
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	
	//현재속도 190km/h일때 speedUp(100)을 호출하면
	//최대속력을 넘어가므로 기존속도를 유지
	
	public boolean speedUp(double speed) {
		if(this.speed+speed <0 || this.speed+speed >MAX_SPEED) {
			return false;
		}
		this.speed += speed;
		return true;
	}
}

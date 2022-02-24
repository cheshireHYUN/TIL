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
	
	
	// ����ŭ �ӵ��� ������Ų�ٴ� ����...!
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
	
	//����ӵ� 190km/h�϶� speedUp(100)�� ȣ���ϸ�
	//�ִ�ӷ��� �Ѿ�Ƿ� �����ӵ��� ����
	
	public boolean speedUp(double speed) {
		if(this.speed+speed <0 || this.speed+speed >MAX_SPEED) {
			return false;
		}
		this.speed += speed;
		return true;
	}
}

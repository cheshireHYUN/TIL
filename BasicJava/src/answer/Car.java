package answer;

public class Car {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200.0;
	public Car() {
	}
	public Car(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	// �쁽�옱�냽�룄 190km/h �씪�븣 speedUp(100)�쓣 �샇異쒗븯硫�
	// 理쒕� �냽�젰�쓣 �꽆�뼱媛�誘�濡� 湲곗〈 �냽�룄瑜� �쑀吏�
	public boolean speedUp(double speed) {
		if (this.speed + speed > 0 && this.speed + speed < MAX_SPEED) {
			this.speed += speed;
			return true;
		}
		return false;
//		if (this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {
//			return false;
//		}
//		this.speed += speed;
//		return true;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + "]";
	}
	
}



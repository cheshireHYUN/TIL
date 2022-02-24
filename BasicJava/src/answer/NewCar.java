package answer;

public class NewCar {
	private double speed;
	private String color;
	private static final double MAX_SPEED = killoToMile(200);
	public NewCar() {
	}
	public NewCar(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return mileToKillo(speed);
	}
	public void setSpeed(double speed) {
		this.speed = killoToMile(speed);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static double getMaxSpeed() {
		return mileToKillo(MAX_SPEED);
	}
	
	private static double killoToMile(double distance) {
		return distance / 1.6;
	}
	private static double mileToKillo(double distance) {
		return distance * 1.6;
	}
	// �쁽�옱�냽�룄 190km/h �씪�븣 speedUp(100)�쓣 �샇異쒗븯硫�
	// 理쒕� �냽�젰�쓣 �꽆�뼱媛�誘�濡� 湲곗〈 �냽�룄瑜� �쑀吏�
	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		if (this.speed + speed > 0 && this.speed + speed < MAX_SPEED) {
			this.speed += speed;
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "NewCar [speed=" + speed + ", color=" + color + "]";
	}
	
}

package answer;

public class Circle {
	// �븘�뱶
	private double radius;
	private double x;
	private double y;
	
	// �깮�꽦�옄
	Circle() {
	}
	
	// 硫붿냼�뱶
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		}
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
}

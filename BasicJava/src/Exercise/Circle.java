package Exercise;

public class Circle {
	
	private double radius;
	private double x;
	private double y;
	private double area;
	
	public double getRadius(){
		return radius;
	}
	public void setRadius(double radius){
		this.radius = radius;
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
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
//	public void setArea() {
//		this.area = Math.PI*radius*radius;
//	}
}

package Exercise;

public class Circle extends Shape{
	//
	private double radius;
	//
	public Circle(double radius) {
		this.radius = radius;
	}
	
	//
	@Override
	public double area() {
		double area=radius*radius*Math.PI;
		return area;
	}
	
	@Override
	public double perimeter() {
		double perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	
	public String toString() {
		return "������ ����: ��, �ѷ�: "+perimeter()+"cm, ����: "+area()+"��"; 
		
	}
}

package Exercise;

public class Triangle extends Shape {
	//
	private double side;

	//
	public Triangle(double side) {
		this.side = side;
	}

	//
	@Override
	public double area() {
		double area = Math.sqrt(3) / 4 * side * side;
		return area;
	}

	@Override
	public double perimeter() {
		double perimeter = side * 3;
		return perimeter;
	}

	@Override
	public String toString() {
		return "������ ����: �ﰢ��, �ѷ�: " + perimeter() + "cm, ����: " + area() + "��";
		// return String.format("������ ����: �ﰢ��, �ѷ�: %f",perimeter());
	}

}

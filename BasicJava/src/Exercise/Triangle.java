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
		return "도형의 종류: 삼각형, 둘레: " + perimeter() + "cm, 넓이: " + area() + "㎠";
		// return String.format("도형의 종류: 삼각형, 둘레: %f",perimeter());
	}

}

package Exercise;

import java.util.Arrays;

public class Rectangle extends Shape {
	//�ʵ�
	private double width;
	private double height;
	
	//������
	public Rectangle(double width,double height) {
		this.width = width;
		this.height = height;
	}
	
	//�޼ҵ�
	@Override
	public double area() {
		double area = width*height;
		return area;
	}
	
	@Override
	public double perimeter() {
		double perimeter = 2*(width+height);
		return perimeter;
	}
	
	@Override
	public String toString() {
		return "������ ����: �簢��, �ѷ�: "+perimeter()+"cm, ����: "+area()+"��"; 
	}
	

}

package chapter02;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로의 길이는?(단위: m):" );
		double width = scanner.nextDouble();
		
		System.out.print("세로의 길이는?(단위: m):" );
		double height = scanner.nextDouble();
		
		double area = width*height;
		double perimeter = 2*(width+height);
		
		System.out.printf("직사각형의 넓이 : %f\n직사각형의 둘레: %f",area,perimeter);

	}

}

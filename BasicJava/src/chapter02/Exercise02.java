package chapter02;

import java.util.Scanner;

public class Exercise02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ ���̴�?(����: m):" );
		double width = scanner.nextDouble();
		
		System.out.print("������ ���̴�?(����: m):" );
		double height = scanner.nextDouble();
		
		double area = width*height;
		double perimeter = 2*(width+height);
		
		System.out.printf("���簢���� ���� : %f\n���簢���� �ѷ�: %f",area,perimeter);

	}

}
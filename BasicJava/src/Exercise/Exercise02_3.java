package Exercise;

import java.util.Scanner;

public class Exercise02_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("����� �غ��� �������� �Է��Ͻÿ�.(����:cm):" );
		double radius = scanner.nextDouble();
		System.out.print("������� ���̸� �Է��Ͻÿ�.(����:cm):" );
		double height = scanner.nextDouble();
		
		double area = Math.PI * radius*radius;
		double volume = area*height;
		
		System.out.printf("����� �ظ��� ���̴� %f���̰�, ������� ���Ǵ� %f���̴�.",area,volume);
	}
}

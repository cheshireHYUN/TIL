package Exercise;

import java.util.Scanner;

public class Exercise02_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500��¥�� ������ ����:" );
		double won500 = scanner.nextDouble();
		
		System.out.print("100��¥�� ������ ����:" );
		double won100 = scanner.nextDouble();
		
		System.out.print("50��¥�� ������ ����:" );
		double won50 = scanner.nextDouble();
		
		System.out.print("10��¥�� ������ ����:" );
		double won10 = scanner.nextDouble();
		
		double total = won500*500 + won100*100 + won50*50 + won10*10;
		
		System.out.printf("������ ���� ������ �� �׼� : %f",total);
}
}

package chapter02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in)  //new�� �� ��ü�� ���� scanner�� �ְڴ�. ū ��ĳ�ʴ� Ÿ����
		//	Scanner scanner = new Scanner(System.in);  //sc���� ������+�����̽� ������ �Լ���. �׸��� �ý����� ���� ������+1������ Ÿ�� ��
		//	scanner.next(); //����ڰ� �Է��� �����͸� ���ڷ� �����´�
		//	scanner.nextInt();  //������
		//	scanner.nextDouble(); //Double Ÿ������
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int integer = scanner.nextInt();
		double db = scanner.nextDouble();
		System.out.println(str);
		System.out.println(integer);
		System.out.println(db);
		scanner.close();
	}
}

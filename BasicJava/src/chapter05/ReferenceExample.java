package chapter05;

import java.util.Scanner;

public class ReferenceExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���̸� �Է� : ");
		int age = scanner.nextInt();
		System.out.println("�̸��� �Է�: ");
		String name = scanner.next();
		System.out.printf("����� �̸��� %s�̰� ���̴� %d�Դϴ�",name,age);
		scanner.close();
	}
}


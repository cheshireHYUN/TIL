package chapter05;

import java.util.Scanner;

public class ReferenceExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("나이를 입력 : ");
		int age = scanner.nextInt();
		System.out.println("이름을 입력: ");
		String name = scanner.next();
		System.out.printf("당신의 이름은 %s이고 나이는 %d입니다",name,age);
		scanner.close();
	}
}


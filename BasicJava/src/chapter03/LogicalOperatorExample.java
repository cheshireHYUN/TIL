package chapter03;

import java.util.Scanner;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �ϳ��� �Է��ϼ���:");
		int charCode = scanner.next().charAt(0); //A
		System.out.println(charCode >= 65 && charCode <=90); //�빮�ڸ� T �ҹ��ڸ� F
		
		System.out.println("���ڸ� �Է��ϼ���:");
		int value = scanner.nextInt();
		System.out.println(value%2==0||value%3==0); //||�ΰ��� �տ��� ���� �Ǵ� �����Ҷ� �ڴ� �Ⱥ�
		System.out.println(value%2==0||value%3==0); // |�̰Ŵ� ������ �Ѵٺ�
	}

}

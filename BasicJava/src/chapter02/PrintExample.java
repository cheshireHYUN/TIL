package chapter02;

import java.util.Scanner;

public class PrintExample {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String name= scanner.next();
		int age = scanner.nextInt();
		
		//�̸� : ȫ�浿 ����: 23��
		System.out.println("�̸�:"+name+", ����"+age+"��");
		System.out.printf("�̸�: %s, ����: %d��, Ű:%.1f", name,age,160.5); //.1�� �Ҽ��� ù°�ڸ����� �ݿø� �̶�� ��
		System.out.printf("����: %d,��", 100000);
	}
}

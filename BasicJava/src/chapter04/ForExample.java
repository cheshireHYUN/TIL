package chapter04;

import java.util.Iterator;
import java.util.Scanner;

//1���� n���� �� : n �Է¹ޱ�
public class ForExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ���� n�� �Է��ϼ���: ");
		int n = scanner.nextInt();
		int sum=0, i;
		for (i = 0; i <=n ; i++) {
			sum = sum + i;
		}
		System.out.println("1����"+n+"������ �� :"+sum);
	}

}

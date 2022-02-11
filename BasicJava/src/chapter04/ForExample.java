package chapter04;

import java.util.Iterator;
import java.util.Scanner;

//1부터 n까지 합 : n 입력받기
public class ForExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("합을 구할 n을 입력하세요: ");
		int n = scanner.nextInt();
		int sum=0, i;
		for (i = 0; i <=n ; i++) {
			sum = sum + i;
		}
		System.out.println("1부터"+n+"까지의 합 :"+sum);
	}

}

package chapter04;

import java.util.Scanner;

public class Exercis04_0 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù��° ���� �Է��Ͻÿ�: ");
		int firstNum = scanner.nextInt();
		System.out.println("�ι�° ���� �Է��Ͻÿ�: ");
		int secondNum = scanner.nextInt();
		
		String result;
		
		if(firstNum > secondNum) { result = "True";}
		else { result = "False";}
		System.out.println("ù��° ���� �ι�° ������ ū��? " + result);
}
}

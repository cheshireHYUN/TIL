package chapter04;

import java.util.Scanner;

public class Exercis04_0 {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하시오: ");
		int firstNum = scanner.nextInt();
		System.out.println("두번째 수를 입력하시오: ");
		int secondNum = scanner.nextInt();
		
		String result;
		
		if(firstNum > secondNum) { result = "True";}
		else { result = "False";}
		System.out.println("첫번째 수가 두번째 수보다 큰가? " + result);
}
}

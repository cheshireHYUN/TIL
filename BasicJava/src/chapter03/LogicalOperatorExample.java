package chapter03;

import java.util.Scanner;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자 하나를 입력하세요:");
		int charCode = scanner.next().charAt(0); //A
		System.out.println(charCode >= 65 && charCode <=90); //대문자면 T 소문자면 F
		
		System.out.println("숫자를 입력하세요:");
		int value = scanner.nextInt();
		System.out.println(value%2==0||value%3==0); //||두개면 앞에만 봐도 판단 가능할때 뒤는 안봄
		System.out.println(value%2==0||value%3==0); // |이거는 무조건 둘다봄
	}

}

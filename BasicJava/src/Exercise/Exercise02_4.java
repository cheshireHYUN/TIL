package Exercise;

import java.util.Scanner;

public class Exercise02_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("500원짜리 동전의 갯수:" );
		double won500 = scanner.nextDouble();
		
		System.out.print("100원짜리 동전의 갯수:" );
		double won100 = scanner.nextDouble();
		
		System.out.print("50원짜리 동전의 갯수:" );
		double won50 = scanner.nextDouble();
		
		System.out.print("10원짜리 동전의 갯수:" );
		double won10 = scanner.nextDouble();
		
		double total = won500*500 + won100*100 + won50*50 + won10*10;
		
		System.out.printf("저금통 안의 동전의 총 액수 : %f",total);
}
}

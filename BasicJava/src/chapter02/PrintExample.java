package chapter02;

import java.util.Scanner;

public class PrintExample {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		String name= scanner.next();
		int age = scanner.nextInt();
		
		//이름 : 홍길동 나이: 23세
		System.out.println("이름:"+name+", 나이"+age+"세");
		System.out.printf("이름: %s, 나이: %d세, 키:%.1f", name,age,160.5); //.1은 소수점 첫째자리까지 반올림 이라는 뜻
		System.out.printf("가격: %d,원", 100000);
	}
}

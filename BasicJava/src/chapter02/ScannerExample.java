package chapter02;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in)  //new로 새 객체를 만들어서 scanner에 넣겠다. 큰 스캐너는 타입임
		//	Scanner scanner = new Scanner(System.in);  //sc쓰고 컨츠롤+스페이스 누르면 함수뜸. 그리고 시스템인 쓰고 컨츠롤+1누르면 타입 뜸
		//	scanner.next(); //사용자가 입력한 데이터를 문자로 가져온다
		//	scanner.nextInt();  //정수로
		//	scanner.nextDouble(); //Double 타입으로
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		int integer = scanner.nextInt();
		double db = scanner.nextDouble();
		System.out.println(str);
		System.out.println(integer);
		System.out.println(db);
		scanner.close();
	}
}

package Chapter10;

import java.util.Scanner;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째 데이터 입력");
		String data1 = scanner.next();
		System.out.println("두번째 데이터 입력");
		String data2 = scanner.next();
		
		int value1 = 0;
		try {
			value1 = Integer.parseInt(data1);
		} catch(NumberFormatException e) {
			System.err.println("숫자형식으로 입력하세요");
		}
		
		int value2 = Integer.parseInt(data2);
		int result = value1+value2;
		System.out.println(value1+" + "+value2+ " = " +result);
		
		scanner.close();
	}

}


// ex2. 예외시 입력 다시 할 수 있게끔 하기!
//package Chapter10;
//
//import java.util.Scanner;
//
//public class TryCatchFinallyExample {
//	public static void main(String[] args) {
//		
//		Scanner scanner = new Scanner(System.in);
//		int value1;
//		int value2;
//		while(true) {
//			System.out.println("첫번째 데이터 입력");
//			String data1 = scanner.next();
//			System.out.println("두번째 데이터 입력");
//			String data2 = scanner.next();
//			
//			value1 = 0;
//			value2 = 0;
//			try {
//				value1 = Integer.parseInt(data1);
//				value2 = Integer.parseInt(data2);
//				break;
//			} catch(NumberFormatException e) {
//				System.out.println("숫자형식으로 입력하세요");
//			}
//		}
//		int result = value1+value2;
//		System.out.println(value1+" + "+value2+ " = " +result);
//		
//		scanner.close();
//	}
//
//}


// 오늘 공부왤케하기싫지..................... 흠

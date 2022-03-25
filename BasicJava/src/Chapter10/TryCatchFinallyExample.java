package Chapter10;

import java.util.Scanner;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù��° ������ �Է�");
		String data1 = scanner.next();
		System.out.println("�ι�° ������ �Է�");
		String data2 = scanner.next();
		
		int value1 = 0;
		try {
			value1 = Integer.parseInt(data1);
		} catch(NumberFormatException e) {
			System.err.println("������������ �Է��ϼ���");
		}
		
		int value2 = Integer.parseInt(data2);
		int result = value1+value2;
		System.out.println(value1+" + "+value2+ " = " +result);
		
		scanner.close();
	}

}


// ex2. ���ܽ� �Է� �ٽ� �� �� �ְԲ� �ϱ�!
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
//			System.out.println("ù��° ������ �Է�");
//			String data1 = scanner.next();
//			System.out.println("�ι�° ������ �Է�");
//			String data2 = scanner.next();
//			
//			value1 = 0;
//			value2 = 0;
//			try {
//				value1 = Integer.parseInt(data1);
//				value2 = Integer.parseInt(data2);
//				break;
//			} catch(NumberFormatException e) {
//				System.out.println("������������ �Է��ϼ���");
//			}
//		}
//		int result = value1+value2;
//		System.out.println(value1+" + "+value2+ " = " +result);
//		
//		scanner.close();
//	}
//
//}


// ���� ���Ξ����ϱ����..................... ��

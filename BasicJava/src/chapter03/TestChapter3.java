package chapter03;

import java.util.Scanner;

public class TestChapter3 {

//1�� 2��¶�� ����
//	-�� ���̴°͵� �����̹Ƿ� -b�� int�� ���µ�, 
//	�װ� byte�� ����� b�� ���������Ƿ� �� ū ������ int�� ĳ�����ؼ� �־���ߵ�.
	

	public static void main(String[] args) {
		
		
		
//		# 4������	
//		int pencils = 534;
//		int students = 30;
//		
//		int pencilsPerStudent = (pencils/students);
//		System.out.println(pencilsPerStudent);
//		
//		int pensilsLeft =(pencils%students);
//		System.out.println(pensilsLeft);
	
	
		
	
	//#6������
//	int value = 356;
//	value = 356-56;
//	System.out.println(value);
		
		
		
	
//	#8������
//	int lengthTop = 5;
//	int lengthBottom = 10;
//	int height= 7;
//	double area = ((lengthTop+lengthBottom)*height/2);
//	System.out.println(area);

		
		
		
//	#9������
//	Scanner scanner = new Scanner(System.in);
//	System.out.print("ù��° �� : ");
//	double firstNum = scanner.nextDouble();
//	System.out.print("�ι�° �� : ");
//	double secondNum = scanner.nextDouble();
//	System.out.println("---------------");
//	if (secondNum == 0) {
//		System.out.print("���:���Ѵ�");
//	}
//	else {double result = firstNum/secondNum;
//				
//				System.out.print("��� :"+result);}
		
		
	// #10������
//	int var1 = 10;
//	int var2 = 3;
//	int var3 = 14;
//	double var4 = var1 * var1 * Double.parseDouble(var1+"."+var3);
//	System.out.println("���ǳ��� :"+var4);
	
		
		
		
	//	#11������ name.equals �峭�ϳ� ��¥
	Scanner scanner = new Scanner(System.in);
	System.out.println("���̵� :");
	String name = scanner.nextLine();
	
	System.out.println("�н����� :");
	String strPassword = scanner.nextLine();
	int password = Integer.parseInt(strPassword);
	
	if(name.equals("java")) {
						if(password == 12345) {
							System.out.println("�α��� ����");
						}
						else {
							System.out.println("�α��ν��� : �н����尡 Ʋ��");
						}
	}
	else {System.out.println("�α��ν��� �� ���̵� �������� ����");
		}
		
		
		
	
	}
	
}

package chapter04;

import java.util.Scanner;

//�� ����� �ϴ� ���� ���� �� ������ ����� ����. �� ����� �Է��� ���ڿ��� ���Ͽ� ���� �̰���� ����ϴ� ���α׷��̴�.
//���ڿ��� �б� ���ؼ��� Scanner Ŭ������ next() �޼ҵ带 �̿��ϸ� �ȴ�. �� �ڹٿ��� ���ڿ� �񱳴� ���Ǹ� ��￩�� �Ѵ�. 
// String Ÿ�� ������ ���ڿ� �񱳴� == �� �ƴ� equals() �޼ҵ�� ���Ͽ��� �Ѵ�.

public class ExerciseExample04_4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���������� ������ �����մϴ�");
		System.out.print("ö�� :");
		String var1 = scanner.next();
		System.out.print("���� :");
		String var2 = scanner.next();
		String result=null;
		String result2=null;
		
		if(var1.equals("����")) {
			if(var2.equals("����")) {result = "������"; result2 = "���� �ʾҽ��ϴ�";}
			else if(var2.equals("����")) {result = "����"; result2 = "!";}
			else if(var2.equals("��")) {result = "ö��"; result2 = "!";}
		}
		
		if(var1.equals("����")) {
			if(var2.equals("����")) {result = "ö��"; result2 = "!";}
			else if(var2.equals("����")) {result = "������"; result2 = "���� �ʾҽ��ϴ�";}
			else if(var2.equals("��")) {result = "����"; result2 = "!";}
		}
		
		if(var1.equals("��")) {
			if(var2.equals("����")) {result = "����"; result2 = "!";}
			else if(var2.equals("����")) {result = "ö��"; result2 = "!";}
			else if(var2.equals("��")) {result = "������"; result2 = "���� �ʾҽ��ϴ�";}
		}
		
	
	
		System.out.println("��� :"+result+" �¸�"+result2);
	}
		
		
	}

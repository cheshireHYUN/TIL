package chapter04;

import java.util.Random;
import java.util.Scanner;

//��ǻ�Ͱ� 1���� 100 ������ ������ ������ �����ϸ�, �� ���� ���ߴ� ������ ������. ����ڰ� ������ ���� �Է��ϸ�, 
//��ǻ�Ͱ� ������ ������ ū�� �������� �˷��ش�. ����ڰ� ������ ���� ��ǻ�Ͱ� ������ ���� ���� ������ �ݺ��Ѵ�.
//1���� 100������ ���� ���ڴ� new Random().nextInt(100) + 1�� ���� �� �ִ�.
public class ExerciseExample04_5 {
	public static void main(String[] args) {
		Random random = new Random();
		int dice = random.nextInt(100) + 1;
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		
		
		while(dice!=choice) {
		System.out.print("1���� 100������ �� �� �ϳ��� �����ϼ���: ");
		choice = scanner.nextInt();
		if(dice>choice) {System.out.println("������ �� ū���Դϴ�");}
		else if (dice<choice) {System.out.println("������ �� �������Դϴ�");}
		}
		System.out.println("�����Դϴ�");
		
		
		}
		
	}


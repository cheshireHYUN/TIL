// ����ڷκ��� �� ���� ���̸� �Է¹��� ��, �Է¹��� ���� ���̷� �ﰢ���� �Է� ���� �� �ִ��� �Ǻ��ϴ� ���α׷��� ����� ����. 
// �ﰢ���� �Ǻ��ϴ� ����� ���� �� ���� ���̰� �ٸ� �� ���� ������ �պ��� ������ �ﰢ���� ���� �� �ִ�.


package chapter04;

import java.util.Scanner;

public class ExerciseExample04_1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("�ﰢ���� ù��° ���� ���̸� �Է��ϼ��� :");
	int R1 = scanner.nextInt();
	System.out.println("�ﰢ���� �ι�° ���� ���̸� �Է��ϼ��� :");
	int R2 = scanner.nextInt();
	System.out.println("�ﰢ���� ����° ���� ���̸� �Է��ϼ��� :");
	int R3 = scanner.nextInt();
	
	if (R1>R2&&R1>R3) {
		System.out.println((R1<(R2+R3))? "�ﰢ���� ���� �� �ֽ��ϴ�" : "�ﰢ���� ���� �� �����ϴ�");
	} 
	
	else if (R2>R1&&R2>R3) {
		System.out.println((R2<(R1+R3))? "�ﰢ���� ���� �� �ֽ��ϴ�" : "�ﰢ���� ���� �� �����ϴ�");
		} 
		
	else if (R3>R1&&R3>R2) {
		System.out.println((R3<(R1+R2))? "�ﰢ���� ���� �� �ֽ��ϴ�" : "�ﰢ���� ���� �� �����ϴ�");
	} 
	
		
		
	
	
	
	
}
}

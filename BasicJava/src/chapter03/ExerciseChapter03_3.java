package chapter03;

import java.util.Scanner;

//�Է� ������ �������� �ƴ��� Ȯ���ϴ� ���α׷��� �ۼ��غ���. 
//������ ������ ������ ���ٰ� �����Ѵ�.
//������ 4�� ����̾�� �ϰ�, 100�� ����� �ƴϾ�� �Ѵ�. 
//���� 400�� ����� ������ ������ �ȴ�

public class ExerciseChapter03_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("�������� Ȯ���� ������ �Է��ϼ���: ");
		int year = scanner.nextInt();
		if(( year % 4 == 0 && year % 100 != 0)|| year%400==0) {
				System.out.printf("%d���� �����̴�.",year);}
		else {System.out.printf("%d���� ������ �ƴմϴ�.",year);}
			}
			}

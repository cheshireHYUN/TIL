package chapter03;

import java.util.Scanner;

//��Ʈ��������(�Ŵ뵵��)�� ������ ���� 2���� ���� �� �ϳ��� �����Ͽ��� �Ѵٰ� �����Ѵ�. 
// � ���ð� ��Ʈ�������������� �˾ƺ��� ���α׷��� �ۼ��Ͽ� ����.(���׿����� ���)
//1. �� ������ �����̰�, �α��� 100�� �̻��̾�� �Ѵ�. 
//2. �� �ҵ��� 1�� �̻��� �α��� 50�� �̻��̾�� �Ѵ�.
public class ExerciseExample03_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.print("���� �Դϱ�?(����:1, �����ƴ�:0) ");
		int capital = scanner.nextInt();
		System.out.print("�� �α���? (����:��) ");
		int totalPopulation = scanner.nextInt();
		System.out.print("���ҵ��� 1�� �̻��� �α���? (����:��)");
		int wealthyPopulation = scanner.nextInt();
		
		System.out.print(((capital==1 && totalPopulation >= 100) || wealthyPopulation>=50) ? "�� ���ô� ��Ʈ�������� �Դϴ�" : "�� ���ô� ��Ʈ���������� �ƴմϴ�");
	}
}

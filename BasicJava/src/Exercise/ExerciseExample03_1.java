//�� ������ �Է¹޾� ū ���� ���� ���� ���� ��� �������� ����ϴ� ���α׷��� ����� ����. 
//������ �� ������ a, b�� ���Ͽ� ((a + b) + |a - b|) / 2�� ū ��, 
//((a + b) - |a - b|) / 2�� ���� ���̴�. ���밪�� ��ȯ�ϴ� �޼ҵ�� Math.abs(����)�̴�. 
//���� |-3|�� �˾ƺ��� ������ Math.abs(-3)�̶�� ���� 3�� ��ȯ�ȴ�. �̰��� �̿��Ͽ� ����� ����.
//� ���� 0���� ������ ���� ���������� �������� �����Ƿ� 0�� �Է����� �ʴ´ٰ� �����ϰ� ���α׷��� �ۼ�


package Exercise;

import java.util.Scanner;

public class ExerciseExample03_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��ϼ���: ");
		int a = scanner.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���: ");
		int b = scanner.nextInt();
		
		
		int bigVar = ((a+b)+Math.abs(a-b))/2;
		int smallVar = ((a+b)-Math.abs(a-b))/2;
		
		
		int share = bigVar/smallVar;
		int rest = bigVar%smallVar;
		System.out.printf("ū ���� ���� ���� ���� ���� %d�̰�, �������� %d�̴�", share,rest);
	}
	
}

package chapter05;

import java.util.Random;

public class Exercise05_2 {
	// �ζǹ�ȣ�� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	// (�ζ� ��ȣ�� 1 ~ 45������ ������ �� �߿��� �ߺ����� �ʴ� 6���� ���ڸ� �����Ͽ� ����� ����Ѵ�.)
	public static void main(String[] args) {
		
	int[] numbers = new int[45];

	for(int i=0; i<numbers.length; i++) {
		numbers[i] = i+1;
	}
	Random random = new Random();
	for(int i = 0; i<numbers.length;i++) {
		int ranNUM = random.nextInt(45);
		int temp = numbers[i];
		numbers[i] = numbers[ranNUM];
		numbers[ranNUM]=temp;
	}
	for(int i=0; i<6; i++) {
		System.out.println(numbers[i]+"");
	}
	

}
}
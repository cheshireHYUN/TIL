package Exercise;

import java.util.Random;

// �ζǹ�ȣ�� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//(�ζ� ��ȣ�� 1 ~ 45������ ������ �� �߿��� �ߺ����� �ʴ� 6���� ���ڸ� �����Ͽ� ����� ����Ѵ�.)
public class Exercise05_2 {
	public static void main(String[] args) {
		
		int[] Array = new int[45];
		//i<=Array.length; ��� �ؼ� ������ �����µ�, �迭�� 0���� 44���� �� ���� 45�̰�, i=0���� �����ϴϱ� length�� 45���� �۾ƾ���!
		for (int i =0; i<Array.length; i++) {
			Array[i] = i+1;
			System.out.println(Array[i]);
		}
		
		Random random = new Random();
		for(int i=0;i<6;i++) {
			int ranNum = random.nextInt(45);
			System.out.print(Array[ranNum]+" ");
		}
		
		
	}

}

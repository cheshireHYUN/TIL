package chapter05;

import java.util.Random;
import java.util.Scanner;

// �ΰ����� ��ǻ�Ϳ� ���̸�(���)�� ���������� ������ �� �� �ֵ��� ���α׷��� �ۼ��Ͻÿ�.

public class Exercise05_3 {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ٺ���");
		System.out.println("���̸�:");
		String player = scanner.next();
		Random random = new Random();
		int ranNum = random.nextInt(3);
		
		String[] rps = {"����,����,��"};
		String ai = rps[ranNum];
		
		String result = "";
		if (player.equals("ai")) {
			
			// chapter04_4 ����
		}
		
		
		
		
		
		
	}

}

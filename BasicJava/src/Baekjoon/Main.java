package Baekjoon;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//��... �Է��� ���� �� �ް� �����ص״ٰ� �ѹ��� ����ؾ��ϴϱ�
		//�迭��ü�� ���� ������ �ص־߰ڴ�!
		int T = scanner.nextInt();
		int[] resultArray = new int[T];
		
		int result;
		for(int i=0;i<T;i++) {
			int var1 = scanner.nextInt();
			int var2 = scanner.nextInt();
			result = var1+var2;
			resultArray[i] = result; //�迭�� ������ ������
		}

			for(int i=0;i<T;i++) {
			System.out.println("Case #"+(i+1)+": "+resultArray[i]);
			}
			
	
	
	
	}
	

}
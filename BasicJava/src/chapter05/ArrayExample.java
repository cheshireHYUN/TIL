package chapter05;

import java.util.Scanner;

public class ArrayExample {
public static void main(String[] args) {
	//5���� ���� �Է¹ް� ������ ��� ���ϴ� ���α׷�
	Scanner scanner = new Scanner(System.in);
	
	int[] scores = new int[5];
	for(int i=0; i<scores.length; i++) {
		System.out.println((i+1)+"�� ���� �Է� : ");
		scores[i] = scanner.nextInt();
	}
	
	int sum=0;
	for(int score:scores) {
		sum+=score;
	}
	
	double average =(double)sum/scores.length;
	System.out.println("����: "+sum);
	System.out.println("���: "+average);
	
}
}

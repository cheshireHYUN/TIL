package chapter05;

import java.util.Scanner;

public class ArrayExample {
public static void main(String[] args) {
	//5명의 점수 입력받고 총점과 평균 구하는 프로그램
	Scanner scanner = new Scanner(System.in);
	
	int[] scores = new int[5];
	for(int i=0; i<scores.length; i++) {
		System.out.println((i+1)+"번 점수 입력 : ");
		scores[i] = scanner.nextInt();
	}
	
	int sum=0;
	for(int score:scores) {
		sum+=score;
	}
	
	double average =(double)sum/scores.length;
	System.out.println("총점: "+sum);
	System.out.println("평균: "+average);
	
}
}

package Exercise;

import java.util.Scanner;

//사용자로부터 5과목의 점수를 입력받아 평균을 구하는 프로그램을 작성하여 보자. 
//평균 점수로 학점을 계산하여 출력한다.(평균 점수는 소숫점 둘째자리까지만 출력)
//평균 점수가 90점 이상이면 A, 80점 이상 90점 미만이면 B, 70점 이상 80점 미만이면 C, 
//60점 이상 70점 미만이면 D, 60점 미만이면 F로 계산한다.


public class ExerciseExample04_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int grade1=scanner.nextInt();
		System.out.print("데이터베이스: ");
		int grade2=scanner.nextInt();
		System.out.print("화면구현: ");
		int grade3=scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int grade4=scanner.nextInt();
		System.out.print("머신러닝: ");
		int grade5=scanner.nextInt();
		
		int total = grade1+grade2+grade3+grade4+grade5;
		System.out.println("총점: "+total);
		double average = (double)total/5;
		System.out.printf("평균:%.2f ",average);
		
		char grade;
		if(average>=90) {grade = 'A';}
		else if(average>=80) {grade = 'B';}
		else if(average>=70) {grade = 'C';}
		else if(average>=60) {grade = 'D';}
		else {grade = 'F';}
		System.out.println("학점: "+grade);
		
		
		
		
		
		
		
		
		
	}

}

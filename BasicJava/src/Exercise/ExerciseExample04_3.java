package Exercise;

import java.util.Scanner;

//����ڷκ��� 5������ ������ �Է¹޾� ����� ���ϴ� ���α׷��� �ۼ��Ͽ� ����. 
//��� ������ ������ ����Ͽ� ����Ѵ�.(��� ������ �Ҽ��� ��°�ڸ������� ���)
//��� ������ 90�� �̻��̸� A, 80�� �̻� 90�� �̸��̸� B, 70�� �̻� 80�� �̸��̸� C, 
//60�� �̻� 70�� �̸��̸� D, 60�� �̸��̸� F�� ����Ѵ�.


public class ExerciseExample04_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		System.out.print("���α׷��� ����: ");
		int grade1=scanner.nextInt();
		System.out.print("�����ͺ��̽�: ");
		int grade2=scanner.nextInt();
		System.out.print("ȭ�鱸��: ");
		int grade3=scanner.nextInt();
		System.out.print("���ø����̼� ����: ");
		int grade4=scanner.nextInt();
		System.out.print("�ӽŷ���: ");
		int grade5=scanner.nextInt();
		
		int total = grade1+grade2+grade3+grade4+grade5;
		System.out.println("����: "+total);
		double average = (double)total/5;
		System.out.printf("���:%.2f ",average);
		
		char grade;
		if(average>=90) {grade = 'A';}
		else if(average>=80) {grade = 'B';}
		else if(average>=70) {grade = 'C';}
		else if(average>=60) {grade = 'D';}
		else {grade = 'F';}
		System.out.println("����: "+grade);
		
		
		
		
		
		
		
		
		
	}

}

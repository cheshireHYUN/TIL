package Exercise;

import java.util.Scanner;

// ����ڷκ��� Ư�� ���� �Է¹��� ��, �Է� ���� ���� ������ � �������� �˾Ƴ��� ���α׷��� ����� ����. 
// 3��~5���� ��, 6��~8���� ����, 9��~11���� ����, 12��~2���� �ܿ��� ����Ѵ�.
public class ExerciseExample04_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���: ");
		int month = scanner.nextInt();
		
		if(month==3||month==4||month==5) {System.out.println(month + "���� ���Դϴ�");}
		
		else if(month==6||month==7||month==8) {System.out.println(month + "���� �����Դϴ�");}
		
		else if(month==9||month==10||month==11) {System.out.println(month + "���� �����Դϴ�");}
		
		else {System.out.println(month + "���� �ܿ��Դϴ�");}
		
	}
}

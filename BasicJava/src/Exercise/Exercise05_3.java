package Exercise;

import java.util.Random;
import java.util.Scanner;

// �ΰ����� ��ǻ�Ϳ� ���̸�(���)�� ���������� ������ �� �� �ֵ��� ���α׷��� �ۼ��Ͻÿ�.

public class Exercise05_3 {
	public static void main(String[] args) {
		System.out.println("������������ �Է��ϼ���: ");
		
		Scanner scanner = new Scanner(System.in);
		String gamer = scanner.next();
		System.out.println("���̸�: "+gamer);
		
		String[] aiArray = {"����","����","��"};
		Random random = new Random();
		int i = random.nextInt(3);
		String aiComputer = aiArray[i];
		System.out.println("�ΰ����� ��ǻ��: "+aiComputer);
		
		String winner = "";
		String result = "";
		
		if(gamer.equals(aiComputer)) {
			result = "�����ϴ�!";
		} else if((gamer.equals("����") && aiComputer.equals("��"))||(gamer.equals("����") && aiComputer.equals("����"))||(gamer.equals("��") && aiComputer.equals("����"))){
			winner = "���̸� ";
			result = "�¸�!";
		} else if((gamer.equals("����") && aiComputer.equals("����"))||(gamer.equals("����") && aiComputer.equals("��"))||(gamer.equals("��") && aiComputer.equals("����"))){
			winner = "�ΰ����� ��ǻ�� ";
			result = "�¸�!";
		}
		
		
		System.out.println("���: "+ winner + result);
	}
	

}

package chapter04;

import java.util.Random;

public class DiceExample {
	public static void main(String[] args) {
		Random random = new Random();
		
		int dice = random.nextInt(6)+1;
		int var = dice%2;
		String result;
		if(var==0) {
			result = "¦��";
		}else { result = "Ȧ��";}
		
		System.out.println(dice+"�� "+result+"�Դϴ�");
	}
}

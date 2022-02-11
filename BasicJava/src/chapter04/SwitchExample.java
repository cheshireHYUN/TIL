package chapter04;

import java.util.Random;

public class SwitchExample {
	public static void main(String[] args) {
		Random random = new Random();
		Random random2 = new Random();
		int dice = random.nextInt(6)+1;
		switch (dice) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
				
			case 2:
				System.out.println("1번이 나왔습니다.");
				break;
			
			default:
				break;
			}
		
	}
}

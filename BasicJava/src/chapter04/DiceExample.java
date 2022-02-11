package chapter04;

import java.util.Random;

public class DiceExample {
	public static void main(String[] args) {
		Random random = new Random();
		
		int dice = random.nextInt(6)+1;
		int var = dice%2;
		String result;
		if(var==0) {
			result = "Â¦¼ö";
		}else { result = "È¦¼ö";}
		
		System.out.println(dice+"´Â "+result+"ÀÔ´Ï´Ù");
	}
}

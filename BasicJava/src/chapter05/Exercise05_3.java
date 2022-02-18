package chapter05;

import java.util.Random;
import java.util.Scanner;

// 인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.

public class Exercise05_3 {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("가바보겜");
		System.out.println("게이머:");
		String player = scanner.next();
		Random random = new Random();
		int ranNum = random.nextInt(3);
		
		String[] rps = {"가위,바위,보"};
		String ai = rps[ranNum];
		
		String result = "";
		if (player.equals("ai")) {
			
			// chapter04_4 참고
		}
		
		
		
		
		
		
	}

}

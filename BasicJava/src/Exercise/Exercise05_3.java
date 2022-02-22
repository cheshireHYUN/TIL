package Exercise;

import java.util.Random;
import java.util.Scanner;

// 인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.

public class Exercise05_3 {
	public static void main(String[] args) {
		System.out.println("가위바위보를 입력하세요: ");
		
		Scanner scanner = new Scanner(System.in);
		String gamer = scanner.next();
		System.out.println("게이머: "+gamer);
		
		String[] aiArray = {"가위","바위","보"};
		Random random = new Random();
		int i = random.nextInt(3);
		String aiComputer = aiArray[i];
		System.out.println("인공지능 컴퓨터: "+aiComputer);
		
		String winner = "";
		String result = "";
		
		if(gamer.equals(aiComputer)) {
			result = "비겼습니다!";
		} else if((gamer.equals("가위") && aiComputer.equals("보"))||(gamer.equals("바위") && aiComputer.equals("가위"))||(gamer.equals("보") && aiComputer.equals("바위"))){
			winner = "게이머 ";
			result = "승리!";
		} else if((gamer.equals("가위") && aiComputer.equals("바위"))||(gamer.equals("바위") && aiComputer.equals("보"))||(gamer.equals("보") && aiComputer.equals("가위"))){
			winner = "인공지능 컴퓨터 ";
			result = "승리!";
		}
		
		
		System.out.println("결과: "+ winner + result);
	}
	

}

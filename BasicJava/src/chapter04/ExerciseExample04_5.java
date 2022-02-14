package chapter04;

import java.util.Random;
import java.util.Scanner;

//컴퓨터가 1부터 100 사이의 임의의 정수를 생성하면, 그 수를 맞추는 게임을 만들어보자. 사용자가 추측한 수를 입력하면, 
//컴퓨터가 생성한 수보다 큰지 작은지를 알려준다. 사용자가 추측한 수가 컴퓨터가 생성한 수와 같을 때까지 반복한다.
//1부터 100까지의 랜덤 숫자는 new Random().nextInt(100) + 1로 구할 수 있다.
public class ExerciseExample04_5 {
	public static void main(String[] args) {
		Random random = new Random();
		int dice = random.nextInt(100) + 1;
		Scanner scanner = new Scanner(System.in);
		int choice=0;
		
		
		while(dice!=choice) {
		System.out.print("1부터 100까지의 수 중 하나를 선택하세요: ");
		choice = scanner.nextInt();
		if(dice>choice) {System.out.println("정답은 더 큰수입니다");}
		else if (dice<choice) {System.out.println("정답은 더 작은수입니다");}
		}
		System.out.println("정답입니다");
		
		
		}
		
	}


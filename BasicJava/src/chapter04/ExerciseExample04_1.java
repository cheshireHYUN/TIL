// 사용자로부터 세 변의 길이를 입력받은 후, 입력받은 변의 길이로 삼각형을 입력 받을 수 있는지 판별하는 프로그램을 만들어 보자. 
// 삼각형을 판별하는 방법은 가장 긴 변의 길이가 다른 두 변의 길이의 합보다 작으면 삼각형을 만들 수 있다.


package chapter04;

import java.util.Scanner;

public class ExerciseExample04_1 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("삼각형의 첫번째 변의 길이를 입력하세요 :");
	int R1 = scanner.nextInt();
	System.out.println("삼각형의 두번째 변의 길이를 입력하세요 :");
	int R2 = scanner.nextInt();
	System.out.println("삼각형의 세번째 변의 길이를 입력하세요 :");
	int R3 = scanner.nextInt();
	
	if (R1>R2&&R1>R3) {
		System.out.println((R1<(R2+R3))? "삼각형을 만들 수 있습니다" : "삼각형을 만들 수 없습니다");
	} 
	
	else if (R2>R1&&R2>R3) {
		System.out.println((R2<(R1+R3))? "삼각형을 만들 수 있습니다" : "삼각형을 만들 수 없습니다");
		} 
		
	else if (R3>R1&&R3>R2) {
		System.out.println((R3<(R1+R2))? "삼각형을 만들 수 있습니다" : "삼각형을 만들 수 없습니다");
	} 
	
		
		
	
	
	
	
}
}

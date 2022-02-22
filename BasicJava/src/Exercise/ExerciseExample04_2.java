package Exercise;

import java.util.Scanner;

// 사용자로부터 특정 월을 입력받은 후, 입력 받은 월의 계절이 어떤 계절인지 알아내는 프로그램을 만들어 보자. 
// 3월~5월은 봄, 6월~8월은 여름, 9월~11월은 가을, 12월~2월은 겨울을 출력한다.
public class ExerciseExample04_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("월을 입력하세요: ");
		int month = scanner.nextInt();
		
		if(month==3||month==4||month==5) {System.out.println(month + "월은 봄입니다");}
		
		else if(month==6||month==7||month==8) {System.out.println(month + "월은 여름입니다");}
		
		else if(month==9||month==10||month==11) {System.out.println(month + "월은 가을입니다");}
		
		else {System.out.println(month + "월은 겨울입니다");}
		
	}
}

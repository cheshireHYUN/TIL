package chapter04;

import java.util.Scanner;

//두 사람이 하는 가위 바위 보 게임을 만들어 보자. 두 사람이 입력한 문자열을 비교하여 누가 이겼는지 출력하는 프로그램이다.
//문자열을 읽기 위해서는 Scanner 클래스의 next() 메소드를 이용하면 된다. 또 자바에서 문자열 비교는 주의를 기울여야 한다. 
// String 타입 변수와 문자열 비교는 == 이 아닌 equals() 메소드로 비교하여야 한다.

public class ExerciseExample04_4 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위바위보 게임을 시작합니다");
		System.out.print("철수 :");
		String var1 = scanner.next();
		System.out.print("영희 :");
		String var2 = scanner.next();
		String result=null;
		String result2=null;
		
		if(var1.equals("가위")) {
			if(var2.equals("가위")) {result = "누구도"; result2 = "하지 않았습니다";}
			else if(var2.equals("바위")) {result = "영희"; result2 = "!";}
			else if(var2.equals("보")) {result = "철수"; result2 = "!";}
		}
		
		if(var1.equals("바위")) {
			if(var2.equals("가위")) {result = "철수"; result2 = "!";}
			else if(var2.equals("바위")) {result = "누구도"; result2 = "하지 않았습니다";}
			else if(var2.equals("보")) {result = "영희"; result2 = "!";}
		}
		
		if(var1.equals("보")) {
			if(var2.equals("가위")) {result = "영희"; result2 = "!";}
			else if(var2.equals("바위")) {result = "철수"; result2 = "!";}
			else if(var2.equals("보")) {result = "누구도"; result2 = "하지 않았습니다";}
		}
		
	
	
		System.out.println("결과 :"+result+" 승리"+result2);
	}
		
		
	}

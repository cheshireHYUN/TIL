package chapter03;

import java.util.Scanner;

public class TestChapter3 {

//1번 2번쨋줄 에러
//	-를 붙이는것도 연산이므로 -b는 int로 들어가는데, 
//	그걸 byte로 선언된 b에 대입했으므로 더 큰 범위인 int를 캐스팅해서 넣어줘야됨.
	

	public static void main(String[] args) {
		
		
		
//		# 4번문제	
//		int pencils = 534;
//		int students = 30;
//		
//		int pencilsPerStudent = (pencils/students);
//		System.out.println(pencilsPerStudent);
//		
//		int pensilsLeft =(pencils%students);
//		System.out.println(pensilsLeft);
	
	
		
	
	//#6번문제
//	int value = 356;
//	value = 356-56;
//	System.out.println(value);
		
		
		
	
//	#8번문제
//	int lengthTop = 5;
//	int lengthBottom = 10;
//	int height= 7;
//	double area = ((lengthTop+lengthBottom)*height/2);
//	System.out.println(area);

		
		
		
//	#9번문제
//	Scanner scanner = new Scanner(System.in);
//	System.out.print("첫번째 수 : ");
//	double firstNum = scanner.nextDouble();
//	System.out.print("두번째 수 : ");
//	double secondNum = scanner.nextDouble();
//	System.out.println("---------------");
//	if (secondNum == 0) {
//		System.out.print("결과:무한대");
//	}
//	else {double result = firstNum/secondNum;
//				
//				System.out.print("결과 :"+result);}
		
		
	// #10번문제
//	int var1 = 10;
//	int var2 = 3;
//	int var3 = 14;
//	double var4 = var1 * var1 * Double.parseDouble(var1+"."+var3);
//	System.out.println("원의넓이 :"+var4);
	
		
		
		
	//	#11번문제 name.equals 장난하나 진짜
	Scanner scanner = new Scanner(System.in);
	System.out.println("아이디 :");
	String name = scanner.nextLine();
	
	System.out.println("패스워드 :");
	String strPassword = scanner.nextLine();
	int password = Integer.parseInt(strPassword);
	
	if(name.equals("java")) {
						if(password == 12345) {
							System.out.println("로그인 성공");
						}
						else {
							System.out.println("로그인실패 : 패스워드가 틀림");
						}
	}
	else {System.out.println("로그인실패 ㅣ 아이디 존재하지 않음");
		}
		
		
		
	
	}
	
}

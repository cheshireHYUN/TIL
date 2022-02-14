package chapter04;

import java.util.Random;
import java.util.Scanner;

public class TestChapter04 {
public static void main(String[] args) {
	//2,3,4

	// 2번문제
//    int sum = 0;
//	for(int i=1;i<=100;i++) {
//		if (i%3==0) {
//			sum += i;
//		}
//	}
//		System.out.println(sum);
	
	//3번문제
//	Random random = new Random();
//	while(true) {
//		int dice1= random.nextInt(6)+1;
//		int dice2= random.nextInt(6)+1;
//		System.out.println("("+dice1+","+dice2+")");
//		if (dice1+dice2==5) {break;}
//	}
	
	//4번문제
//	int x=0;
//	int y=0;
//	
//	for(x=1; x<=10; x++) {
//		for(y=1; y<=10; y++)
//		if (4*x+5*y == 60) {
//			System.out.println("("+x+","+y+")");
//	}	
//
//}
	

	//5번문제
//	for(int i=1;i<5;i++){
//		for(int j=0;j<i;j++){
//			System.out.print("*");
//		}
//		System.out.println("");
//	}
	
	
	
	//6번문제
	
//	for (int i = 1; i <= 4; i++) {
//	    
//	    // 공백 j for문
//	    for(int j = 3; j >= i; j--) {
//	        System.out.print(" ");
//	    }
//	    
//	    // 별 j for문
//	    for(int j=1; j <=i; j++) {
//	        System.out.print("*");
//	    }
//	    
//	    System.out.println("");
//	}
//	
	//7번문제
	
	boolean run = true;
	int balance = 0;
	int money = 0;
	int money2 = 0;
	Scanner scanner = new Scanner(System.in);
	
	while(run) {
		System.out.println("----------------------------------");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("----------------------------------");
		System.out.println("선택> ");
		int choice = scanner.nextInt();
		
		if(choice==1) {
			System.out.println("입금액>");
			money = scanner.nextInt();
			balance+=money;
		}
		else if(choice==2){
			System.out.println("출금액>");
			money2 = scanner.nextInt();
			balance-=money2;
		}
		else if(choice==3){
			System.out.println("잔고>"+balance);
		}
		else if(choice==4){
			System.out.println("프로그램종료");
			break;
		}
			
		
	}
}
}

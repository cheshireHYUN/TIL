package chapter04;

import java.util.Random;
import java.util.Scanner;

public class TestChapter04 {
public static void main(String[] args) {
	//2,3,4

	// 2������
//    int sum = 0;
//	for(int i=1;i<=100;i++) {
//		if (i%3==0) {
//			sum += i;
//		}
//	}
//		System.out.println(sum);
	
	//3������
//	Random random = new Random();
//	while(true) {
//		int dice1= random.nextInt(6)+1;
//		int dice2= random.nextInt(6)+1;
//		System.out.println("("+dice1+","+dice2+")");
//		if (dice1+dice2==5) {break;}
//	}
	
	//4������
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
	

	//5������
//	for(int i=1;i<5;i++){
//		for(int j=0;j<i;j++){
//			System.out.print("*");
//		}
//		System.out.println("");
//	}
	
	
	
	//6������
	
//	for (int i = 1; i <= 4; i++) {
//	    
//	    // ���� j for��
//	    for(int j = 3; j >= i; j--) {
//	        System.out.print(" ");
//	    }
//	    
//	    // �� j for��
//	    for(int j=1; j <=i; j++) {
//	        System.out.print("*");
//	    }
//	    
//	    System.out.println("");
//	}
//	
	//7������
	
	boolean run = true;
	int balance = 0;
	int money = 0;
	int money2 = 0;
	Scanner scanner = new Scanner(System.in);
	
	while(run) {
		System.out.println("----------------------------------");
		System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
		System.out.println("----------------------------------");
		System.out.println("����> ");
		int choice = scanner.nextInt();
		
		if(choice==1) {
			System.out.println("�Աݾ�>");
			money = scanner.nextInt();
			balance+=money;
		}
		else if(choice==2){
			System.out.println("��ݾ�>");
			money2 = scanner.nextInt();
			balance-=money2;
		}
		else if(choice==3){
			System.out.println("�ܰ�>"+balance);
		}
		else if(choice==4){
			System.out.println("���α׷�����");
			break;
		}
			
		
	}
}
}

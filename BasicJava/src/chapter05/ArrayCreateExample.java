package chapter05;

public class ArrayCreateExample {
	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		int sum =0;
		
		for(int i = 0; i<scores.length;i++) {
			System.out.println("scores["+i+"]:"+scores[i]);
			
			if(i%2==0) {System.out.println("점");}
			else {System.out.println();}
		for (int score : scores) {System.out.println(score);}
		}
		//향상된 for문
//		for(int score : scores){
//			sum+=score;
//		}
//		System.out.println("sum= " +sum);
	
	}
	}

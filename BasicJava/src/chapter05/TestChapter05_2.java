package chapter05;

public class TestChapter05_2 {
	public static void main(String[] args) {
		
		
		
		//3번문제
//		int[][] Array = {
//				{95,86},
//				{83,92,96},
//				{78,83,93,87,88}
//		};
//		
//	int num1 = Array.length;
//	int num2 = Array[2].length;
//	
//	System.out.println(num1);
//	System.out.println(num2);

		
		
		
		//4번문제
		
//		int max=0;
//		int[] arrays = {1,5,3,8,2};
//		
//		for(int array : arrays) {
//			max=(max<=array ? array : max); 
//		}
//		System.out.println("max: "+max);
		
		
		
		//5번문제
		int [][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0, count=0;
		double avg = 0.0;
		
		for(int i=0;i<array.length;i++){
			for(int j=0; j<array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
			
		}
		
		avg = (double)sum/count;
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}}
		
		














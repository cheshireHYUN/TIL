package Exercise;

public class Exercise05_1 {
	// 다음 배열에서 최댓값과 최솟값을 구하시오.
	// {38, 94, 16, 3, 76, 94, 82, 47, 59, 8}
	
	public static void main(String[] args) {
		
		int[] newArray = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		int max = 0;
		for(int array:newArray) {
			if(array>max) {
				max = array;
			}
		}
		System.out.println("최댓값 :"+max);
		
		int min = max;
		for(int array:newArray) {
			if(array<min) {
				min = array;
			}
		}
		
		System.out.println("최솟값 :"+min);
		
	}

}

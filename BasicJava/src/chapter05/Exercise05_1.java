package chapter05;


//다음 배열의 최댓값과 최솟값을 구하시오
public class Exercise05_1 {
	public static void main(String[] args) {
		
	int max =Integer.MIN_VALUE; //최솟값으로 시작
	int min=Integer.MAX_VALUE; //최댓값으로 시작
	int[] numbers = {38,94,16,3,76,94,82,47,59,8};
	
	//int max = numbers[0];
	//int mix = numbers[0]; 이렇게 할수도 있다
	
	for(int i=0;i<numbers.length;i++) {
		if (numbers[0]>max) {
			max=numbers[i];
		}
		if(numbers[0]<min) {
			min=numbers[i];
		}
	}
	
	

}
}

package chapter05;


//���� �迭�� �ִ񰪰� �ּڰ��� ���Ͻÿ�
public class Exercise05_1 {
	public static void main(String[] args) {
		
	int max =Integer.MIN_VALUE; //�ּڰ����� ����
	int min=Integer.MAX_VALUE; //�ִ����� ����
	int[] numbers = {38,94,16,3,76,94,82,47,59,8};
	
	//int max = numbers[0];
	//int mix = numbers[0]; �̷��� �Ҽ��� �ִ�
	
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

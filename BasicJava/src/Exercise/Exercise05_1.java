package Exercise;

public class Exercise05_1 {
	// ���� �迭���� �ִ񰪰� �ּڰ��� ���Ͻÿ�.
	// {38, 94, 16, 3, 76, 94, 82, 47, 59, 8}
	
	public static void main(String[] args) {
		
		int[] newArray = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		int max = 0;
		for(int array:newArray) {
			if(array>max) {
				max = array;
			}
		}
		System.out.println("�ִ� :"+max);
		
		int min = max;
		for(int array:newArray) {
			if(array<min) {
				min = array;
			}
		}
		
		System.out.println("�ּڰ� :"+min);
		
	}

}

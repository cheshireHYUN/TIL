package Exercise;

import java.util.Random;

// 로또번호를 생성하는 프로그램을 작성하시오.
//(로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)
public class Exercise05_2 {
	public static void main(String[] args) {
		
		int[] Array = new int[45];
		//i<=Array.length; 라고 해서 오류가 났었는데, 배열은 0부터 44까지 총 길이 45이고, i=0부터 시작하니까 length인 45보다 작아야함!
		for (int i =0; i<Array.length; i++) {
			Array[i] = i+1;
			System.out.println(Array[i]);
		}
		
		Random random = new Random();
		for(int i=0;i<6;i++) {
			int ranNum = random.nextInt(45);
			System.out.print(Array[ranNum]+" ");
		}
		
		
	}

}

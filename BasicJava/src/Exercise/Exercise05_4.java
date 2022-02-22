package Exercise;

import java.util.Random;

//주사위를 던져서 각 면이 나오는 횟수를 출력하는 프로그램을 만들어 보자. 주사위를 던지는 동작은 1부터 6까지의 임의로 만들어내는 난수 발생기(Random 객체)가 대신한다. 
//난수 발생기를 10,000번 호출하여 각 면이 나타나는 횟수를 계산하여 배열에 저장한다. 
//확률 이론에 의하면 주사위의 각각의 면들이 거의 동일한 횟수로 나와야 한다.
public class Exercise05_4 {
	public static void main(String[] args) {
		
		int[] Array = new int[10000];
		for(int i=0;i<Array.length;i++) {
			Random ranNum = new Random();
			Array[i] = ranNum.nextInt(6)+1;
		}
		
		int var1=0, var2=0, var3=0, var4=0, var5=0, var6=0;
		for(int array : Array) {				
			if (array==1) {
				var1++;
			}
			if (array==2) {
				var2++;
			}
			if (array==3) {
				var3++;
			}
			if (array==4) {
				var4++;
			}
			if (array==5) {
				var5++;
			}
			if (array==6) {
				var6++;
			}
		}
		
		System.out.println("------------");
		System.out.println(" 면      빈도");
		System.out.println("------------");
		System.out.println("1      "+var1);
		System.out.println("2      "+var2);
		System.out.println("3      "+var3);
		System.out.println("4      "+var4);
		System.out.println("5      "+var5);
		System.out.println("6      "+var6);
	}
	

}

package Exercise;

import java.util.Random;

//�ֻ����� ������ �� ���� ������ Ƚ���� ����ϴ� ���α׷��� ����� ����. �ֻ����� ������ ������ 1���� 6������ ���Ƿ� ������ ���� �߻���(Random ��ü)�� ����Ѵ�. 
//���� �߻��⸦ 10,000�� ȣ���Ͽ� �� ���� ��Ÿ���� Ƚ���� ����Ͽ� �迭�� �����Ѵ�. 
//Ȯ�� �̷п� ���ϸ� �ֻ����� ������ ����� ���� ������ Ƚ���� ���;� �Ѵ�.
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
		System.out.println(" ��      ��");
		System.out.println("------------");
		System.out.println("1      "+var1);
		System.out.println("2      "+var2);
		System.out.println("3      "+var3);
		System.out.println("4      "+var4);
		System.out.println("5      "+var5);
		System.out.println("6      "+var6);
	}
	

}

package Exercise;

public class Exercise02_2 {
	public static void main(String[] args) {
		
		double distance = 40e12;
		long speed = 300000l*365*24*60*60;
		double time = distance/speed;
		
		System.out.printf("���Ǽӵ��� ���Ͻø� ��Ÿ�츮 ������ ���µ� �ɸ��� �ð��� %f�����̴�.",time);
	}
}

package Exercise;

public class Exercise02_2 {
	public static void main(String[] args) {
		
		double distance = 40e12;
		long speed = 300000l*365*24*60*60;
		double time = distance/speed;
		
		System.out.printf("빛의속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 %f광년이다.",time);
	}
}

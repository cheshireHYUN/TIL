package answer;
public class TimeTest {
	public static void main(String[] args) {
		Time time1 = new Time();
		System.out.println("湲곕낯 �깮�꽦�옄 �샇異� �썑 �떆媛�: " + time1);
		Time time2 = new Time(22, 15, 48);
		System.out.println("�몢 踰덉㎏ �깮�꽦�옄 �샇異� �썑 �떆媛�: " + time2);
		Time time3 = new Time(15, 66, 77);
		System.out.println("�삱諛붾Ⅴ吏� �븡�� �떆媛� �꽕�젙 �썑 �떆媛�: " + time3);
	}
}
package answer;
public class CircleTest {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setRadius(3.6);
		circle1.setX(0.0);
		circle1.setY(1.5);

		System.out.println("諛섏�由�: " + circle1.getRadius());
		System.out.println("以묒떖 醫뚰몴: " + "(" + circle1.getX() + "," + circle1.getY() + ")");
		System.out.printf("�꼻�씠: %.2f\n", circle1.getArea());

		Circle circle2 = new Circle();
		circle2.setRadius(-5.0); // 留뚯빟 �옒紐삳맂 媛믪씠 �엯�젰�릺�뿀�쓣 寃쎌슦 諛섏�由꾩쓽 媛믪쓣 0�쑝濡� �븳�떎.
		circle2.setX(1.0);
		circle2.setY(2.2);

		System.out.println("諛섏�由�: " + circle2.getRadius());
		System.out.println("以묒떖 醫뚰몴: " + "(" + circle2.getX() + "," + circle2.getY() + ")");
		System.out.printf("�꼻�씠: %.2f\n", circle2.getArea());
	}
}
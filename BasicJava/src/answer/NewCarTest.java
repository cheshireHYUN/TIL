package answer;
public class NewCarTest {
	public static void main(String[] args) {
		NewCar myCar = new NewCar("red");
		System.out.println("myCar�쓽 �깋: " + myCar.getColor());
		System.out.println("李⑥쓽 理쒕� �냽�젰: " + NewCar.getMaxSpeed() + "km/h");
		
		System.out.print("泥� 踰덉㎏ speedUp(100.0km/h): ");
		if (myCar.speedUp(100.0)) {
			System.out.print("�냽�룄 蹂�寃� 媛��뒫,");
		} else {
			System.out.print("�냽�룄 蹂�寃� 遺덇��뒫,");
		}
		System.out.println(" �쁽�옱 李⑥쓽 �냽�젰: " + myCar.getSpeed() + "km/h");
		
		System.out.print("�몢 踰덉㎏ speedUp(90.0km/h): ");
		if (myCar.speedUp(90.0)) {
			System.out.print("�냽�룄 蹂�寃� 媛��뒫,");
		} else {
			System.out.print("�냽�룄 蹂�寃� 遺덇��뒫,");
		}
		System.out.println(" �쁽�옱 李⑥쓽 �냽�젰: " + myCar.getSpeed() + "km/h");
		
		NewCar yourCar = new NewCar("blue");
		System.out.println();
		System.out.println("yourCar�쓽 �깋: " + yourCar.getColor());
		System.out.println("李⑥쓽 理쒕� �냽�젰: " + NewCar.getMaxSpeed() + "km/h");
		
		System.out.print("泥� 踰덉㎏ speedUp(-100.0km/h): ");
		if (yourCar.speedUp(-100.0)) {
			System.out.print("�냽�룄 蹂�寃� 媛��뒫,");
		} else {
			System.out.print("�냽�룄 蹂�寃� 遺덇��뒫,");
		}
		System.out.println(" �쁽�옱 李⑥쓽 �냽�젰: " + yourCar.getSpeed() + "km/h");
		
		System.out.print("�몢 踰덉㎏ speedUp(210.0km/h): ");
		if (yourCar.speedUp(210.0)) {
			System.out.print("�냽�룄 蹂�寃� 媛��뒫,");
		} else {
			System.out.print("�냽�룄 蹂�寃� 遺덇��뒫,");
		}
		System.out.println(" �쁽�옱 李⑥쓽 �냽�젰: " + yourCar.getSpeed() + "km/h");

	}
}
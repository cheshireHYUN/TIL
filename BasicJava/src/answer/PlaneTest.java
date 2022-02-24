package answer;
public class PlaneTest {
	public static void main(String[] args) {
		Plane plane1 = new Plane("蹂댁엵", "蹂댁엵 747", 450);
		System.out.println("�젣議곗궗: " + plane1.getManufacture());
		System.out.println("紐⑤뜽紐�: " + plane1.getModel());
		System.out.println("理쒕� �듅媛앹닔: " + plane1.getMaxNumberOfPassengers());
		System.out.println();
		
		Plane plane2 = new Plane("蹂댁엵", "蹂댁엵 777", 500);
		System.out.println("�젣議곗궗: " + plane2.getManufacture());
		System.out.println("紐⑤뜽紐�: " + plane2.getModel());
		System.out.println("理쒕� �듅媛앹닔: " + plane2.getMaxNumberOfPassengers());
		System.out.println();
		
		Plane plane3 = new Plane();
		plane3.setManufacture("濡앺엳�뱶 留덊떞");
		plane3.setModel("F-22");
		plane3.setMaxNumberOfPassengers(-10);	// �옒紐삳맂 媛믪쓣 �엯�젰�븯硫� 0�쑝濡� 蹂��솚
		
		System.out.println("�젣議곗궗: " + plane3.getManufacture());
		System.out.println("紐⑤뜽紐�: " + plane3.getModel());
		System.out.println("理쒕� �듅媛앹닔: " + plane3.getMaxNumberOfPassengers());
		System.out.println();
		
		System.out.println("�깮�궛�맂 鍮꾪뻾湲곗쓽 �닔: " + Plane.getNumberOfPlanes());
		System.out.println(plane3);
	}
}
package chapter07;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.tackOff(); //�̷��մϴ�
		sa.fly(); // �Ϲݺ����մϴ�
		sa.flyMode=SupersonicAirplane.SUPERSONIC; //��� �ٲ�! ������� Ŭ������.����� ���� ���� ���� sa.����� ���������� ����
		sa.fly(); // �����Ӻ�����Դϴ�
		sa.flyMode=SupersonicAirplane.NORMAL; //����ٲ�
		sa.fly(); //�Ϲݺ���
		sa.land(); //�����մϴ�
		
	}

}

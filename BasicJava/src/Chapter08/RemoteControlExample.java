package Chapter08;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Television(); //RemoteContol���� �� �̰���! �ϸ� TVȣ��
		RemoteControl rc2 = new Audio(); //RemoteContol���� �� �̰���! �ϸ� Audioȣ��
		
		// ������ �������̽�. �����ʹ� Ŭ����!
		rc.turnOn();
		rc.setVolume(8);
		rc.turnOff();
		
		rc2.turnOn();
		rc2.setVolume(8);
		rc2.turnOff();
		
		Searchable rc3 = new SmartTelevision();
		rc3.search("www.google.co.kr");
	}

}

package Chapter08;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Television(); //RemoteContol에게 너 이거해! 하면 TV호출
		RemoteControl rc2 = new Audio(); //RemoteContol에게 너 이거해! 하면 Audio호출
		
		// 동작은 인터페이스. 데이터는 클래스!
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

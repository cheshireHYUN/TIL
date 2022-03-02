package Chapter08;

// 인터페이스 안의 상수는 이미 상수이기때문에 static final 붙이지 않음. 또한 private도 사용하지 않는다. 아무것도 안쓴상태 = public 
public interface RemoteControl {
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);

}

package Chapter08;

public class Audio implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio�� �մϴ�");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		if(volume>MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}else if (volume<MAX_VOLUME) {
			this.volume = MIN_VOLUME;
		}else {
		this.volume = volume;
		System.out.println("���� Audio ����: "+this.volume);
		// TODO Auto-generated method stub
		}
	}

}

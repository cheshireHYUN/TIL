package Chapter08;

public class Television implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV�� �մϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
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
			System.out.println("���� TV ����: "+this.volume);
		}
	}

}

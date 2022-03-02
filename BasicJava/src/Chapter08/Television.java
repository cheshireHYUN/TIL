package Chapter08;

public class Television implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV¸¦ ÄÕ´Ï´Ù");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV¸¦ ²ü´Ï´Ù");
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
			System.out.println("ÇöÀç TV º¼·ý: "+this.volume);
		}
	}

}

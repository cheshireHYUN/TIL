package Exercise;

public class Time {
	//�ʵ�
	private int hour;
	private int minute;
	private int second;
	
	//������
	public Time(){
		this.hour= 00;
		this.minute=00;
		this.second=00;
	}
	
	public Time(int hour,int minute,int second){
		if(hour<=23&&hour>0&&minute<=59&&minute>=0&&second<=59&&second>=0) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		} else { 
			this.hour= 0;
			this.minute=0;
			this.second=0;
		  }
	}
	
	//�޼ҵ�
	public String toString() {
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}
	
	
}



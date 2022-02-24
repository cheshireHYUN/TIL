package Exercise;

public class newCar {
	public double speed;
	public String color;
	public  static final double MAX_SPEED =200.0;
	
	newCar(){}
	newCar(String color){
		
	}
	
	
	
	public double getSpeed(){
		return speed;
	}
	public double setSpeed(double speed){
		this.speed = killoToMile(speed);
	}
	public String getColor(){
		return color;
	}
	public void setColor(String color){
		this.color = color;
	}


	
	
	public boolean speedUp(double speed) {
		speed = killoToMile(speed);
		if(this.speed+speed > 0 && this.speed+speed < MAX_SPEED) {
			this.speed+=speed;
			return true;
		}
		return false;
	}
	
	
	private static double killoToMile( double distance) {
		return distance/1.6;
	} 
	
	private static double MileToKillo( double distance) {
		return distance*1.6;
		
	} 

	//현재속도 190키로미터퍼에이치일때 스피드업(100)울 호출하면
	// 최대속력 넘어가므로 기존속도를 유지
}

	public String toString() {
		return "NewCAr [speed=" + speed + ", color="+ color +"]";
	}

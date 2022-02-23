package Exercise;

public class Plane {
	// 필드
	private String manufacturer; //제작사
	private String model; //비행기모델명
	private int maxNumberOfPassengers; //최대승객수
	private static int numberOfPlanes; //지금까지 생성된 비행기 객체수, 정적변수로 선언, 객체 생성시 생성자에서 증가
	
	//생성자
	Plane(){
		
	}
	
	Plane(String manufacturer, String model, int maxNumberOfPassengers){
		this.manufacturer = manufacturer;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
	}
	
	//메소드
	
	public void setManufacture(String manufacturer) {
		if(manufacturer == null) {
			manufacturer = this.manufacturer;
		}else {
			this.manufacturer = manufacturer;
			}
	}
	public String getManufacture() {
		setManufacture(manufacturer);
		numberOfPlanes ++;
		return manufacturer;
	}
	
	
	
	public void setModel(String model) {
		if(model == null) {
			model = this.model;
		}else {
			this.model = model;
		}
	}
	public String getModel() {
		setModel(model);
		return model;
	}
	
	
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if(model == null) {
			maxNumberOfPassengers = this.maxNumberOfPassengers;
		}else {
			 this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	}
	public int getMaxNumberOfPassengers() {
		setMaxNumberOfPassengers(maxNumberOfPassengers);
		return maxNumberOfPassengers;
	}
	
	
	// numberOfplanes의 값을 반환하는 정적 메소드
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	
//	public String toString() {
//		return;
//	}

}

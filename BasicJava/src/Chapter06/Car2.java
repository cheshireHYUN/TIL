package Chapter06;

public class Car2 {
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	Car2(){
		
	}
	
	
	Car2(String model){
		this(model,"����",250);
	}
	
	
	Car2(String model, String color){
		this(model,color,250);
	}
	
	
	Car2(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}

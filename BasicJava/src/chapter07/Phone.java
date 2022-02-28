package chapter07;

public class Phone {
	private String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public abstract void internetSearch();
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다");
	}

}

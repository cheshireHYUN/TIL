package chapter07;

public class Phone {
	private String owner;
	public Phone(String owner) {
		this.owner = owner;
	}
	
	public abstract void internetSearch();
	
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�");
	}

}

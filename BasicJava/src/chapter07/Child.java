package chapter07;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
		System.out.println(name);
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
		System.out.println(name);
	}

}

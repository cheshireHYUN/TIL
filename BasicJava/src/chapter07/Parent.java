package chapter07;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");
		// this()는 같은 클래스의 다른 생성자를 호출할 때 사용
		System.out.println("Parent() call");
		System.out.println(nation);
	}
	
	public Parent(String nation) {
		
		this.nation = nation;
		System.out.println("Parent(String nation) call");
		System.out.println(nation);
	}

}

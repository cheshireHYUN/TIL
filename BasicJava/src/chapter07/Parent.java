package chapter07;

public class Parent {
	public String nation;
	
	public Parent() {
		this("���ѹα�");
		// this()�� ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���
		System.out.println("Parent() call");
		System.out.println(nation);
	}
	
	public Parent(String nation) {
		
		this.nation = nation;
		System.out.println("Parent(String nation) call");
		System.out.println(nation);
	}

}

package Exercise;

public class Human {
	//필드
	private String name;
	private int age;
	
	//생성자
	public Human() {
	}
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public int getAge() {
		return age;
		
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		// return String.format("이름:%s, 나이:%d", name, age);
		return "이름: "+name+", 나이: "+age;
	}

	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

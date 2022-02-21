package Chapter06;

public class Student {
	String name; // 초기화 안했는데 Student Example에서 null로 표현됨. 필드가 만들어진 순간 자동 초기화 된 것!
	int no; //0으로 자동 초기화
	
	
	//생성자
	public Student(String n) {
		name = n;
	}
	
	public Student(int n) {
		no = n;
	}
	
	public Student(String nm, int n) {
		name = nm;
		no = n;
	}

}

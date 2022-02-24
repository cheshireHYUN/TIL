package chapter07;

public class Student extends People {
	int studentNo;
	//public Student() {
		//super("","");
		// super();일때는 오류가 나는데, 왜냐면 부모에 매개변수가 없는 경우의 생성자가 없기 때문이다
		// sol(1) 매개변수가 없는 디폴트 생성자를 People에 만든다
		//sol(2) 위와같이 super("","");로 선언해 매개변수 두개인 생성자를 쓰게한다
	//}
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn);
		this.studentNo = studentNo;
	}

}

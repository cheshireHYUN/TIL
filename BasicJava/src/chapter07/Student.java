package chapter07;

public class Student extends People {
	int studentNo;
	//public Student() {
		//super("","");
		// super();�϶��� ������ ���µ�, �ֳĸ� �θ� �Ű������� ���� ����� �����ڰ� ���� �����̴�
		// sol(1) �Ű������� ���� ����Ʈ �����ڸ� People�� �����
		//sol(2) ���Ͱ��� super("","");�� ������ �Ű����� �ΰ��� �����ڸ� �����Ѵ�
	//}
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn);
		this.studentNo = studentNo;
	}

}

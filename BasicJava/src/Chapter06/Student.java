package Chapter06;

public class Student {
	String name; // �ʱ�ȭ ���ߴµ� Student Example���� null�� ǥ����. �ʵ尡 ������� ���� �ڵ� �ʱ�ȭ �� ��!
	int no; //0���� �ڵ� �ʱ�ȭ
	
	
	//������
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

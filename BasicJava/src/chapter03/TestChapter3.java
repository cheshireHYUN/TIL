package chapter03;

public class TestChapter3 {

	//1�� 2��¶�� ����
//	-�� ���̴°͵� �����̹Ƿ� -b�� int�� ���µ�, 
//	�װ� byte�� ����� b�� ���������Ƿ� �� ū ������ int�� ĳ�����ؼ� �־���ߵ�.
	
	
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils/students);
		System.out.println(pencilsPerStudent);
		
		int pensilsLeft =(pencils%students);
		System.out.println(pensilsLeft);
	}
	
}

package chapter03;

public class TestChapter3 {

	//1번 2번쨋줄 에러
//	-를 붙이는것도 연산이므로 -b는 int로 들어가는데, 
//	그걸 byte로 선언된 b에 대입했으므로 더 큰 범위인 int를 캐스팅해서 넣어줘야됨.
	
	
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils/students);
		System.out.println(pencilsPerStudent);
		
		int pensilsLeft =(pencils%students);
		System.out.println(pensilsLeft);
	}
	
}

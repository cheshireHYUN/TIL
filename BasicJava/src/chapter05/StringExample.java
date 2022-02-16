package chapter05;

public class StringExample {
	public static void main(String[] args) {
//		String name1 = new String("홍길동");
//		String name2 = new String("홍길동");
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		if(name1==name2) {
			System.out.println("같음");
		}
		else {System.out.println("다름");}
	}
	
	//다름이 왜 나와? 서로다르게 선언하니 힙과 스택에도 다른 주소가 생겨 각자 참조했으니 다름,,,
	

}

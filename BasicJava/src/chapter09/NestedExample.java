package chapter09;

public class NestedExample {
	public static void main(String[] args) {
		Nestedclass nestedclass = new Nestedclass();{
			nestedclass.a = "A";
		}
		
		//위 NestedClass가 생성 안되면 b도 불러올 수 없음
		new Nestedclass().new InnerClass();
		// 이렇게..
		//또는
		// InnerClass innerClass = new Nestedclass(). new InnerClass(); ???
	}

}

package chapter09;

public class NestedExample {
	public static void main(String[] args) {
		Nestedclass nestedclass = new Nestedclass();{
			nestedclass.a = "A";
		}
		
		//�� NestedClass�� ���� �ȵǸ� b�� �ҷ��� �� ����
		new Nestedclass().new InnerClass();
		// �̷���..
		//�Ǵ�
		// InnerClass innerClass = new Nestedclass(). new InnerClass(); ???
	}

}

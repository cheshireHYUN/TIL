package chapter07;

public class SmartPhone extends Phone{

//	public SmartPhone() {
//		super(owner);
//	} // �ƹ��ŵ� �Ⱦ��� ����Ʈ�����ڿ� ���۰� ����. �׆� �θ� ���� ��� ���������ִ°���
	
	public SmartPhone(String owner) {
		super(owner);
		
		@Override
		public void internetSearch() {
			System.out.println("���ͳ� �˻��� �մϴ�");
		}
}
	
	

}

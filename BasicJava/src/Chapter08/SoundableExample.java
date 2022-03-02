package Chapter08;

public class SoundableExample {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog()); 
	}
	
	//Soundable soundable�� ������ ��ü�� ���� �޼ҵ�� ����
	private static void printSound(Soundable soundable) { // ������ dog��ü�� soundable�̶�� �������̽��� ������...
		System.out.println(soundable.sound());
	}

}

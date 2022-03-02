package Chapter08;

public class SoundableExample {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog()); 
	}
	
	//Soundable soundable를 구현한 객체가 위의 메소드로 들어갈것
	private static void printSound(Soundable soundable) { // 생성된 dog객체가 soundable이라는 인터페이스에 담기겠죠...
		System.out.println(soundable.sound());
	}

}

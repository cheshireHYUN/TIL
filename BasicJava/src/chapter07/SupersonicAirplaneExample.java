package chapter07;

public class SupersonicAirplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.tackOff(); //이륙합니다
		sa.fly(); // 일반비행합니다
		sa.flyMode=SupersonicAirplane.SUPERSONIC; //상수 바뀜! 상수쓸땐 클래스명.상수명 일케 쓰면 좋음 sa.상수명 ㄱㄴ하지만 경고뜸
		sa.fly(); // 초음속비행기입니다
		sa.flyMode=SupersonicAirplane.NORMAL; //상수바뀜
		sa.fly(); //일반비행
		sa.land(); //착륙합니다
		
	}

}

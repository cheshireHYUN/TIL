package chapter02;

public class PromotionExample {
	public static void main(String[] args){
		byte b = 65;
		char c = (char) b; // (오류) byte는 음수가 가능하므로 char형 변환 불가능
	}
}

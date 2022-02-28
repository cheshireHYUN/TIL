package chapter07;

public class SmartPhone extends Phone{

//	public SmartPhone() {
//		super(owner);
//	} // 아무거도 안쓰면 디폴트생성자와 슈퍼가 생략. 그넫 부모에 슈퍼 없어서 에러나고있는것임
	
	public SmartPhone(String owner) {
		super(owner);
		
		@Override
		public void internetSearch() {
			System.out.println("인터넷 검색을 합니다");
		}
}
	
	

}

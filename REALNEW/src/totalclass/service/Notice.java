package totalclass.service;

import java.math.BigDecimal;

//import totalclass.util.ScanUtil;
import totalclass.util.View;

public class Notice {
	private static Notice instance;
	public static Notice getInstance(){
		if(instance == null){
			instance = new Notice();
		}
		return instance;
	}	
	// 근데이게 스튜던트데이터가 아니라 공지사항데이터일듯
	// 원랜 스튜던트데이터에서.. 미리 저장해뒀던 테이블을 꺼내와서 바꾸는 메소드를 마이메뉴에 선언해놨던 형태니까
	// 공지사항데이터에서,,, 미리 저장해놨던테이블을 바꾸는 메소드를 실행하고
	// StudentMenuDAO에선 테이블을 가져다 저장해둔거니까 나도 공지사항DAO만들어서 테이블저장해놔야지
	//private NoticeData noticedata = NoticeData.getInstance();

	// 공지사항 선택시 곧바로 실행되는 메소드
	public int notice() {
		try{
			if(((BigDecimal) MainService.login.get("AUTH")).intValue()==1){
				openNotice(); //이 메소드 실행 끝나고 반드시 이 밑의 리턴값이 실행되므로 MAIN이 뜬다!
			}
			
			else {
				System.out.println("본 수강생이 아닌 사람은 확인할 수 없습니다.");
			}
		}catch (NullPointerException a) {
			
			}
		
		return View.MAIN;
	}

	private void openNotice() {
		System.out.println("=====================TODAY'S NOTICE======================");
		String[] keyname = {"수강코드","글 번호","제목","내용"};
		String[] key = {"TAKECLASS_ID","NOTICE_NUM","NOTICE_TITLE","NOTICE_CONTENT"};
		for (int i = 0; i < 4; i++) {
			System.out.println(keyname[i] + " : "
					+ MainService.login.get(key[i]));
		}
		System.out.println("===========================================");
	}





	
}
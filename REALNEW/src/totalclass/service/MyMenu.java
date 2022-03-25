package totalclass.service;

import java.math.BigDecimal;
import java.util.Map;

import totalclass.join.StudentDAO;
import totalclass.util.ScanUtil;
import totalclass.util.View;

public class MyMenu {
	private static MyMenu instance;
	public static MyMenu getInstance(){
		if(instance == null){
			instance = new MyMenu();
		}
		return instance;
	}	
	private StudentData studata = StudentData.getInstance();
	private StudentDAO studentDao =StudentDAO.getInstance();
	
	public int myMenu() {//권한별 메뉴이동. 마이메뉴가 켜지기 전에 권한을 확인하고 넣는다
	try{
		if(((BigDecimal) MainService.login.get("AUTH")).intValue()==1){
			albaMenu(); //이 메소드 실행 끝나고 반드시 이 밑의 리턴값이 실행되므로 MAIN이 뜬다!
		}
		
		else {
			System.out.println("관리자는 확인할 수 없습니다.");
		}
	}catch (NullPointerException a) {
		
		}
	
	return View.MAIN;
	}

	

	public void albaMenu() {//학생이 접근 가능한 마이메뉴
		System.out.println("\n\n"+"========================[My menu]=========================");
		System.out.println("1.내 정보 보기\t 2.개인정보 수정/탈퇴\t 3.메인으로 돌아가기");
		System.out.println("==========================================================");
		System.out.print("원하시는 서비스의 번호를 입력해주세요: ");
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			openMyData();
			break;
		case 2:
			studata.Modify();
			break;
		case 3:
			break;
		default:
			System.out.println("다시 입력해주세요");
			break;
		}

	}


	public int openMyData() {
		String[] keyname = {"ID","PASSWORD","이름","생일","연락처","주소","성적"};
		String[] key = {"STU_ID","STU_PW","STU_NAME","STU_BIR","STU_TEL","STU_ADD","STU_GPA"};
		MainService.login = studentDao.userInfo((String) MainService.login.get("STU_ID"));
		System.out.println("\n====================[개인정보]===================");
		for (int i = 0; i < 7; i++) {
			System.out.print(keyname[i] + " : ");
			if(MainService.login.get(key[i])==null){System.out.println("비어있음");}
			else {System.out.println(MainService.login.get(key[i]));}			
		}
		System.out.println("===============================================\n");
		
		return 0;
	}



	
}
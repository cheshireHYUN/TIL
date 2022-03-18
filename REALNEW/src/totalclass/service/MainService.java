package totalclass.service;

import java.util.Map;

//import service.MyMenu;
import totalclass.controller.Controller;
import totalclass.util.ScanUtil;
import totalclass.util.View;

public class MainService {
	public static Map<String, Object> login;
	// login변수가 입력받은 id와 pw에 해당하는 테이블의 (키,값)들을갖고있는듯?

	private MainService(){}
	private static MainService instance;
	public static MainService getInstance(){
		if(instance == null){
			instance = new MainService();
		}
		return instance;
	}	
	public static void main(){
		new MainService().service();
	}
	
	// 인스턴스 만들고
	private MyMenu mymenu = MyMenu.getInstance();
//	private StudentQna stuQna = StudentQna.getInstance();
	private Notice notice = Notice.getInstance();

	
	// 메인에서 바로 부르는 메소드이다.
	public int service() {
		int view = View.MAIN;
		
		// !!!!!!!!!!!while문 나오면 만약 뷰 어쩌고가 호출되었을때 어디클래스의 어디메소드가 실행될지 써줘야됨. 어디클래스인지는 인스턴스 만들어 넣어줘야겠지?
		while(true){
			switch(view){
			case View.MAIN: view = serviceList(); break; //1빠로 실행
			case View.MYMENU: view = mymenu.myMenu(); break;
//			case View.QNASTUDENT: view = stuQna.qnaStu(); break;
			case View.NOTICE: view = notice.notice(); break;
			case View.HOME: view = new Controller().start(); break;
			}
		}
	}
	

	public int serviceList(){
		System.out.println("===========================================");
		System.out.println(" 1. 마이메뉴\t2. 수강신청\t3. 공지사항");
		System.out.println(" 4. 개인 Q&A\t5. 로그아웃\t0. 종료");
		System.out.println("===========================================");
		System.out.print(">");
		int input = ScanUtil.nextInt();
		
		switch(input){
		case 1:	return View.MYMENU;
		//case 2: return View.SIGNUP;
		case 3: return View.NOTICE;
		case 4: return View.QNASTUDENT;
		case 5: 
			login = null;
			return View.HOME;
		case 0: 
			System.out.println("종료합니다.");
			System.exit(0); //걍종료됨
		default :
			System.out.println("잘못 입력하였습니다.");
			break; //리턴 값 없으니까 밑에 있는 리턴 실행
		}
		return View.MAIN;
	}
	
}
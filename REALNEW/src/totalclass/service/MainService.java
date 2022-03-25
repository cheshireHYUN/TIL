package totalclass.service;

import java.math.BigDecimal;
import java.util.Map;

import totalclass.service.NoticeService;
import totalclass.service.ReviewService;
//import service.MyMenu;
import totalclass.controller.Controller;
import totalclass.util.ScanUtil;
import totalclass.util.View;

public class MainService {
	
	public static Map<String, Object> loginclass;
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
		 new MainService().service0();
	}		
	
	
	// 인스턴스 만들고
	private MyMenu mymenu = MyMenu.getInstance();
	private SignClass signclass = SignClass.getInstance();
	private ClassNow classnow = ClassNow.getInstance(); 
	private NoticeService stuNc = NoticeService.getInstance();
	private NoticeService lecNc = NoticeService.getInstance();
	private ReviewService stuRv = ReviewService.getInstance();
	private ReviewService lecRv = ReviewService.getInstance();
	private SignClass lecSg = SignClass.getInstance();
	
	
	// 선생님 or 학생 인증키에 따라 부르는 메소드가 달라지게 한다!
	public int service0() {
		if(((BigDecimal) MainService.login.get("AUTH")).intValue()==1){
			return service();
		}
		else {return lecService();}
		
	}
	
	
	
	
	//학생
	public int service() {
		int view = View.MAIN;
		
		// !!!!!!!!!!!while문 나오면 만약 뷰 어쩌고가 호출되었을때 어디클래스의 어디메소드가 실행될지 써줘야됨. 어디클래스인지는 인스턴스 만들어 넣어줘야겠지?
		while(true){
			switch(view){
			case View.MAIN: view = serviceList(); break;
			case View.MYMENU: view = mymenu.myMenu(); break;
			case View.SIGNCLASS: view = signclass.signClass(); break;
			case View.STUNC: view = stuNc.noticeStudent(); break;
			case View.STURV: view = stuRv.reviewStudent(); break;
			case View.HOME: view = new Controller().start(); break;
			
			}
		}
	}
	
	
	public int serviceList(){
		System.out.println("===========================================");
		System.out.println(" 1. 마이메뉴\t2. 수강신청\t3. 공지사항");
		System.out.println(" 4. 수강후기 \t5. 로그아웃\t0. 종료");
		System.out.println("===========================================");
		System.out.print("> ");
		int input = ScanUtil.nextInt();
		
		switch(input){
		case 1:	return View.MYMENU;
		case 2: return View.SIGNCLASS;
		case 3: return View.STUNC;
		case 4: return View.STURV;
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
	
	
	//선생님 메소드!
	
	public int lecService() {
		int view = View.LECMAIN;
		while(true){
			switch(view){
			case View.LECMAIN : view = lecServiceList(); break;
			case View.LECNC: view = lecNc.noticeLecturer(); break;
			case View.LECRV: view = lecRv.reviewLecturer(); break;
			case View.HOME: view = new Controller().start(); break;
			case View.LECNOW: view = lecSg.signClassLec(); break;
			}
		}
	}
	
	public int lecServiceList() {
		System.out.println("=========================================================");
		System.out.println(" 1. 수강후기\t2. 수강현황\t3. 공지사항\t0. 종료");
		System.out.println("=========================================================");
		System.out.print(">");
		
		int input = ScanUtil.nextInt();
		
		switch(input){
		case 1:	return View.LECRV;
		case 2: return View.LECNOW;
		case 3: return View.LECNC;
		case 0: 
			System.out.println("종료합니다.");
			System.exit(0); //걍종료됨
		default :
			System.out.println("잘못 입력하였습니다.");
			break; //리턴 값 없으니까 밑에 있는 리턴 실행
		}
		return View.LECMAIN;
	}
	
}
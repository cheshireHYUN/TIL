package totalclass.controller;

import totalclass.join.JoinService;
import totalclass.login.LoginService;
import totalclass.service.MainService;
import totalclass.util.ScanUtil;
import totalclass.util.View;

public class Controller {

	public static void main(String[] args) {
		new Controller().start();
	}
	
	// 가입, 로그인, 메인창의 getInstance 즉 인스턴스 객체 만듦 (가운데만 대문자)
	private JoinService joinService = JoinService.getInstance();
	private LoginService loginService = LoginService.getInstance();
	private MainService mainService = MainService.getInstance();
	
	// start니까 맨처음, 즉 홈화면 띄우기
	public int start() {
		int view =View.HOME; //int형 변수 view니까 = 0
		
		while(true){
			switch(view){
			//0
			case View.HOME: view = home(); break; //0이 들어오면 home();메소드가 view 변수에 들어오고 View.HOME 리턴 >> HOME 실행
			//1
			case View.LOGIN:view = loginService.login(); break; // 만들어둔 각 인스턴스들의 메소드 실행 즉 로그인서비스의 로그인메소드
			// case 2 : view = joinService(가운데가 대문자니까 인스턴스).join(); break;
			case View.JOIN: view = joinService.join(); break;
			//3
			case View.MAIN: view = mainService.service0(); break;
			}
		}
	}



	private int home() {
		System.out.println("[DDIOT ADU에 오신것을 환영합니다.]");
		System.out.println("1.로그인 \t 2.회원가입 \t 0.프로그램 종료");
		System.out.print("원하시는 서비스의 번호를 입력해주세요 > ");
		int input =ScanUtil.nextInt();
		
		switch(input){
		case 1: return View.LOGIN; // 아마도 위의 while문에서 View.어쩌구에대한 케이스를 만들었으니... return View.어쩌구 하면 그 메소드가 로드되는구나!!!!!!!!!!!!!!!!!!
		case 2: return View.JOIN;
		case 0: 
			System.out.println("이용해주셔서 감사합니다.");
			System.exit(0);
		default:
			System.out.println("다시 입력해주세요");
			break;
		}
		return View.HOME;
	}

}

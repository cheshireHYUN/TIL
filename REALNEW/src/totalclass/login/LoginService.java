package totalclass.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import totalclass.join.StudentDAO;
import totalclass.service.MainService;
import totalclass.util.ScanUtil;
import totalclass.util.View;

public class LoginService {
	private LoginService(){}
	private static LoginService instance;
	public static LoginService getInstance(){
		if(instance == null){
			instance = new LoginService();
		}
		return instance;
}
	private StudentDAO studentDao =StudentDAO.getInstance();
	
	public int login() {
		System.out.println("====================[로그인]====================");
		System.out.println("1.개인회원"+"     "+"2.관리자\t0.뒤로가기");
		System.out.print("로그인 하고자 하는 서비스의 번호를 입력해주세요 > ");
		int input =ScanUtil.nextInt();
		
		switch(input){
		case 1: loginstudent(); // 회원가입시 메소드 실행후 VIEW.MAIN을 리턴
			return View.MAIN;
		case 2: loginlecturer();
			return View.MAIN;
		case 0: break;
		default:
			System.out.println("다시 입력해주세요");
			login(); // 본 메소드임
			break;
		}
		return View.HOME;
	}
	
	public int loginstudent() {
		System.out.print("아이디> ");
		String stuId = ScanUtil.nextLine();
		System.out.print("비밀번호> ");
		String stuPw = ScanUtil.nextLine();
		// id와 pw를 각각 변수에 저장
		
		Map<String, Object> user = studentDao.selectUser(stuId, stuPw); // 빈공간 user만들어서 studentDao의 selectUser 대입되어있음 (실제 테이블)
		
		if(user == null){
			System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
		}else{
			System.out.println("로그인 성공");
			MainService.login = user;
			System.out.println(MainService.login.get("STU_NAME")+"님(학생) 어서오세요");
			return View.MAIN;
			}		
		return login();
	}
	
	public int loginlecturer() {
		System.out.print("아이디>");
		String lecId = ScanUtil.nextLine();
		System.out.print("비밀번호>");
		String password = ScanUtil.nextLine();

		Map<String, Object> user = studentDao.selectMan(lecId, password);

		if (user == null) {
			System.out.println("아이디 혹은 비밀번호를 잘못 입력하셨습니다.");
		} else {
			MainService.login = user;
			System.out.println("=============================================");
			System.out.println(MainService.login.get("LEC_NAME")+"님 어서오세요\n");
			return View.MAIN;
		}
		return login();
	}
	
}
	




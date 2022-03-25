package totalclass.join;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

import totalclass.util.ScanUtil;
import totalclass.util.View;


public class JoinService {
	private JoinService(){}//생성자
	private static JoinService instance;//변수생성
	public static JoinService getInstance(){ //getInstance():같은객체를 참조하는 메소드
		if(instance == null){
			instance = new JoinService();
		}
		return instance;
	}
	// JoinService 클래스에서는 static을 이용해 어디서나 접근 가능한 변수와 메소드를 만들었다
	// 이때 만든변수이름이 instance, 메소드는 getInstance()라는, 같은객체를 참조하도록 하는 함수로
	// 만약 instance라는 static변수가 null이면 instance에 새로운 JoinService(), 
	// 즉 본문의 객체를 만들어 할당한후 리턴해준다
	
	private StudentDAO studentDao = StudentDAO.getInstance();
	// studentDao라는 변수에 StudentDAO클래스의 getInstance() 메소드를 할당(?)
	
	public int join() {
		System.out.println("====================회원가입===================");
		System.out.println("회원가입을 환영합니다");
		System.out.println("1.학생회원가입\t 2.강사회원가입");
		System.out.println("번호를 입력해주세요>");
		int input =ScanUtil.nextInt();
		
		switch(input){
		case 1: joinstudent(); 
			break;
		default:
			System.out.println("다시 입력해주세요");
			break;
		}
		return View.HOME; 
	}
	
	private void joinstudent() {
		System.out.println("학생회원 가입을 선택하셨습니다.");
		System.out.println("상세정보 입력해주세요.");
		System.out.print("아이디>");
		String stuId = ScanUtil.nextLine();
		System.out.print("비밀번호>");
		String stuPw = ScanUtil.nextLine();
		System.out.print("이름>");
		String stuName = ScanUtil.nextLine();
		System.out.print("생년월일>...ex)2021-02-20");
		String stuBir = ScanUtil.nextLine();
		System.out.print("연락처>");
		String stuTel = ScanUtil.nextLine();
		System.out.print("주소>");
		String stuAdd = ScanUtil.nextLine();
		System.out.print("성적>");
		String stuGrade = ScanUtil.nextLine();
		
		
		Map<Object,Object> map = new HashMap<>();
		map.put("STU_ID", stuId);
		map.put("STU_PW", stuPw);
		map.put("STU_NAME", stuName);
		map.put("STU_BIR", stuBir);
		map.put("STU_TEL", stuTel);
		map.put("STU_ADD", stuAdd);
		map.put("STU_GRADE", stuGrade);
		
		int result = studentDao.insertUser(map);
		
		if(0<result){
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
	}

}

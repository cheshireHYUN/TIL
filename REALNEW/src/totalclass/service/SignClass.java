package totalclass.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import totalclass.dao.OtherDAO;
import totalclass.dao.SignClassDao;
import totalclass.join.StudentDAO;
import totalclass.util.ScanUtil;
import totalclass.util.View;

public class SignClass {
	private static SignClass instance;
	public static SignClass getInstance(){
		if(instance == null){
			instance = new SignClass();
		}
		return instance;
	}
	
	private SignClassDao signClassDao = SignClassDao.getInstance();
	private StudentDAO studentDao =StudentDAO.getInstance();
	
	public int signClass(){
		System.out.println("==========================================");
		System.out.println("1. 수강신청 \t 2.수강현황 \t 3.이전으로");
		System.out.print("입력> ");
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			signClassData();
			break;
		case 2:
			signClassNow();
			return signClass();
		case 3 :
			break;
		default:
			System.out.println("다시 입력해주세요");
			break;
		}
		return View.MAIN;
		
	}
	
	
	private void signClassData(){
		
		//카운트를 만들어보자
		System.out.println("\n수강신청을 선택하셨습니다\n");
		
		int result2 = SignClassDao.updateSubCnt();
		if (0 < result2) {
		} else {
			System.out.print("\n[업데이트가 필요한 시간표입니다]\n");
		}
		
		List<Map<String, Object>> stuClasslist = SignClassDao.stuClasslist();
		// 수강시간표에 들어갈 칼럼들을 가져와 stuClasslist에 저장한것
		System.out.println("-----------------------[시간표]-----------------------");
		System.out.println("수강번호\t학년\t과목명\t선생님\t신청인원/정원");
		System.out.println("----------------------------------------------------");
			
		for (Map<String,Object> CLASS : stuClasslist) {
			System.out.println(CLASS.get("TAKECLASS_ID") + "\t"
					+ CLASS.get("SUB_GRADE") + "\t"
					+ CLASS.get("SUB_NAME") + "\t"
					+ CLASS.get("LEC_NAME") + "\t   "
					+ CLASS.get("SUBSCRIBER")+"/"+CLASS.get("TAKECLASS_LIMIT") + "\t"
					);
		}
		System.out.println("------------------------------------------------------");
		
		
	
	// 업데이트제로는 수정된 정보까지 가져올수있도록 쿼리 다시시도 한번 한거고,
	// 원래 로그인했던 정보를 가진 login에서id를 겟, 그걸 매개변수로 update0를 통해 수정정보 가져오고
	// 그걸 login에 넣어둔거 즉 수정될거 다 수정된 정보를 담은 객체!
	MainService.login = signClassDao.update0((String) MainService.login.get("STU_ID"));
	
	
	// loginclass 변수에 userclassInfo라는 COMPELETECLASS의 모든 정보 가져오는 메소드 실행,
	// 이때 매개변수로 stu_id가 들어가야 하는데 위에서 수정완료한 값을들 가진 객체에서 아이디 획득
	MainService.loginclass = studentDao.userClassInfo((String) MainService.login.get("STU_ID"));
	
	// 이제 여기 스튜던트 아이디와 takeclass_id 들어가있음
	
	// 해쉬맵에 학생코드와 수강코드 넣고
	Map<String, Object> signClassData = new HashMap<>();
	String[] keyname = {"학생코드","수강코드"};
	String[] key = {"STU_ID","TAKECLASS_ID"};
	
	signClassData.put(key[0],MainService.loginclass.get(key[0]));
	
	for (int i = 1; i <2  ; i++) {
		
		System.out.println("수강중인 "+keyname[i] + " : "+ MainService.loginclass.get(key[i]));			
		System.out.println("\n1.수업변경 \t2.변경하지 않음");
		
		
		int input = ScanUtil.nextInt();
		switch (input) {
		case 1:
			System.out.print("변경하고싶은 수업의 수강코드를 입력하세요 > ");
			String input2 = ScanUtil.nextLine();
			signClassData.put(key[i], input2);
			break;
		case 2:
			signClassData.put(key[i], MainService.loginclass.get(key[i]));
			break;
		default:
			System.out.println("다시 입력해주세요");
			break;
		}
	}
	
	
	
	int result = signClassDao.update(signClassData);
	
	if (0 < result) {
		System.out.println("\n[신청 완료]");
		
		
		int result3 = SignClassDao.updateSubCnt();
		if (0 < result3) {
			//System.out.println("\n[변경된 시간표 업데이트 완료]\n");
		} else {
			System.out.println("\n[업데이트 실패]\n");
		}
		System.out.println("====================[수강신청]===================");

	} else {
		System.out.println("\n[신청 실패]\n");
	}
}


private void signClassNow() {
	String[] keyname = {"학생코드","수강중인 수업"};
	String[] key = {"STU_ID","TAKECLASS_ID"};
	MainService.loginclass = studentDao.userClassInfo((String) MainService.login.get("STU_ID"));
	System.out.println("");
	System.out.println("             [ 내 수강현황 ]            ");
	System.out.println(" ____________________________________");
	for (int i = 1; i < 2; i++) {
		System.out.print("|\t     "+keyname[i] + " : ");
		if(MainService.loginclass.get(key[i])==null){System.out.println("비어있음\t     |");}
		else {System.out.println(MainService.loginclass.get(key[i])+"\t     |");}			
	}
	System.out.println(" ------------------------------------");
}



//------------------------------------------------------------------------------

// 관리자 수강신청 권한 - 완

public int signClassLec () {
   if (((BigDecimal) MainService.login.get("AUTH")).intValue() == 2) {
      lecSignClass();
      return lecSignClass();
   } else {
      System.out.println("권한이 없습니다.");
   }
   return View.MAIN;
}

public int lecSignClass() {
   System.out.println("=================================================");
   System.out.println("1. 수강신청현황 \t 2.뒤로가기");
   System.out.print("입력>");
   int input = ScanUtil.nextInt();
   switch (input) {
   case 1:
      lecSignClassData();
      break;
   case 2:
      break;
   default:
      System.out.println("다시 입력해주세요");
      break;
   }
   return View.LECMAIN;

}

// 강사 수강신청현황
private void lecSignClassData() {
   List<Map<String, Object>> lecClasslist = SignClassDao.lecClasslist();
   
   System.out.println("\n수강신청현황을 선택하셨습니다");
   System.out.println("====================[수강신청현황]===================");
   System.out.println("수강코드\t개설과목\t학년\t강사명\t신청인원/정원");
   System.out.println("--------------------------------------------------");
   for (Map<String,Object> CLASS : lecClasslist) {
      System.out.println(CLASS.get("TAKECLASS_ID") + "\t"
            + CLASS.get("SUB_NAME") + "\t"
            + CLASS.get("SUB_GRADE") + "\t"
            + CLASS.get("LEC_NAME") + "\t"
            + CLASS.get("SUBSCRIBER")+ "/" + CLASS.get("TAKECLASS_LIMIT"));
   }
}
   




}
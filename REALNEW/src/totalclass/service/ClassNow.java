package totalclass.service;

import totalclass.util.View;

public class ClassNow {
	
	private static ClassNow instance;
	public static ClassNow getInstance(){
		if(instance == null){
			instance = new ClassNow();
		}
		return instance;
	}	

	// 곧바로 실행되는 메소드
	public int classNow() {
			lecClassNow();
			return View.LECMAIN;
	}
	
	private void lecClassNow(){
		System.out.println("수강신청 현황입니다");
	}
		
}

package totalclass.service;

import totalclass.dao.StudentMenuDao;

public class NoticeData {
	private NoticeData(){}//생성자
	private static NoticeData instance;//변수생성
	public static NoticeData getInstance(){
		if(instance == null){
			instance = new NoticeData();
		}
		return instance;
}
	private StudentMenuDao studentMenuDao = StudentMenuDao.getInstance();
}

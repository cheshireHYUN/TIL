package totalclass.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import totalclass.service.MainService;
import totalclass.util.JDBCUtil;

public class NoticeDataDao {
	private NoticeDataDao(){}
	private static NoticeDataDao instance;
	public static NoticeDataDao getInstance(){
		if(instance == null){
			instance = new NoticeDataDao();
		}
		return instance;
	}
	
	private JDBCUtil jdbc = JDBCUtil.getInstance();
	
	
	
	public int update(Map<String, Object> noticedata) {
		String sql = " update NOTICE set TAKECLASS_ID=?,NOTICE_NUM=?,NOTICE_TITLE=?,NOTICE_CONTENT=? where TAKECLASS_ID = ? ";
		List<Object> p = new ArrayList<>();
		String[] key = {"TAKECLASS_ID","NOTICE_NUM","NOTICE_TITLE","NOTICE_CONTENT"};
		for (int i = 0; i < key.length; i++) {
			p.add(noticedata.get(key[i]));
		}
			p.add(noticedata.get("TAKECLASS_ID"));
			
		return jdbc.update(sql, p);
	}	
	
	
	
	
}

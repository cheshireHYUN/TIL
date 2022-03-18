package totalclass.join;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import totalclass.util.JDBCUtil;

public class NoticeDAO {
	private static NoticeDAO instance;
	public static NoticeDAO getInstance() {
		if(instance == null) {
			instance = new NoticeDAO();
		}
		return instance;
	}
	
	
	private JDBCUtil jdbc = JDBCUtil.getInstance(); 
	
	public int insertNotice(Map<Object, Object> map) {
		//입력받은 map을 ?에 뿌려준다. 그럼 입력받은 map이 각 칼럼에 저장된다 (이름을 지어줬네!)
		String sql = " insert into Notice (TAKECLASS_ID,NOTICE_NUM,NOTICE_TITLE,NOTICE_CONTENT)"
				+ "values (?,?,?,?)";
		
		// map변수안에 지어준 이름을 이용해 값을 꺼내와서 p라는 배열리스트에 저장한다. p에는 그럼 값들만 저장됨 
		List<Object> p = new ArrayList<>();
		p.add(map.get("TAKECLASS_ID"));
		p.add(map.get("NOTICE_NUM"));
		p.add(map.get("NOTICE_TITLE"));
		p.add(map.get("NOTICE_CONTENT"));
		return jdbc.update(sql,p);
	}
	
	
	// studentDao의 selectUser 메소드는 다음과 같다. 
	public Map<String, Object> selectNotice(String takeclassId, String noticeNum) {        // Map타입의 selectUser메소드, 매개변수는 입력받은 아이디와 비번
	String sql = "select * from Notice where TAKECLASS_ID = ? and NOTICE_NUM = ?";      // String타입 sql 변수에 입력받은 아이디와 패스워드값에 걸맞는 정보가 있는지 찾는 쿼리작성
	List<Object> map = new ArrayList<>();                                      // 새로운 리스트타입 map변수에 new 배열리스트 객체 참조시킴
	map.add(takeclassId);															   // map에 입력받은 아이디와 패스워드 입력
	map.add(noticeNum);

	return jdbc.selectOne(sql,map);											   // jdbc(jdbc 유틸의 인스턴스)의 selectOne메소드리턴, id와pw를 쿼리하여 테이블의 모든 칼럼을 저장한 sql변수와, id와pw만 저장한 map을 매개변수로준다
	}

}

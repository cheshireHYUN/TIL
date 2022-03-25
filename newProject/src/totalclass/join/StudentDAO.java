package totalclass.join;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import totalclass.util.JDBCUtil;

public class StudentDAO {
	private static StudentDAO instance;
	public static StudentDAO getInstance() {
		if(instance == null) {
			instance = new StudentDAO();
		}
		return instance;
	} // JoinService에 할당하는 메소드로, instance변수가 비면 새로운 StudentDAO를(본문) 할당함
	
	
	private JDBCUtil jdbc = JDBCUtil.getInstance();
	// 대충 오라클 연결해서 해쉬맵형태를 리턴받는거
	
	public int insertUser(Map<Object, Object> map) {
		String sql = " insert into STUDENT (STU_ID,STU_PW,STU_NAME,STU_BIR,STU_TEL,STU_ADD,STU_GPA)"
				+ "values (?,?,?,?,?,?,?)";
		
		List<Object> p = new ArrayList<>();
		p.add(map.get("STU_ID")); 
		p.add(map.get("STU_PW"));
		p.add(map.get("STU_NAME"));
		p.add(map.get("STU_BIR"));
		p.add(map.get("STU_TEL"));
		p.add(map.get("STU_ADD"));
		p.add(map.get("STU_GRADE"));
		return jdbc.update(sql,p);
	}
	//// 쿼리문 sql변수에 저장, p라는 리스트의 맵에 값을 넣어서 JDBCUtil변수인 jdbc에 쿼리문과 값을 업데이트. 
	
	public Map<String, Object> selectUser(String stuId, String stuPw) {
		String sql = "select * from STUDENT where stu_id = ? and stu_pw = ?"; 
		List<Object> map = new ArrayList<>();
		map.add(stuId);
		map.add(stuPw);
		
		return jdbc.selectOne(sql,map);
	}
	
	// String stuId, String stuPw 를 매개값으로 갖는 맵dptj 

}

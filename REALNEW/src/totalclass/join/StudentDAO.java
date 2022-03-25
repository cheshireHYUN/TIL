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
	}
	
	private JDBCUtil jdbc = JDBCUtil.getInstance(); // JDBCUtil의 인스턴스는 jdbc이다
	
	public int insertUser(Map<Object, Object> map) {
		//입력받은 map을 ?에 뿌려준다. 그럼 입력받은 map이 각 칼럼에 저장된다 (이름을 지어줬네!)
		String sql = " insert into STUDENT (STU_ID,STU_PW,STU_NAME,STU_BIR,STU_TEL,STU_ADD,STU_GPA,AUTH)"
				+ "values (?,?,?,?,?,?,?,?)";
		
		// map변수안에 지어준 이름을 이용해 값을 꺼내와서 p라는 배열리스트에 저장한다. p에는 그럼 값들만 저장됨 
		List<Object> p = new ArrayList<>();
		p.add(map.get("STU_ID"));
		p.add(map.get("STU_PW"));
		p.add(map.get("STU_NAME"));
		p.add(map.get("STU_BIR"));
		p.add(map.get("STU_TEL"));
		p.add(map.get("STU_ADD"));
		p.add(map.get("STU_GRADE"));
		p.add(map.get("AUTH"));
		return jdbc.update(sql,p);
	}
	
	
	 //studentDao의 selectUser 메소드는 다음과 같다. 
	public Map<String, Object> userInfo(String stuId) {        // Map타입의 selectUser메소드, 매개변수는 입력받은 아이디와 비번
		String sql = "select * from STUDENT where stu_id = ?";      // String타입 sql 변수에 입력받은 아이디와 패스워드값에 걸맞는 정보가 있는지 찾는 쿼리작성
		List<Object> map = new ArrayList<>();                                      // 새로운 리스트타입 map변수에 new 배열리스트 객체 참조시킴
		map.add(stuId);															   // map에 입력받은 아이디와 패스워드 입력
		
		return jdbc.selectOne(sql,map);											   // jdbc(jdbc 유틸의 인스턴스)의 selectOne메소드리턴, id와pw를 쿼리하여 테이블의 모든 칼럼을 저장한 sql변수와, id와pw만 저장한 map을 매개변수로준다
	}
	

	
	public int orientation(String stuId) {        // Map타입의 selectUser메소드, 매개변수는 입력받은 아이디와 비번
		String sql = "insert into COMPLETECLASS "
				+ "VALUES ('OT', ?) ";      // String타입 sql 변수에 입력받은 아이디와 패스워드값에 걸맞는 정보가 있는지 찾는 쿼리작성
		List<Object> map = new ArrayList<>();                                      // 새로운 리스트타입 map변수에 new 배열리스트 객체 참조시킴
		map.add(stuId);															   // map에 입력받은 아이디와 패스워드 입력
		
		return jdbc.update(sql,map);											   // jdbc(jdbc 유틸의 인스턴스)의 selectOne메소드리턴, id와pw를 쿼리하여 테이블의 모든 칼럼을 저장한 sql변수와, id와pw만 저장한 map을 매개변수로준다
	}
	
	
	
	// 사용자의 수업정보
	public Map<String, Object> userClassInfo(String stuId) {        // Map타입의 selectUser메소드, 매개변수는 입력받은 아이디와 비번
		String sql = "select * from COMPLETECLASS where stu_id = ?";      // String타입 sql 변수에 입력받은 아이디와 패스워드값에 걸맞는 정보가 있는지 찾는 쿼리작성
		List<Object> map = new ArrayList<>();                                      // 새로운 리스트타입 map변수에 new 배열리스트 객체 참조시킴
		map.add(stuId);															   // map에 입력받은 아이디와 패스워드 입력
		
		return jdbc.selectOne(sql,map);											   // jdbc(jdbc 유틸의 인스턴스)의 selectOne메소드리턴, id와pw를 쿼리하여 테이블의 모든 칼럼을 저장한 sql변수와, id와pw만 저장한 map을 매개변수로준다
	}
	

	
	
	// studentDao의 selectUser 메소드는 다음과 같다. 
	public Map<String, Object> selectUser(String stuId, String stuPw) {        // Map타입의 selectUser메소드, 매개변수는 입력받은 아이디와 비번
	String sql = "select * from STUDENT where stu_id = ? and stu_pw = ?";      // String타입 sql 변수에 입력받은 아이디와 패스워드값에 걸맞는 정보가 있는지 찾는 쿼리작성
	List<Object> map = new ArrayList<>();                                      // 새로운 리스트타입 map변수에 new 배열리스트 객체 참조시킴
	map.add(stuId);															   // map에 입력받은 아이디와 패스워드 입력
	map.add(stuPw);

	return jdbc.selectOne(sql,map);											   // jdbc(jdbc 유틸의 인스턴스)의 selectOne메소드리턴, id와pw를 쿼리하여 테이블의 모든 칼럼을 저장한 sql변수와, id와pw만 저장한 map을 매개변수로준다
	}

	
	
	public Map<String, Object> selectMan(String lecId, String password) {
		String sql = "select * from LECTURER where lec_id = ? and lec_pw = ?"; 
		List<Object> map = new ArrayList<>();
		map.add(lecId);
		map.add(password);
		
		return jdbc.selectOne(sql,map);
	}
	
	// DB연결 > 쿼리 실행 > ?값 입력 > rs에서 값 추출 > List<Map<String, Object>> 형태로 리턴 이런 비슷한일 하는거같은데..

}

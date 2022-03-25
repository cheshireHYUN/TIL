package totalclass.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import totalclass.util.JDBCUtil;

public class SignClassDao {
	
	private static SignClassDao instance;
	public static SignClassDao getInstance() {
		if(instance == null) {
			instance = new SignClassDao();
		}
		return instance;
	}
	
	private static JDBCUtil jdbc = JDBCUtil.getInstance(); // JDBCUtil의 인스턴스는 jdbc이다
	
	
	
	
	public Map<String, Object> update0(String stuId) {        // Map타입의 selectUser메소드, 매개변수는 입력받은 아이디와 비번
		String sql = "select * from STUDENT where stu_id = ?";      // String타입 sql 변수에 입력받은 아이디와 패스워드값에 걸맞는 정보가 있는지 찾는 쿼리작성
		List<Object> map = new ArrayList<>();                                      // 새로운 리스트타입 map변수에 new 배열리스트 객체 참조시킴
		map.add(stuId);															   // map에 입력받은 아이디와 패스워드 입력
		return jdbc.selectOne(sql,map);											   // jdbc(jdbc 유틸의 인스턴스)의 selectOne메소드리턴, id와pw를 쿼리하여 테이블의 모든 칼럼을 저장한 sql변수와, id와pw만 저장한 map을 매개변수로준다
	}
	
	
	

	
	
	
	
// 입력받은 해쉬맵값을 데베에 넣어준다
//	public int update(Map<String, Object> signClassData) {
//		String sql = "update STUDENT set TAKECLASS_ID = ?, TAKECLASS_ID2 = ?, TAKECLASS_ID3 = ? "
//				+ " where STU_ID = ?";
//		
//		List<Object> p = new ArrayList<>();
//		// 순섣대로 써줘야됨
//		p.add(signClassData.get("TAKECLASS_ID1"));
//		p.add(signClassData.get("TAKECLASS_ID2"));
//		p.add(signClassData.get("TAKECLASS_ID3"));
//		p.add(signClassData.get("STU_ID"));
//		return jdbc.update(sql, p);
//	}
	
	
	
	
	
	
	
	// 인서트가 아니라 업데이트를 해줘야해.......
//	public int insert(Map<String, Object> signClassData) {
//		String sql = "INSERT INTO COMPLETECLASS(STU_ID, TAKECLASS_ID) VALUES (?, ?)";
//		
//		List<Object> p = new ArrayList<>();
//		// 순섣대로 써줘야됨
//		p.add(signClassData.get("STU_ID"));
//		p.add(signClassData.get("TAKECLASS_ID"));
//		return jdbc.update(sql, p);
//	}
	
	public int update(Map<String, Object> signClassData) {
		// 학생코드와 수강코드가 짝지어 들어오면
		String sql = "UPDATE COMPLETECLASS "
				+ "SET TAKECLASS_ID = ? "
				+ "WHERE STU_ID = ? ";
		
		List<Object> p = new ArrayList<>();
		// 순섣대로 써줘야됨
		p.add(signClassData.get("TAKECLASS_ID"));
		p.add(signClassData.get("STU_ID"));
		return jdbc.update(sql, p);
	}
	
	
	
	
	// 수강 시간표 안내
	public static List<Map<String, Object>> stuClasslist() {
		String sql = "SELECT A.TAKECLASS_ID, B.SUB_GRADE, B.SUB_NAME, C.LEC_NAME, A.SUBSCRIBER, A.TAKECLASS_LIMIT "
				+ "FROM TAKECLASS A, SUBJECT B, LECTURER C "
				+ "WHERE SUBSTR(A.TAKECLASS_ID,3) = C.LEC_ID AND C.LEC_ID=B.LEC_ID "
				+ "ORDER BY B.SUB_GRADE ASC ";

		return jdbc.selectList(sql);
	}
	

	
	public static int updateSubCnt() {
		String sql = "UPDATE "
				+ "TAKECLASS A "
				+ "SET "
				+ "A.SUBSCRIBER = ( "
				+ "SELECT "
				+ "COUNT(DISTINCT STU_ID) AS STU_COUNT "
				+ "FROM "
				+ "COMPLETECLASS "
				+ "WHERE "
				+ "A.TAKECLASS_ID = TAKECLASS_ID "
				+ "GROUP BY "
				+ "TAKECLASS_ID "
				+ ")";
		
		return jdbc.update(sql);
	}
	
	
	
	
	
	public Map<String, Object> selectSignClass(String takeclassId) {        // Map타입의 selectUser메소드, 매개변수는 입력받은 아이디와 비번
	String sql = "select * from TAKECLASS where TAKECLASS_ID";      // String타입 sql 변수에 입력받은 아이디와 패스워드값에 걸맞는 정보가 있는지 찾는 쿼리작성
	List<Object> map = new ArrayList<>();                                      // 새로운 리스트타입 map변수에 new 배열리스트 객체 참조시킴
	map.add(takeclassId);															   // map에 입력받은 아이디와 패스워드 입력

	return jdbc.selectOne(sql,map);											   // jdbc(jdbc 유틸의 인스턴스)의 selectOne메소드리턴, id와pw를 쿼리하여 테이블의 모든 칼럼을 저장한 sql변수와, id와pw만 저장한 map을 매개변수로준다
	}
	
	
	
	// ------------------------------------------------------------------------------------   
	   
    // 강사) 수강신청현황
    public static List<Map<String, Object>> lecClasslist() {
       String sql = "SELECT A.TAKECLASS_ID, B.SUB_NAME, B.SUB_GRADE, C.LEC_NAME, A.SUBSCRIBER, A.TAKECLASS_LIMIT "
             + "FROM TAKECLASS A, SUBJECT B, LECTURER C "
             + "WHERE SUBSTR(A.TAKECLASS_ID,3) = C.LEC_ID AND C.LEC_ID=B.LEC_ID "
             + "ORDER BY B.SUB_GRADE ASC ";
       return jdbc.selectList(sql);
    }
    
    public Map<String, Object> selectLecSignClass(String takeclassId) {        // Map타입의 selectUser메소드, 매개변수는 입력받은 아이디와 비번
    String sql = "select * from TAKECLASS where TAKECLASS_ID";      // String타입 sql 변수에 입력받은 아이디와 패스워드값에 걸맞는 정보가 있는지 찾는 쿼리작성
    List<Object> map = new ArrayList<>();                                      // 새로운 리스트타입 map변수에 new 배열리스트 객체 참조시킴
    map.add(takeclassId);                                                // map에 입력받은 아이디와 패스워드 입력

    return jdbc.selectOne(sql,map);                                    // jdbc(jdbc 유틸의 인스턴스)의 selectOne메소드리턴, id와pw를 쿼리하여 테이블의 모든 칼럼을 저장한 sql변수와, id와pw만 저장한 map을 매개변수로준다
    }
    
    public static List<Map<String, Object>> lecSignClassData() {
       // TODO Auto-generated method stub
       return null;
    }










	




	
	

}

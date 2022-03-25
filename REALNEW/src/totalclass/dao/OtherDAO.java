package totalclass.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import totalclass.util.JDBCUtil;

public class OtherDAO {

	private static OtherDAO instance;

	public static OtherDAO getInstance() {
		if (instance == null)
			instance = new OtherDAO();
		return instance;
	}

	private static totalclass.util.JDBCUtil jdbc = totalclass.util.JDBCUtil.getInstance();

	// 학생 수강후기 리스트 - 완
	public static List<Map<String, Object>> rvStudentList() {
		String sql ="SELECT RV_NUM, SUB_NAME, RV_TITLE, STU_ID, RV_DATE "
				+ "FROM REVIEW "
				+ "ORDER BY RV_NUM ASC ";
		return jdbc.selectList(sql);
	}

	// 학생 수강후기 게시글 조회 - 완
	public static List<Map<String, Object>> selectRvStudent(Map<String, Object> map) {
		String sql ="SELECT RV_NUM, SUB_NAME, LEC_NAME, RV_TITLE, RV_CONTENT, RV_SCORE, STU_ID, RV_DATE "
				+ "FROM REVIEW "
				+ "WHERE RV_NUM =?";
			
		List<Object> p = new ArrayList<>();
		p.add(map.get("RV_NUM"));

		return jdbc.selectList(sql, p);
	}

	// 학생 수강후기 게시글 수정 - 완
	public static int updateRvStudent(Map<String, Object> map) {
		String sql = "UPDATE REVIEW SET SUB_NAME = ?, LEC_NAME = ?, RV_TITLE = ?, RV_CONTENT = ?, RV_SCORE = ?, RV_DATE = SYSDATE "
				+ "WHERE RV_NUM = ?";

		List<Object> p = new ArrayList<>();

		p.add(map.get("SUB_NAME"));
		p.add(map.get("LEC_NAME"));
		p.add(map.get("RV_TITLE"));
		p.add(map.get("RV_CONTENT"));
		p.add(map.get("RV_SCORE"));
		p.add(map.get("RV_NUM"));
		return jdbc.update(sql, p);
	}

	// 학생 수강후기 게시글 삭제 - 완
	public static int deleteRvStudent(Map<String, Object> map) {
		String sql = "DELETE FROM REVIEW " 
				+ "WHERE RV_NUM = ?";

		List<Object> p = new ArrayList<>();
		p.add(map.get("RV_NUM"));
		return jdbc.update(sql, p);
	}

	// 학생 수강후기 게시글 등록 - 완
	public static int insertStudentRv(Map<String, Object> map) {
		String sql = "INSERT INTO REVIEW (RV_NUM, SUB_NAME, LEC_NAME, RV_TITLE, RV_CONTENT, RV_SCORE, STU_ID, RV_DATE) "
				+ "VALUES ((SELECT MAX(RV_NUM) FROM REVIEW)+1, ?, ?, ?, ?, ?, ?, ?)";
//		+ "VALUES (SEQ_REVIEW.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";

		List<Object> p = new ArrayList<>();
		p.add(map.get("SUB_NAME"));
		p.add(map.get("LEC_NAME"));
		p.add(map.get("RV_TITLE"));
		p.add(map.get("RV_CONTENT"));
		p.add(map.get("RV_SCORE"));
		p.add(map.get("STU_ID"));
		p.add(map.get("RV_DATE"));

		return jdbc.update(sql, p);
	}
	
	// ------------------------------------------------------------------------------------

	// 관리자 수강후기 리스트 - 완
		public static List<Map<String, Object>> rvLecturerList() {
			String sql ="SELECT RV_NUM, SUB_NAME, RV_TITLE, STU_ID, RV_DATE "
					+ "FROM REVIEW "
					+ "ORDER BY RV_NUM ASC ";
			return jdbc.selectList(sql);
		}

		// 관리자 수강후기 게시글 조회 - 완
		public static List<Map<String, Object>> selectRvLecturer(Map<String, Object> map) {
			String sql ="SELECT RV_NUM, SUB_NAME, LEC_NAME, RV_TITLE, RV_CONTENT, RV_SCORE, STU_ID, RV_DATE "
					+ "FROM REVIEW "
					+ "WHERE RV_NUM =?";
				
			List<Object> p = new ArrayList<>();
			p.add(map.get("RV_NUM"));

			return jdbc.selectList(sql, p);
		}

		// 관리자 수강후기 게시글 삭제 - 완
		public static int deleteRvLecturer(Map<String, Object> map) {
			String sql = "DELETE FROM REVIEW " 
					+ "WHERE RV_NUM = ?";

			List<Object> p = new ArrayList<>();
			p.add(map.get("RV_NUM"));
			return jdbc.update(sql, p);
		}

// ------------------------------------------------------------------------------------
	// 관리자 공지사항 리스트 - 완
	public static List<Map<String, Object>> ncLecturerList() {
		String sql = "SELECT NC_NUM, NC_TITLE, NC_CONTENT, LEC_ID, NC_DATE "
				+ "FROM NOTICE " 
				+ "ORDER BY NC_NUM ASC ";

		return jdbc.selectList(sql);
	}

	// 관리자 공지사항 조회 - 완
	public static List<Map<String, Object>> selectNcLecturer(Map<String, Object> map) {

		String sql = "SELECT NC_NUM, NC_TITLE, NC_CONTENT, LEC_ID, NC_DATE "
				+ "FROM NOTICE " 
				+ "WHERE NC_NUM =?";

		List<Object> p = new ArrayList<>();
		p.add(map.get("NC_NUM"));

		return jdbc.selectList(sql, p);
	}
	
	// 관리자 공지사항 수정 - 완
		public static int updateNcLecturer(Map<String, Object> map) {
			String sql = "UPDATE NOTICE SET NC_TITLE = ?, NC_CONTENT = ?, NC_DATE = SYSDATE "
					+ "WHERE NC_NUM = ?";

			List<Object> p = new ArrayList<>();

			p.add(map.get("NC_TITLE"));
			p.add(map.get("NC_CONTENT"));
			p.add(map.get("NC_NUM"));
			return jdbc.update(sql, p);
		}

		// 관리자 공지사항 삭제 - 완
		public static int deleteNvLecturer(Map<String, Object> map) {
			String sql = "DELETE FROM NOTICE " 
					+ "WHERE NC_NUM = ?";

			List<Object> p = new ArrayList<>();
			p.add(map.get("NC_NUM"));
			return jdbc.update(sql, p);
		}

	
	// 관리자 공지사항 등록 - 완
	public static int insertLecturerNc(Map<String, Object> map) {
		String sql = "INSERT INTO NOTICE (NC_NUM, NC_TITLE, NC_CONTENT, LEC_ID, NC_DATE) "
				+ "VALUES ((SELECT MAX(RV_NUM) FROM REVIEW)+1, ?, ?, ?, ?)";

		List<Object> p = new ArrayList<>();
		p.add(map.get("NC_TITLE"));
		p.add(map.get("NC_CONTENT"));
		p.add(map.get("LEC_ID"));
		p.add(map.get("NC_DATE"));
		return jdbc.update(sql, p);
	}
	
// ------------------------------------------------------------------------------------		
	
	// 학생 공지사항 리스트 - 완
			public static List<Map<String, Object>> ncStudentList() {
				String sql ="SELECT NC_NUM, NC_TITLE, LEC_ID, NC_DATE "
						+ "FROM NOTICE "
						+ "ORDER BY NC_NUM ASC ";
				return jdbc.selectList(sql);
			}

	// 학생 공지사항 조회 - 완
			public static List<Map<String, Object>> selectNcStudent(Map<String, Object> map) {
				String sql ="SELECT NC_NUM, NC_TITLE, NC_CONTENT, LEC_ID, NC_DATE "
						+ "FROM NOTICE "
						+ "WHERE NC_NUM =?";
					
				List<Object> p = new ArrayList<>();
				p.add(map.get("NC_NUM"));

				return jdbc.selectList(sql, p);
			}

	// 학생 공지사항 삭제 - 완
			public static int deleteNcStudent(Map<String, Object> map) {
				String sql = "DELETE FROM NOTICE " 
						+ "WHERE NC_NUM = ?";

				List<Object> p = new ArrayList<>();
				p.add(map.get("NC_NUM"));
				return jdbc.update(sql, p);
			}

}	
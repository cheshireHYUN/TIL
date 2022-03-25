package JdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JDBCProgramming {
	public static void main(String[] args) throws Exception{

		new OracleDriver();

		// 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//드라이버를 통해 DB접속
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CSH99", "java");

		// 쿼리문 작성객체 생성(쿼리 작성할 워크시트 생성)
		Statement statement = connection.createStatement();

		// 쿼리문 작성
		String sql = "select mem_id, mem_name, mem_hp, mem_mail from member";

		// 쿼리문 실행후 결과받기
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			
			System.out.printf("%s \t %s \t %s \t %s\n", memId, memName, memHp, memMail);		
		}

		// 자원반납
		resultSet.close();	
		statement.close();
		connection.close();

	}
}

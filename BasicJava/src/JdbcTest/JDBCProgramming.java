package JdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class JDBCProgramming {
	public static void main(String[] args) throws Exception{

		new OracleDriver();

		// ����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//����̹��� ���� DB����
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "CSH99", "java");

		// ������ �ۼ���ü ����(���� �ۼ��� ��ũ��Ʈ ����)
		Statement statement = connection.createStatement();

		// ������ �ۼ�
		String sql = "select mem_id, mem_name, mem_hp, mem_mail from member";

		// ������ ������ ����ޱ�
		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			
			System.out.printf("%s \t %s \t %s \t %s\n", memId, memName, memHp, memMail);		
		}

		// �ڿ��ݳ�
		resultSet.close();	
		statement.close();
		connection.close();

	}
}

package test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 클래스가 자기 자신을 부르는 방식. 클래스가 자신을 불러 오라클 영역을 만든다. 10번째 줄이 있어 try영역은 오라클 영역이 된다 (= public class Oracle{})
			// Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ssoso", "sweet93");
			// conn을 DriverManager 드라이버(하드) 매니저에 Connection 연결한다.
			
			// String sql = "SELECT * FROM TAB";
			// Statement stmt = conn.createStatement();
			// 연결한 conn에 문장을 받을 stmt Statement(오라클에 맞는 양식)를 만든다.
			
			ResultSet rs = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ssoso", "sweet93")
					.createStatement().
					executeQuery("SELECT * FROM TAB");
			
			//ResultSet rs = stmt.executeQuery(sql);
			// stmt에 쿼리문인 spl을 받아 executeQuery를 통해 쿼리를 실행한 뒤 rs 에 담는다. List는 느리므로 Set을 사용하여
			// ResultSet타입을 쓴다. 분류는 값을 담아 온 뒤에 한다.
			
			List<String> list = new ArrayList<>();
			while(rs.next()) {
				list.add(rs.getString("TNAME"));
			}
			System.out.println(list);
			
		} catch (SQLException e) {
			System.out.println("ERROR");
			e.printStackTrace();
		}
		// try{}를 실행하다 에러가 발생하면 catch{}를 실행하고 다음 명령문을 실행한다.
		// try-catch를 사용하지 않으면 에러 발생 즉시 시스템 종료.
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
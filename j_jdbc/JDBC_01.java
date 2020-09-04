package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_01 {
	public static void main(String[] args) {
		Connection comn = null; // 연결
		Statement stmt = null; // 질의
		ResultSet rs = null; // 결과
		
		try {
			// 1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2 접속
			String url = "jdbc:oracle:thin:@localhost:1521/XE";
			String id = "pc";
			String pw = "java";

			comn = DriverManager.getConnection(url, id, pw);
			// 3.질의 및 결과실행
			stmt= comn.createStatement();
			String mem_id = "USER_ID";
			String sql = " SELECT * "
					   + " FROM  ARTUSER ";
//				   	   + " WHERE USER_ID='"+mem_id+"'";
			
			rs =  stmt.executeQuery(sql);//select 하는것
			
			while(rs.next()){
				String mem_name = rs.getString("user_id");
//				String mem_name = rs.getString("MEM_NAME");
				System.out.println(mem_name);
			}
			

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 하지 못하였습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("접속을 실패하였습니다.");
		} finally{
			try {
				if(rs != null){
					rs.close();
				}
				if(stmt != null){
					stmt.close();
				}
				if(comn != null){
					comn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

	}

}

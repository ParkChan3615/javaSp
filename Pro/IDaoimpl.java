package Pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class IDaoimpl implements IDao {

	@Override
	public String logIn(Map<String, String> params) {
		
		String mem_id = params.get("mem_id");
		String mem_pass = params.get("mem_pass");
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		String logIn_ID = null;
		try {
			// 1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2 접속
			String url = "jdbc:oracle:thin:@localhost:1521/XE";
			String id = "pc";
			String pw = "java";
			

			conn = DriverManager.getConnection(url, id, pw);
			// 3.질의 및 결과실행
			st= conn.createStatement();
		
			String sql = "SELECT MEM_ID "
					   + "FROM  MEMBER "
				   	   + "WHERE MEM_ID ='"+mem_id
				   	   + "'AND MEM_PASS ='"+mem_pass+"'";
			rs = st.executeQuery(sql);
			while(rs.next()){
				logIn_ID = rs.getString("MEM_ID");
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
				if(st != null){
					st.close();
				}
				if(conn != null){
					conn.close();
				}
			
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("반환 실패");
			}
		
		}
		return logIn_ID;
	}

}

package Pro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Map;

public class IDaoimpl implements IDao {

	public boolean confimId(String id){
		boolean result = false;

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521/XE";
			String Sid = "artpro";
			String pw = "java";
			conn = DriverManager.getConnection(url, Sid, pw);
			st = conn.createStatement();
			String sql = "SELECT MEM_ID FROM MEMBER WHERE MEM_ID = ?";
			rs = st.executeQuery(sql);
			if(rs.next()){
				result = true;
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("반환 실패");
			}

		}
		
		return result;
		
	}
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
			String id = "artpro";
			String pw = "java";

			conn = DriverManager.getConnection(url, id, pw);
			// 3.질의 및 결과실행
			st = conn.createStatement();

			String sql = "SELECT MEM_ID " + "FROM  MEMBER " + "WHERE MEM_ID ='"
					+ mem_id + "'AND MEM_PW ='" + mem_pass + "'";
			rs = st.executeQuery(sql);
			while (rs.next()) {
				logIn_ID = rs.getString("MEM_ID");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 하지 못하였습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("접속을 실패하였습니다.");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("반환 실패");
			}

		}
		return logIn_ID;
	}





	@Override
	public String join(MemberVO mb) {
		String mem_id =mb.getMem_id();
		String mem_pw =mb.getMem_pw();
		String mem_name=mb.getMem_name();
		String mem_birth=mb.getMem_birth();
		String mem_address=mb.getMem_address();
		String mem_address_num=mb.getMem_address_num();
		String mem_carnum=mb.getMem_carnum();
		String mem_parking=mb.getMem_parking();
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		String logIn_ID = null;
		try {
			// 1.드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 2 접속
			String url = "jdbc:oracle:thin:@localhost:1521/XE";
			String id = "artpro";
			String pw = "java";

			conn = DriverManager.getConnection(url, id, pw);
			// 3.질의 및 결과실행
			st = conn.createStatement();

			
			String sql =" INSERT INTO MEMBER(MEM_ID,MEM_PW,MEM_NAME,MEM_BIRTH,MEM_ADDRESS,MEM_ADDRESS_NUM,MEM_CARNUM) "
					 +" VALUES ('"+mem_id+"','"+mem_pw+"','"+mem_name+"','"+mem_birth+"','"+mem_address+"','"+mem_address_num+"','"+mem_carnum+"')";
		
			st.executeUpdate(sql);
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 하지 못하였습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("접속을 실패하였습니다.");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (st != null) {
					st.close();
				}
				if (conn != null) {
					conn.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("반환 실패");
			}

		}
		return mem_name;
	}
	@Override
	public String revise(Map<String, String> params) {
		
		return null;
	}

}

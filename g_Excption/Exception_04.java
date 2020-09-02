package g_Excption;

import java.sql.SQLException;

public class Exception_04 {
	public static void main(String[] args) {
		Controller.idCheck();
	}

}

class Controller{
	static void idCheck(){
		Service.idCheck();
	}
}
class Service{
	static void idCheck(){
		try {
			Dao.idCheck();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}

class Dao{
	static void idCheck() throws SQLException{
		
		SQLException e1 = new SQLException("ORA-0001: unique constraint violated");
			throw e1;
	}
}
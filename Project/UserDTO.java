package Project;

public class UserDTO {

	static String id;
	static String pw;
	static String gname;
	static String email;
	static int phonenumber;
	static String tear;
	
	public UserDTO (String id,String pw,String gname,String email,int phonenumber,String tear){
		
	}

	public static String getId() {
		return id;
	}

	public static void setId(String id) {
		UserDTO.id = id;
	}

	public static String getPw() {
		return pw;
	}

	public static void setPw(String pw) {
		UserDTO.pw = pw;
	}

	public static String getGname() {
		return gname;
	}

	public static void setGname(String gname) {
		UserDTO.gname = gname;
	}

	public static String getEmail() {
		return email;
	}

	public static void setEmail(String email) {
		UserDTO.email = email;
	}

	public static int getPhonenumber() {
		return phonenumber;
	}

	public static void setPhonenumber(int phonenumber) {
		UserDTO.phonenumber = phonenumber;
	}

	public static String getTear() {
		return tear;
	}

	public static void setTear(String tear) {
		UserDTO.tear = tear;
	}
	@Override
	public String toString(){
		return "ID:"+id+"PW"+pw+"Gname"+gname+"Email"+email+"TP"+phonenumber+"Tear"+tear;
	}

}

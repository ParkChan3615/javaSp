package Project;


public class UserDTO {

	static String id;
	static String pw;
	static String gname;
	static String email;
	static String phonenumber;
	

	public UserDTO (String id,String pw,String gname,String email, String phonenumber){
		this.id = id;
		this.pw = pw;
		this.gname = gname;
		this.email = email;
		this.phonenumber = phonenumber;
		
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

	public static String getPhonenumber() {
		return phonenumber;
	}

	public static void setPhonenumber(String phonenumber) {
		UserDTO.phonenumber = phonenumber;
	}


	@Override
	public String toString(){
		return "ID:"+id+"PW"+pw+"Gname"+gname+"Email"+email+"TP"+phonenumber;
	}

}

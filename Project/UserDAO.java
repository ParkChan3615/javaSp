package Project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserDAO {
	Scanner sc = new Scanner(System.in);
	List<UserDTO> user = new ArrayList<>();
//	
//	static String id;
//	static String pw;
//	static String gname;
//	static String email;
//	static int phonenumber;
	public UserDAO(){
		
		user.add(new UserDTO("Master", "123", "gname", "yco1234@naver.com", "010-5316-5120"));
		

	}
	
	private void  SelectUser(){
		Iterator<UserDTO> lte = user.iterator();
		
		while(lte.hasNext()){
			System.out.println(lte.next()+" ");
		}
	}
	private boolean idCheak(String id){
		boolean cheak = true;
		UserDTO user = FindById(id);
		if(user == null){
			cheak = false;
		}	
		return cheak;
	}
	
	
	private UserDTO FindById(String id) {
		return null;
	}
}


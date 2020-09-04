package Pro;

import java.security.PrivateKey;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ViewClass {

	
	private IServise service = new IServiceImpl();
	private String login_id ;

	void startMethod() {
		System.out.println("=========================================");
		System.out.println("=          아파트관리  프로그램                        =");
		System.out.println("=========================================");

		System.out.println("1.로그인 \t 2.회원가입\t 3.끝내기");
		
		// 고르기
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
 		//메서드 이동
		switch (input) {
		case 1:
			//회원가입
			LogIn();
		
			break;
		case 2:
			//로그인
			createMember();
			break;
		case 3:
			//종류
			break;

		default:
			
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
		
		
	}

	private void LogIn() {
		//id.pw 
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String mem_id = sc.next();
		System.out.println("비밀번호를 입력해주세요");
		String mem_pass = sc.next();
		Map<String,String> parms = new HashMap<>();
		parms.put("mem_id",mem_id );
		parms.put("mem_pass",mem_pass );
		
		login_id = service.lonIn(parms);
		//로그아웃 null넣어야한다.
		
		if(login_id == null){
			System.out.println("회원정보가 없습니다.");
			
			
		}else{
			System.out.println(login_id+"회원님 어서오세요");
			showMemList();
		}
		
		
	}

	private void showMemList() {
		
	}

	private void createMember() {
		
	}

}



package Pro;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ViewClass {

	private IServise service = new IServiceImpl();
	private String login_id;
	private String login_join;



	void startMethod() {
		System.out.println("=========================================");
		System.out.println("=          아파트관리  프로그램                        =");
		System.out.println("=========================================");

		System.out.println("1.로그인 \t 2.회원가입\t 3.끝내기");

		// 고르기
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		// 메서드 이동
		switch (input) {
		case 1:
			
			LogIn();

			break;
		case 2:
			
			createMember();
			break;
		case 3:
			// 종류
			break;

		default:

			System.out.println("잘못 입력하셨습니다.");
			break;
		}

	}

	

	private void showMemList() {

	}

	private void createMember() {
		MemberVO mb = new MemberVO();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String mem_id = sc.nextLine();
		
		
		System.out.println("비밀번호를 입력해주세요");
		String mem_pw = sc.nextLine();

		System.out.println("거주자 이름을 입력해주세요");
		System.out.println("/형식 한글만 입력 가능합니다.(2~3자)");
		String mem_name = sc.next();

		System.out.println("생년월일 입력해주세요\n 형식 :950618(숫자만 가능)");
		String mem_birth = sc.next();

		System.out.println("동입력해주세요 (숫자만 가능)");
		String mem_address = sc.next();

		System.out.println("호수입력해주세요(숫자만 가능)");
		String mem_address_num = sc.next();

		System.out.println("차량 번호 입력 해주세요 \n 없을시 미입력");
		String mem_carnum = sc.next();
		
	
		mb.setMem_id(mem_id);
		mb.setMem_pw(mem_pw);
		mb.setMem_name(mem_name);
		mb.setMem_birth(mem_birth);
		mb.setMem_address(mem_address);
		mb.setMem_address_num(mem_address_num);
		mb.setMem_carnum(mem_carnum);
		login_join =service.join(mb);
		System.out.println(mem_name+"환영합니다.");

	}
	
	private void LogIn() {
		// id.pw
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String mem_id = sc.next();
		if(mem_id == null){
			System.out.println("비밀번호를 입력해주세요");
			String mem_pass = sc.next();
			Map<String, String> parms = new HashMap<>();
			parms.put("mem_id", mem_id);
			parms.put("mem_pass", mem_pass);
		
		

		login_id = service.lonIn(parms);
		}
		// 로그아웃 null넣어야한다.

		if (login_id == null) {
			System.out.println("회원정보가 없습니다.");

		} else {
			System.out.println(mem_id+ "회원님 어서오세요");
			showMemList();
		}

	}
	
	//수정
		private void reviseMember(String mem_id, String mem_pass){
			Scanner sc =new Scanner(System.in);
			System.out.println("수정 사항을 입력해 주세요.");
			String mem_revise = sc.nextLine();
			Map<String,String> params = new HashMap<>();
			params.put("mem_id",mem_id );
			params.put("mem_pass",mem_pass );
			params.put("mem_revise",mem_revise );
			String login_id = service.revise(params);
			LogIn();
		}
		
	public boolean idCheck(String id){
		boolean check = true;
		IDaoimpl is = new IDaoimpl();
		if(is.confimId(id)){
			System.out.println("중복");
		}
		return check;
		
	}

}

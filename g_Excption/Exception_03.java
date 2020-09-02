package g_Excption;

public class Exception_03 {
	public static void main(String[] args) {
		Exception e1 = new Exception("해피밀 오류야");

		try {
			throw e1;
		} catch (Exception e) {
			System.out.println("해피밀 먹으면 미니언즈 3개 이므로 오류 발생 해요");
			e.printStackTrace();
			System.out.println(e.getMessage());

//			if (e.getMessage() == "해피밀 오류야") {
//				System.out.println("오류 해결 법은 다른 메뉴를 선택하세요");
//			}
//
		}

		RuntimeException e2 = new RuntimeException();
		try{
			throw e2;
		}catch(RuntimeException e){
//			System.out.println("런타임오류");
			e.printStackTrace();
		}
		
		/*
		  컨트롤러 - 서비스  - 다오 (데이터 베이스 주고 받고)
		  컴파일러가 예외처리를 강제하지 않는 경우
		 - RuntimeException과 그 자손들
		 - Error
		 이 두가지를' unChecked예외'라고 부른다.
		 
		 */
		
		

	}
	
}

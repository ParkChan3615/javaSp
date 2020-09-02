package y_project;

import java.util.Scanner;

import javax.print.attribute.standard.Severity;

public class View {

	public void startMethod() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어서오세요 하이마트입니다.");
		System.out.println("원하시는 메뉴를 선택해주세요.");
		System.out.println("1. 물품추가");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");
		
		int selcety =sc.nextInt();
		
		switch (selcety) {
		case 1:
			addProudct();
			break;
		case 2:
			logIn();
			break;

		case 3:
			System.out.println("잘못 입력하였습니다.");
			System.exit(0);
			break;
			
			
		default:
			break;
		}
	}

	private void logIn() {
	
		
	}

	private void addProudct() {
		//이름, 가격
		Scanner sc = new Scanner(System.in);
		System.out.println(" 물건의 이름을 입력해주세요.");
		String name = sc.next();
		System.out.println(" 물건의 가격을 설정해주세요.");
		int price = sc.nextInt();
		
		Service sv = new Service();
		boolean result = sv.addProuct(name,price);
		if (result){
			System.out.println("물품등록을 성공하였습니다.");
		}
		
		
	}

	

}

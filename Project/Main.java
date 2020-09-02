package Project;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		mainview();
		int chois = sc.nextInt();
		switch (chois) {
		case 1:

			break;

		case 2:

			break;
		default:
			System.out.println("숫자를 잘못 입력하셨습니다.");
			break;
		}

	}

	static void mainview() {
		System.out.println("=========================================");
		System.out.println("=          Over watch 전적 검색                    =");
		System.out.println("=========================================");

		System.out.println("1.로그인 \t 2.회원가입");
		
		return;

	}
}

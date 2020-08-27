package f_OOP2;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class DeckTest {
	public static void main(String[] args) {

		// 9. 카드 한 벌의 객체를 생성
		Deck d = new Deck();
		// 10.0번 index의 카드 한 장을 뽑기
		Card cd = d.pick(0);
		System.out.println("0번째 카드" + cd);
		// 11.임의의 index카드 한장 을 뽑기
		Card random = d.ppick();
		System.out.println("임의의 index번째 카드 " + random);
		// 12.카드를 자동 섞기
		d.shuffle();
		// 13.0번 index의 카드 한 장을 뽑기
		Card cd2 = d.pick(0);
		System.out.println("0번째 카드 " + cd2);
		// 14.카드 1000번 섞기
		d.shuffle(1000);
		// 15.0번 index의 카드 한 장을 뽑기
		System.out.println("1000번 섞은 카드의 dex" + Arrays.toString(d.c));
		Card cd3 = d.pick(0);
		System.out.println(cd3);
		// Scanner sc = new Scanner(System.in);
		// System.out.println("0~51중 하나를 뽑아주세요");
		// int c = sc.nextInt();
		// System.out.println(d.pick(c));

	}
}

class Card {

	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;

	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEART = 3;
	static final int CLOVER = 4;

	static int width = 100;
	static int height = 250;

	int kind;
	int number;

	Card(int kind, int number) {

		this.kind = kind;
		this.number = number;

	}

	Card() {
		this(SPADE, 1);
	}

	@Override
	public String toString() {

		String kind = "";
		String number = "";

		switch (this.kind) {
		case 1:
			kind = " SPADE";
			break;

		case 2:
			kind = " DIAMOND";
			break;

		case 3:
			kind = " HEART";
			break;

		default:
			kind = " CLOVER";
			break;
		}

		switch (this.number) {
		case 1:
			number = "Ace";
			break;

		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default:
			number += this.number;
			break;

		}

		return kind + "," + number;
	}
}

class Deck {
	// 1.
	static final int CARD_NUM = Card.NUM_MAX * Card.KIND_MAX;
	// 2
	Card[] c = new Card[CARD_NUM];

	// 3
	Deck() {
		for (int k = 0; k < Card.KIND_MAX; k++) {

			for (int j = 0; j < Card.NUM_MAX; j++) {

				c[(k * 13) + j] = new Card(k + 1, j + 1);
			}
		}
	}

	// 5 사용자로부터 입력 받은 index 번째 카드 한장을 반환하는 메서드 pick
	// c에서 임의의 index 번째 카드 한 장을 반환하는 메서드 (PICK)를 작성하여라
	Card pick(int c) {
		// Scanner sc = new Scanner(System.in);
		// int a = sc.nextInt();
		Card pick = this.c[c];

		return pick;
	}

	// 메서드 이름 pick c의 방중에 임의의 index번째 카드 한장을 반환하는 메서드
	// 단. 4번에서 만든 pick메서드를 활용해주세요.

	Card ppick() {
		int random = (int) (Math.random() * CARD_NUM);
		Card a = pick(random);
		return a;
	}

	// 6. 사용자로부터 입력 받은 index번째 카드 한 장을 반환 하는 메서드
	// pick를 작성하여라
	// 단. 입력받은 값이 0~51사이의 정수라면 입력 받은 index번째 카드 한 장을
	// 반환하고
	// 그렇지 않은 경우에는 "랜덤번호"를 출력하고 임의의 한 장을 반환하도록 하여라.

	Card pick1(int c) {

		if (c > 51) {
			return pick(c);
		} else {
			Card pick = this.c[c];
			return pick;
		}

	}

	// 7.c의 카드를 섞는 메서드(shuffle)을 작성하여라. - 자동섞기
	void shuffle() {

		for (int i = 0; i < CARD_NUM; i++) {
			int a = (int) (Math.random() * c.length);
			Card shuffle = c[i];
			c[i] = c[a];
			c[a] = shuffle;

		}

	}

	// 8. 사용자로부터 입력 받은 횟수만큼 c의 카드를 섞는 메서드 (Shuffle)을 작성하여라
	// 단. 임의의 방 두개를 뽑아 두개의 index 번째 요소의 위치를 바꾼다.
	// 이른 사용자로 부터 입력받은 횟수만큼 반복한다.
	void shuffle(int a) {

		for (int s = 0; s < a; s++) {
			this.shuffle();
		}
	}

	void shuffle2(int cycle) {
		for (int i = 0; i < cycle; i++) {

			int random = (int) (Math.random() * CARD_NUM);
			int random2 = (int) (Math.random() * CARD_NUM);
			Card temp = c[random];
			c[random] = c[random2];
			c[random2] = temp;
		}
	}
}

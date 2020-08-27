package e_OOP;

public class TvTest {

	public static void main(String[] args) {

		System.out.println(Tv.color);
		Tv.color = "black";
		System.out.println(Tv.color);
		Tv.changeColor();
		System.out.println(Tv.color);

		Tv t = new Tv();// 인스턴스 화를 시키기 위하여 타입은 class의 값을 넣어줘야 한다.

		System.out.println(t.channel);
		
		t.channel = 15;//변수
		System.out.println(t.channel);
		
		t.channelUp();//메소드
		System.out.println(t.channel);
		
		
	}

}

class Tv {
	// 전역변수(맴버변수) -- 자동적으로 값을 기본값으로 넣어줌
	// 스택틱이 붙은 변수는 클래스 변수
	static String color;

	// 인스턴스변수
	int channel;
	int volume;

	// 클래스 메서드
	static void changeColor() {
		color = "yellow";
	}

	// 인스턴스 메서드
	void channelUp() {
		channel++;
	}

	void volumeUp() {
		volume++;
	}

}

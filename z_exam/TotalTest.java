package z_exam;

public class TotalTest {
	// 1.TotalTest가 호출되어 Metod area 로드 이때 클래스 메소드와 클래스 변수를 함께 같이 로드한다.
	// 클래스 변수로는 없고, 클래스 메서드가main()가 존재한다.
	public static void main(String[] args) {// call stek에 main() 메소드가 호출 됨

		TvMaker.color = "Blue";
		// TvMaker를 불러오기 때문에 Metod area 에 로드 됨 이때 클래스 메서드와 클래스 변수가 같이올라오게됨
		// 변수타입String 인 변수 color와, 변수타입 int인 inch가 변수 클래스 변수 이고, 클래스 메서드는 존재하지
		// 않기때문에 두가지만 로드 한다.
		// 클래스명. 참조변수 인 color를 "Blue"로 저장한다.
		TvMaker tm = new TvMaker();
		// 대입연산자가 있기때문에 왼쪽부터 확인하여 인스턴스가 진행된다.
		// 1.Tvmaker 안에있는 인스턴스 변수와 인스턴스 메서드를 찾는다.
		// 2.String타입의 변수 name = "" int타입의 변수 age TvMaker()인스턴스 메서드
		// TvMaker(String, int) 인스턴스 (매개변수)
		// 를 heap Area 에 로드 시킨다. 이때 tm의 주소 값안에 배치하여 준다.
		// main메서드 안에 tm의 변수를 선언해준다. 생성자 TvMaker메소드의 주소 값을 tm에게 대입해준다 이때 부호는
		// 가르키는 것을 하면된다.
		// 이것을 인스턴스화 한다고 한다.
		tm.age = 30;
		// 3. tm의 메서드를 호출 한다.
		// 3.1tm의 주소의 값 age의 값을 30으로 초기화 해준다.
		System.out.println(TvControll.channel);
		// 클래스를 호출 하였기 때문에 Metod Area에 TvControll 로드 시켜준다. 이때 클래스 변수와 클래스 메서드를
		// 함께 로드해준다.
		// 클래스 변수는 int타입의 변수 명인 MAX_CHANNEL 로드하여 50으로 초기화해준다.
		// int타입의 변수명 MIN_CHANNEL 로드하여 1로 초기화 해준다.
		// int타입의 변수명 channel을 15로 초기화 해준다.
		// 클래스 메소드인 int타입의 메소드명 volumeDown()을 같이 로드해 준다.
		// println의 메소드에 클래스명(TvControll) .클래스 변수 Channel를 main메서드 안에서 호출하게 되는데
		// Channel의 초기 값인 15가 Console에 출력하게 된다.

		TvControll.volumeDown();
		// 클래스명 TvControll를 호출하여 volumeDown 메소드를 Call stak안에 main() 위에 호출하여준다.
		// volumeDown()메서드가 실행 된다.
		// channel과 MAX_CHANNEL이같으면 channel 같게 MIN_CHANNEL 초기화 해주고
		// channel 과 MAX_CHANNEL다르면 channel을 1증가 한다.
		// 같지 않기 떄문에 channel을 1 증가 하여 15 에서 16으로 초기화한다.
		// 메서드 어레이에서 값이 다되었기때문에 퇴근해준다.

		System.out.println(TvControll.channel);
		// 다시 클래스를 호출 하였기 때문에 메서드 어레이에서 있는지 확인하고 클래스 변수 channel을 호출하여 출력하게 된다.
		// 이때 값은 channel 와MAX_CHANNEL 같지 않기때문에 1을 증가하여 channel 원이 16인 값을
		// Console창에 출력한다.

		// 3.2
		TvControll tc; // 클래스명을 호출하여 다시 메서드 어레이에서 확인한다. 클래스명 변수를 선언
		tc = new TvControll(); // 선언된 변수타입 tc가 메인 메서드에서 생성된다.
		// 인스턴스 변수와 인스턴스 클래스를 heap Area 로드해준다.
		// 인스턴스 변수인 int 변수명인 volume 을 99로 초기화 해준다.
		// 인스턴스 메서드 int volumeUp()을 함께 로드해준다.
		// tc의 주소가 main()안에 있는 tc 변수에게 대입 하여준다. (가르켜준다)
		// 이것을 인스턴스화 라고 한다.
		System.out.println(tc.volume);
		// 인스턴스화 된 참조변수 tc를 호출하여 tc 안에 있는volume 99를 consol창에 호출하여준다.
		tc.volumeUp();
		// 참조변수.volumeUp메서드를 메인 메서드안에서 호출하여 준다.
		// 만약 volume 와 MAX_VOLUME가 같으면 volume와 MIN_VOLUME 값을 같게 초기화 해준다
		//  이것이 아니라면 volume을 1증가 시켜준다.
		// volume을 반환하여 저장해준다. 이때 값은 같았기때문에 99를 저장하여준다.
		System.out.println(tc.volume);
		//참조변수 tc를 호출하여 주소안에 voiume을 출력한다.
		//이번에는 값이 같기떄문에 100이 출력된다.
		tc.volumeUp();
		//참조변수.인스턴스메서드 volumeUp 를 콜스텍에 호출하고 값을 확인하여 0을 반환하여 
		//다음 퇴근한다.
		System.out.println(tc.volume);
		// 참조변수 TC의volume을 콘솔에 출력한다.

		//
		Calc cc = new Calc();
		
		System.out.println(cc.add(Integer.MAX_VALUE, 4));
		System.out.println(cc.add(3L, Integer.MAX_VALUE));

	}
}

class TvMaker {
	// 1. 클래스명 TvMaker 생성
	// 1.1메소드 어레이에 클래스 변수 클래스메서드 로드
	static String color;//클래스변수 string 타입의 변수명 color 로드 이떄 초기값은 기본 값인 0;
	static int inch;//클래스 변수 int 타입의 inch 로드 이때 기본값인 0을 초기화

	String name = ""; 
	int age;

	// 2. 인스턴스 변수인 String 타입인 변수명 name 의 ""을 초기화
	// 2.1 인스턴스 변수인 int 타입의 age를 기본값인 0으로 초기화
	TvMaker() {
		this("man", 25);
	}//이떄 반환값이 없기때문에 void를 넣어줘야하지만 생략이가능하다./

	// 2.2 인스턴스 메서드 TvMaker는 매개변수인 name 과 age에 값을 각각 넣어준다.
	TvMaker(String name, int age) {
		this.name = name;
		this.age = age;
	}//이떄 반환값이 없기때문에 void를 넣어줘야하지만 생략이가능하다./
}
// 인스턴스 메서드TvMaker (타입 string과 int 인 매개변수를 넣어주고)
// 지역변수 name 을 초기화해준다.
// 지역변수 age를 age로 초기화해준다.
class TvControll {//클래스인 TvControll를 메서드 어레이에 로드해준다 이때도 동일하게 클래스변수와 클래스메서드를 같이 로드해준다.
	final int MAX_VOLUME = 100; // 상수인 int 타입 MAX_VOLUME 을 100으로 초기화
	final int MIN_VOLUME = 0;// 상수인 int 타입 MIN_VOLUME 을 100으로 초기화
	static final int MAX_CHANNEL = 50;// 클래스 변수 상수 변수타입 int MAX_CHANNEL 을 50으로 초기화
	static final int MIN_CHANNEL = 1;//  클래스 변수 상수 변수타입 int MIN_CHANNEL 을 1로 초기화

	static int channel = 15; // 클래스 변수  channel을 15로 초기화
	int volume = 99;// 인스턴스 타입 (지역변수) 인volume 을 99로 초기화 

	// 4. return문
	int volumeUp() {
		if (volume == MAX_VOLUME) {
			volume = MIN_VOLUME;
		} else {
			volume++;
		}

		return volume;// volume에 반환해준다. 이때 타입은 int이다.
	}

	static int volumeDown() {
		if (channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		} else {
			channel++;
		}
		return channel;// channel에 반환해준다. 이때 타입은 int이다.
	}
}
	
class Calc {
	// 5.
	int add(int a, int b) {
		return a + b;
	}

	long add(long a, int b) {
		return a + b;
	}

	int minus(int a, int b) {
		return a + b;
	}
}
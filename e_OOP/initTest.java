package e_OOP;

public class initTest {

	public static void main(String[] args) {

		Init init = new Init(30);

	}

}

class Init {
	static int action = 100;// 명시적 초기화

	int action2;// 명시적 초기화가 안일어진것

	Init(int action2) {

		this.action2 = action2;

	}
	static {
		action = 10;//명시적 초기화 -----> 초기화 블럭
	}
	
	{
		action2 = 70;
	}
	
	
	
	
}

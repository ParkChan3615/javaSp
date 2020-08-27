package sp_exam;


public class exam_3_3 {
	public static void main(String[] args) {
		//8. MethodTest클래스의 add01메서드를 호출 하여라.

		MethodTest.add01();
		int result = MethodTest.add02(120);
		System.out.println(result);
		//9. MethodTest클래스의 add02메서드를 호출 하여라.

		MethodTest mt = new MethodTest();
		int result3 = mt.add03(10);
		System.out.println(result3);
		//10. MethodTest클래스의 add03메서드를 호출 하여라.

		int result04 = mt.add04();
		System.out.println(result04);
		

	}

}

class MethodTest {
	

	


	//1. 클래스변수 a를 선언하고 10의 값으로 초기화 하여라.
	static int a = 10;

	//2. 클래스변수 b를 선언하고 20의 값으로 초기화 하여라.
	static int b = 20;
	//3. 인스턴스변수 c를 선언하고 50의 값으로 초기화 하여라.
	int c = 50;
	//4. 클래스변수 a와 b의 합을 출력하는 클래스메서드 add01를 구현 하여라.
	static void add01() {
		int result = a + b;
		
	}
	//5. 클래스변수 a, b, int 타입의 매개변수 c의 합을 반환하는 클래스메서드 add02를
	//  구현 하여라.
	static int add02(int c) {
		int result = c + a + b;
		return result;
	}
	//6. 인스턴스변수 c와 int 타입의 매개변수 c의 합을 반환하는 인스턴스메서드 add03를 
	//   구현 하여라.
	int add03(int c) {
		int result = c + this.c;
		return result;
	}
	//7. 인스턴스 변수 a에 값을 랜덤으로 넣어주고 c와 a를 합하여라.
	int add04() {
		int a = (int)(Math.random() * 101);
		int result = c + a;
		return result;
	}
}
package e_OOP;

public class MyMath {
	public static void main(String[] args) {
		// 12 . add1메서드 호출
		MathTest.add1();
		// 13 . add2메서드 호출
		MathTest math = new MathTest(); //math 는 참조변수 
		int add2 = math.add2();
		System.out.println(add2);
		// 14 . add3메서드 호출
		MathTest.add3(3, 5);//1호출 2매개변수 3반환
		// 15 . add4메서드 호출
		int add4 = math.add4(4, 123);
		System.out.println(add4);
		// 16 . add5메서드 호출
		long add5 = math.add5(12415125L, 3123);//참조변수명. 인스턴스매서드 
		System.out.println(add5);
		// 17 . add6메서드 호출
		long add6 = math.add6(12344, 123, 1111);
		System.out.println(add6);
		// 18 . add7메서드 호출
		String add7 = math.add7("chan");
		System.out.println(add7);

	}
}
 
class MathTest {
	// 1.클래스변수 a를 선언하고 10의 값으로 초기화하여라
	static int a = 10;
	// 2.클래스변수 b를 선언하고 20의 값으로 초기화하여라
	static int b = 20;
	// 3.인스턴스변수 c를 선언하고 30의 값으로 초기화하여라
	int c = 30;
	// 4.인스턴스변수d를 선언하고 40의 값으로 초기화하여라
	int d = 40;

	// 5.클래스메서드 add1, 클래스 변수 a,b의 합을 출력하는 메소드
	static void add1() {
		int result = a + b;
		System.out.println(result);
	}

	// 6.인스턴스메서드 add2, 인스턴스 변수 c,d의 합을 반환하는 메소드
	int add2() {
		int result = c + d;
		return result;
	}

	// 7.클래스메서드 add3, 매개변서 : int타입 두개, 메게변수의 합을 출력 하느 메서드
	static void add3(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
		
	}

	// 8. 인스턴스 메서드 add4, 매개변수 : int 타입 두개, 매개변수의 합을 반환하는 메서드
	int add4(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	// 9. 인스턴스메서드 add5 , 매개변수 : int 타입 하나 long 타입 하나 , 매개변수의 합을 반환하는 메서드
	long add5(long num1, int num2) {
		long result = num1 + num2;
		return result;
	}

	// 10. 인스턴스 메서드 add6, 매개 변수 :long타입 하나 int 타입 2개 ,매개변수의 합을 반환하는 메서드
	long add6(long num1, int num2, int num3) {
		long result = num1 + num2 + num3;
		return result;
	}

	// 11. 인스턴스 메서드 add7, 매개면서 : 문자열하나, 매개변수에 48~94중 임의의 값과 문자열의 합을 반환하는 메서드
	String add7(String sc) {
		int a = (int)(Math.random()*47+48);
		String result = sc + a;
		return result;
	}
}
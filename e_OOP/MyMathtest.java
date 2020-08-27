package e_OOP;

public class MyMathtest {
	public static void main(String[] args) {

		MethodTest.add01();
		int result = MethodTest.add02(120);
		System.out.println(result);
		
		MethodTest mt = new MethodTest();
		int result3 = mt.add03(10);
		System.out.println(result3);
		
		int result04 = mt.add04();
		System.out.println(result04);
		

	}

}

class MethodTest {

	static int a = 10;

	static int b = 20;
	int c = 50;

	static void add01() {
		int result = a + b;
		
	}
	
	static int add02(int c) {
		int result = c + a + b;
		return result;
	}

	int add03(int c) {
		int result = c + this.c;
		return result;
	}

	int add04() {
		int a = (int)(Math.random() * 101);
		int result = c + a;
		return result;
	}
}
package e_OOP;

public class RecursiveTest {

	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println(result);

	}
   // 클래스변수 facrotial메소드를 매개변수 하나를 받아 생성하시오
	
	static int factorial(int num) {
		//result를 선언하고 0으로 초기화하시오
		int result = 0;
		// num이 1이면 result 1을 저장하세요.
		//아니면 재귀호출을 하여 만드세요
		if (num == 1) {
			result = 1;
		} else {
			result = num * factorial(num - 1);
		}
		return result;
	}
}
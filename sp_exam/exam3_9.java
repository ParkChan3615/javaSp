package sp_exam;

public class exam3_9 {

	public static void main(String[] args) {

		DuibleDice throwDice = new DuibleDice();
		int result = throwDice.throwDice();

	}
}

class DuibleDice {
	// 인스턴스 메서드명 throwDice
	int result = 0;

	int throwDice() {
		// 1. 첫 번째 주사위를 1~6임의의 정수로 하여 저장하여라.
		// 2. 두 번째 주사위를 1~6임의의 정수로 하여 저장하여라.
		// 3. 두 주사위의 합을 변수 resyult에 저장하여라
		// 4. 만일 두자사위의 값이 같다면 주사위 두개를 한 번더 던지도록 하여라.
		// 5. 전체 주사위 값의 합을 반환하여라/
		int num1 = (int) (Math.random() * 6 + 1);
		int num2 = (int) (Math.random() * 6 + 1);
		if (num1 == num2) {
			System.out.println(num1 + "\n" + num2 + "\n Doble 다시 한번더");
			result += (num1 + num2);
			throwDice();
		} else {
			System.out.println(num1 + "\n" + num2);
			result += (num1 + num2);
			System.out.println(result);
		}
		return result;
	}

}

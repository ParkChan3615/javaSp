package z_exam;

public class exam_04 {

	public static void main(String[] args) {
		/*
		 * [5-1]다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하시오. ① int[] arr[]; ②
		 * int[] arr={1,2,3,};// 마지막에 쉼포는 상관없음 ③ int[] arr =new int[5]; ④ int[]
		 * arr = new int[5]{1,2,3,4,5};//[5]처럼 숫자를 넣으서 만들어주면안됨 {}의 데이터 갯수에 따라
		 * 자동결정 ⑤ int arr[5]; //배열을 선언하면서 크기를 지정할수 없음. ⑥ int arr[][] = new
		 * int[3][];
		 * 
		 * 정답 :4,5
		 */

		// }}
		/*
		 * [5-2]다음과 같은 배열이 있을 때, (1) arr[3].length의 값은 얼마인가? //0부터 시작해서 3은
		 * {30,30} 두개로값은 2이다.
		 * 
		 * (2) arr.length의 값은 얼마인가? //{}가 4개 이므로 값은 4
		 * (3)System.out.println(arr[4][1])의 출력 결과는 얼마인가?//오류 arr[4][];는 존제하지
		 * 않는다. arr[3][1];까지 존제 int[][] arr = { {5,5,5,5,5}, {10,10,10},
		 * {20,20,20,20}, {30,30} };
		 */
		/*
		 * [5-3]배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
		 */
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum = 0;

		/* (1) */
		for (int i = 0; i < arr.length; i++) { // arr에 인덱스를 1씩 증가
			sum += arr[i]; // 인덱스가 증가되면 값을 sum에 더해주면서 저장
		}
		System.out.println("Sum = " + sum); // sum 출력

		/*
		 * [5-4]2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		 */System.out.println();
		int[][] arr4 = { { 5, 8, 13, 5, 2 }, { 22, 13, 28 }, { 2, 18, 23, 62 } };
		int total = 0; // 합계를 저장하기 위한 변수
		float average = 0;// 평균을 저장하기 위한 변수
		int length = 0; // 평균을 구하기 위해 모든 인덱스의 갯수를 저장해줄 변수
		/* (1) */
		for (int i = 0; i < arr4.length; i++) {// i를 0부터 길이 -1 까지 1씩증가//길이={}의
												// 갯수
			for (int j = 0; j < arr4[i].length; j++) {// j를 0부터 각{}의 인덱스 만큼 +1씩
														// 증가
				total += arr4[i][j]; // 모든 배열의 값을 total에 저장

			}
			length += arr4[i].length; // 평균을 구하기 위해 각 {}의 인덱스 수를 length변수에 저장
		}
		average = ((int) ((float) total / length * 100 + 0.5)) / 100f; // 평균을
																		// 구해준다.

		System.out.println("total =" + total);
		System.out.println("Average =" + average);
		System.out.println();

		/*
		 * [5-5]거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 변수 money의 금액을 동전으로 바꾸었을 때
		 * 각각 몇 개의 동전이 필요한지 계산해서 출력하라. 단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다 (1)에 알맞은
		 * 코드를 넣어서 프로그램을 완성하시오.
		 */
		int[] coinUnit = { 500, 100, 50, 10 };
		int money = 2790;
		int m = 0;// 큰 동전부터 나눴을때 갯수(몫)을 저장할 변수
		/* (1) */
		for (int i = 0; i < coinUnit.length; i++) {
			m = money / coinUnit[i]; // 큰 동전부터 돈을 나누고 m에 저장
			money %= coinUnit[i];// 큰동전으로 나누고 남은 나머지를 다시 money에 저장
			System.out.print(coinUnit[i] + "원 의 갯수 :" + m + "  ");
		}
		System.out.println();
		System.out.println();
		/*
		 * [5-6]다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다. 임의의 값을 사용했기
		 * 때문에 실행결과와 다를 수 있다.
		 */
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] ball3 = new int[3];
		int n = 0;
		// ballArr의 index순서대로 index의 요소와 임의의 요소를 골라서 값을 바꾼다.
		for (int i = 0; i < ballArr.length; i++) {

			for (int j = 0; j < ballArr.length; j++) {
				if (ballArr[i] == ballArr[j]) {
//					ballArr[i] = 1;
//					int n = ballArr[i] * (int) (Math.random() * 9 + 1);
					for (int x = 0; x < ball3.length; x++) {
						System.out.println(ball3[x]);
					}
				}

			}
		}

		// [5-7] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 '*'을 찍어서 그래프를 그리는
		// 프로그램이다.
		int[] answer = { 1, 4, 3, 2, 1, 2, 3, 2, 1, 4 };
		int[] counter = new int[4];

		// answer의 요소들 중 1이면 counter의 0번방을 증가, 2이면 counter의 1번방을 증가
		// 3이면 counter의 2번방을 증가, 4이면 counter의 3번방을 증가.

		for (int i = 0; i < answer.length; i++) {
			counter[answer[i] - 1]++;
		}

		for (int i = 0; i < counter.length; i++) {
			System.out.print(counter[i]);
			for (int j = 0; j < counter[i]; j++) {
				System.out.print("*"); // 갯수만큼 *출력
			}
			System.out.println();
		}

		// [5-8] 문제 5-5에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다. 보유한
		// 동전의 개수로
		// 거스름돈을 지불할 수 없으면, '거스름돈이 부족합니다.'라고 출력하고 종료한다. 지불할 돈이 충분히 있으면, 거스름돈을
		// 지불한 만큼 가진
		// 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.

		if (args.length != 1) {
			System.out.println("한개의 숫자만 입력해 주세요.");
			System.exit(0);
		}
		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money1 = Integer.parseInt(args[0]);
		System.out.println("money=" + money1);
		int[] coinUnit1 = { 500, 100, 50, 10 }; // 동전의 단위
		int[] coin = { 5, 5, 5, 5 }; // 단위별 동전의 개수

		for (int i = 0; i < coinUnit1.length; i++) {
			int coinNum = 0;
			/*
			 * (1) 아래의 로직에 맞게 코드를 작성하시오. 1. 금액(money)을 동전단위로 나눠서 필요한 동전의
			 * 개수(coinNum)를 구한다.
			 * 
			 * 2. 배열 coin에서 coinNum만큼의 동전을 뺀다. (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만
			 * 뺀다.) 3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			 */
			coinNum = money / coinUnit[i];
			if (coin[i] >= coinNum) {
				coin[i] -= coinNum;
			} else {
				coinNum = coin[i];
				coin[i] = 0;
			}

			System.out.println(coinUnit1[i] + "원: " + coinNum);
		}

		if (money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
		}

		System.out.println("=남은 동전의 개수 =");
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원:" + coin[i]);
		}

		
	}

}

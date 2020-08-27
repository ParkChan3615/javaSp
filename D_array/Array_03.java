package D_array;

import java.util.Arrays;

public class Array_03 {

	public static void main(String[] args) {
		// 1.다차원배열
		// -자바에서는 1차원 배열뿐만 아니라 다차원 배열도 허용한다.
		// 2.이차원 배열의 선언

		// -변수타입 [][] 변수명 ; int[][]arr;
		// -변수타입 변수명 [][] ;
		// -변수타입[] 변수명 [] ;
		//
		// 3. 이차원 배열의 생성
		// -변수명 = new 변수타입 [크기1][크기2];

		// int[][] arr = new int[2][3];
		// // {
		// // {0,0,0,0},
		// // {0,0,0,0},
		// // {0,0,0,0}
		// // };
		// // System.out.println(arr.length);
		// // System.err.println(arr[0].length);
		// for (int j = 0; j < arr.length; j++) {
		// for (int i = 0; i < arr[j].length; i++) {
		// System.out.println(arr[j][i]);
		//
		// }
		// }
		//
		// int[][] arr2 = { { 10, 20, 30 }, { 40, 50, 60 } };
		//
		// System.out.println(Arrays.toString(arr2[0]));
		//
		// int[][] arr3 = new int[3][];
		// System.out.println(arr3[0]);
		{
			// null,
			// null,
			// null
		}

		// arr3[0] = new int[2];
		// {
		// // {0,0},
		// // null,
		// // null
		// }
		// arr3[1] = new int[3];
		// {
		// // {0,0},
		// // {0.0.0},
		// // null;
		// }
		//
		// arr3[2] = new int[4];
		// {
		// // {0,0},
		// // {0.0.0},
		// // {0.0.0.0}
		//
		// }

		

		// 3. 변수 names를 선언하고 주변친구 6명의 이름으로 초기화하여라.

		String[] names = { "전진원", "김성준", "김선준", "박 찬", "이선엽", "길영주" };

		// 4.subjects7을 만들고 국영수사과 오라클 자바

		String[] subjects7 = { "국어", "영어", "수학", "사회", "과학", "오라클", "자바" };

		// 1.6명의 7과목을 저장할 수 있는 배열 score를 선언 및 생성해주세요.
		// int [][] score = new int [6][7];
		// 2. score 각방을 0~100정사이의 임의의 정수의 값을 저장하여라.

		int[][] score = new int[names.length][subjects7.length];

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				score[i][j] = (int) (Math.random() * 101);// 다중배열 값 넣는법
			}
			System.out.println();
		}

		// 5. 사람별 합계 사
		int[] sub = new int[names.length];

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < subjects7.length; j++) {
				sub[i] += score[i][j];
			}
		}

		// 6. 사람별 평균 소숫 3번쨰 2번쨰 반올림
		float[] nano = new float[names.length];

		for (int i = 0; i < nano.length; i++) {
			nano[i] = (int) ((float) sub[i] / subjects7.length * 100 + 0.5) / 100f;
		}

		// 7. 과목별 합계
		int[] sjsub = new int[subjects7.length];

		for (int i = 0; i < subjects7.length; i++) {
			for (int j = 0; j < names.length; j++) {
				sjsub[i] += score[j][i];
			}
		}

		// 8. 과목별 평균

		float[] sjnano = new float[subjects7.length];

		for (int i = 0; i < subjects7.length; i++) {
			sjnano[i] = (int) ((float) sjsub[i] / names.length * 100 + 0.5) / 100f;
		}

		// 9. 사람별 석차를 구하세요.

		int[] rank = new int[names.length];

		for (int i = 0; i < names.length; i++) {
			rank[i]++;
			for (int j = 0; j < names.length; j++) {
				if (sub[j] > sub[i]) {
					rank[i]++;
				}
			}
		}

		// 0. 아래와 같이 출력해 주세요.
		for (int a = 0; a < subjects7.length; a++) {
			System.out.print("\t" + subjects7[a]);
		}

		System.out.print("\t" + "합계");
		System.out.print("\t" + "평균");
		System.out.print("\t" + "석차");
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(names[i] + "\t");

			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");

			}

			System.out.println(sub[i] + "\t" + nano[i] + "\t" + rank[i]);

		}
		System.out.print("합계");
		for (int i = 0; i < subjects7.length; i++) {
			System.out.print("\t" + sjsub[i]); 
		}
		System.out.println();
		System.out.print("평균");
		for (int i = 0; i < subjects7.length; i++) {
			System.out.print("\t" + sjnano[i]);
		}

		System.out.println();
		System.out
				.println("================================================= sort 후 ===================================================");
		for (int a = 0; a < subjects7.length; a++) {
			System.out.print("\t" + subjects7[a]);
		}

		System.out.print("\t" + "합계");
		System.out.print("\t" + "평균");
		System.out.print("\t" + "석차");
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print(names[i] + "\t");

			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");

			}

			System.out.println(sub[i] + "\t" + nano[i] + "\t" + rank[i]);

		}
		System.out.print("합계");
		for (int i = 0; i < subjects7.length; i++) {
			System.out.print("\t" + sjsub[i]);
		}
		System.out.println();
		System.out.print("평균");
		for (int i = 0; i < subjects7.length; i++) {
			System.out.print("\t" + sjnano[i]);
		}

	}

}

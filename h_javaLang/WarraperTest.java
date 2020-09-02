package h_javaLang;

import java.util.Arrays;

public class WarraperTest {
	public static void main(String[] args) {

		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1);
		System.out.println(i2);
		
		//warraper클래스는 모드 toString()이 오버라이딩 되어있다.
		
		System.out.println(i1 == i2 );
		System.out.println(i1.equals(i2));
		//warraper클래스는 모드 equals()이 오버라이딩 되어있다.
		
		Integer[] intArr = new Integer[3];
		intArr[0] = 5;
		intArr[1] = 10;
		intArr[2] = 40;
		//자동으로 오토박싱 되어 나온다.
		int b = intArr[0];//unboxing
		System.out.println(Arrays.toString(intArr));
	}
}

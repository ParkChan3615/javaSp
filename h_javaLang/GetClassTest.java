package h_javaLang;

import java.util.Arrays;

public class GetClassTest {
	public static void main(String[] args) throws ClassNotFoundException {

		// 1.클래스의 정보를 객체로부터 얻는방법
		Class re1 = new Person(23432L).getClass();
		System.out.println(re1.getName());// 클래스이름 출력
		System.out.println(re1.getSimpleName());
		System.out.println(re1.getCanonicalName());
		System.out.println(Arrays.toString(re1.getInterfaces()));

		// 2.클래스의 리터럴로 부터 얻는방법
		Class re2 = Person.class;
		System.out.println(re2.getName());// 클래스이름 출력
		System.out.println(re2.getSimpleName());
		System.out.println(re2.getCanonicalName());
		System.out.println(Arrays.toString(re1.getInterfaces()));
		
		// 3.클래스명으로 얻는 방법
		Class re3 = Class.forName("h_javaLang.Person");
		System.out.println(re2.getName());// 클래스이름 출력
		System.out.println(re2.getSimpleName());
		System.out.println(re2.getCanonicalName());
		System.out.println(Arrays.toString(re1.getInterfaces()));

	}

}

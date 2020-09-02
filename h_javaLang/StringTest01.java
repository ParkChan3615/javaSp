package h_javaLang;

public class StringTest01 {
	public static void main(String[] args) {
		String str1 = "abc";//<<리터럴 값
		String str2 = "abc";
		System.out.println(str1 == str2);// 문자를 가지가 있는 주소 비교
		System.out.println(str1.equals(str2));
		
		String str3 = new String("abc");//<<주소값
		String str4 = new String("abc");
		
		System.out.println(str3 == str4);// 문자를 가지가 있는 주소 비교
		System.out.println(str3.equals(str2));//equals메소드가 오버라이드가 되어있다고 예측 가능하다.
		//문자열만 리터널 먼저 로드 된다.
		
		
		
		
	}

}

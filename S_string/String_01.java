package S_string;

public class String_01 {

	public static void main(String[] args) {
		// 주어진 문자열(s)을 갖는 String인스턴스를 생성한다.
		String s = new String("Hello");
		System.out.println(s);

		// 지정된 위치(index)에 있는 문자열을 알려준다
		String s1 = "Hello";
		char c = s.charAt(1);
		System.out.println(c);

		// 문자열(str)과 사전순서를 비교한다.
		// 같으면 0을 사전순으로 이전이면 음수를, 이후면 양수를 반환한다.
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("aaA");
		System.out.println(i);
		System.out.println(i2);

		// 문자열(str)을 뒤에 덧붙인다.
		String s2 = "Hello";
		String s3 = s.concat(" Oracle");
		System.out.println(s2 + s3);

		// (contains)지정된 문자열(s4)이 포함되었는지 검사한다.
		String s4 = "JavaSoEz";
		boolean b = s4.contains("S");
		System.out.println(b);

		// 지정된 문자열(suffix)로 끝나는지 검사한다.
		String s5 = "JavaSoEz,java";
		boolean b1 = s5.endsWith("java");
		System.out.println(s5 + "\t" + b1);

		// 매개변수로 받은 문자열(obj)과 String인스턴스 의 문자열을 비교한다.
		// obj가 String이 아니거나 문자열이 다르면 false를 반환한다.
		String s6 = "ava";
		boolean b2 = s6.equals("java");
		System.out.println(b2);

		// 주어진 문자(ch)가 문자열에 존재하는지 확인하여
		// 위치(index)를 알려준다. 못 찾으면 -1을 반환한다.
		String s7 = "Hello";
		int b3 = s7.indexOf('1');
		System.out.println(b3);

		// 문자열의 길이를 알려준다.
		String s8 = "샤뢀라라라라라";
		int b4 = s8.length();
		System.out.println(b4);

		// 문자열 중의 문자열(old)을 새로운 문자열(new)로 모두 바꾼
		// 문자열을 반환한다.
		String s9 = "Hello Oracle";
		String b5 = s9.replace("Oracle", "Java");
		System.out.println(b5);
		// 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다.
		String s10 = "dog-cat-snake";
		String[] sArr = s10.split("-");
		System.out.println(sArr);
		// 주어진 시작위치(begin)부터 끝 위치(end)범위에 포함된 문자열을 더는다. 이 때,
		// 시작위치듸 문자는 범위에 포함되지만, 끝 위치의 문자는 포함되지 않는다.
		String s11 = "I Love Java";
		String b11 = s11.substring(2, 6);
		System.out.println(b11);
		// String인스턴스에 저장되어 있는 모든 문자열을 소문자로 변환하여 반환한다.
		String s12 = "I Love Java";
		String b12 = s12.toLowerCase();
		System.out.println(b12);
		// String인스턴스에 저장되어 있는 모든 문자열을 대문자로 변환하여 반환한다.
		String s13 = "I Love Java";
		String b13 = s13.toUpperCase();
		System.out.println(b13);
		// 문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다.
		// 이 때 문자열 중간에 있는 공백은 제거되지 않는다.
		String s14 = "  My   Trim  ";
		String b14 = s14.trim();
		System.out.println(b14);
		// 지정된 값을 문자열로 변환하여 반환한다.
		// 참조변수의 경우, toString()을
		// 호출한 결과를 반환한다.(매개변수로 모든 타입이 올 수 있다.)
		String b15 = String.valueOf(true);
		System.out.println(b15);
		String c15 = String.valueOf(100);
		System.out.println(c15);
		String d15 = String.valueOf('a');
		System.out.println(d15);
	}

}

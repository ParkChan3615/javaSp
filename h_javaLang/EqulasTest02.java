package h_javaLang;

import java.io.Serializable;

public class EqulasTest02 {
	public static void main(String[] args) {

		Person p1 = new Person(9506181352315L);
		Person p2 = new Person(9506181352315L);

		System.out.println(p1 == p2);// false
		System.out.println(p1.equals(p2));// false 오버라이드를 통하여 재정의하여 true를 만들어준다.
		System.out.println(p1.toString());
		System.out.println(p1.hashCode());

	}

}

class Person implements Serializable {

	long rehNo;

	Person(long regNo) {
		this.rehNo = regNo;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof Person && obj != null) {
			result = this.rehNo == ((Person) obj).rehNo;
			return result;
		}
		return result;
	}

	@Override
	// Alt + Shift + Enter
	public String toString() {
		return "Person [rehNo=" + rehNo + "]";
	}

}
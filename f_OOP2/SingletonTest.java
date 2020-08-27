package f_OOP2;

public class SingletonTest   {
	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstence();
		Singleton s2 = Singleton.getInstence();

	}
}

class Singleton {

	private static Singleton s;

	private Singleton() {

	}

	static Singleton getInstence() {
		if (s == null) {

			s = new Singleton();

		}
		return s;
	}

}

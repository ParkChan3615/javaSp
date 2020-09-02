package f_OOP2;

public class AbsTest {
	public static void main(String[] args) {

	}

}

abstract class Unit {//상속을 받을수 없고 객체를 만들수 없다.
	int x;
	int y;

	abstract void move(int x, int y);

	void stop() {

	}
}

class Marine extends Unit {

	void stimPack() {

	}

	@Override
	void move(int x, int y) {
	}
}

class Tank extends Unit {

	void changMode() {

	}

	@Override
	void move(int x, int y) {

	}
}

class DropShip extends Unit {

	void load() {

	}

	@Override
	void move(int x, int y) {

	}
}
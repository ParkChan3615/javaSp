package y_project;

public class InterTest {
	public static void main(String[] args) {

	}

}

class Unit2 {
	int x;
	int y;
	int carrentHp;

}

class Fight extends Unit2 implements Fightable{

	@Override
	public void move(int x, int y) {
	
		
	}

	@Override
	public void attack(Unit2 u) {

		
	}
	
}


interface Fightable extends Movable,Attackable{
	
}

interface Movable {
	void move(int x, int y);
}

interface Attackable {
	void attack(Unit2 u);
}

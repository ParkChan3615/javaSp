package e_OOP;

public class Ex3_8 {
	public static void main(String[] args) {

	 ExTest01 mt = new ExTest01();
	 ExTest02 ms = new ExTest02(3);
	}
}

class ExTest01{
	
	int value;
}

class ExTest02{
	int value;
	ExTest02(int value){
		this.value = value;
	}
}
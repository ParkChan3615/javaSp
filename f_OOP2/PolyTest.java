package f_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		// 1.SmartTv 3대를 저장해주세요
		SmartTv stv1 = new SmartTv();
		SmartTv stv2 = new SmartTv();
		SmartTv stv3 = new SmartTv();
//		SmartTv[] st = new st[]{stv1,stv2,stv3}
		// 2.Afreeca 2대를 저장해주세요.
		AfreecaTv af1 = new AfreecaTv();
		AfreecaTv af2 = new AfreecaTv();
		AfreecaTv[] af = new AfreecaTv[2];
		// 3.DMBTv 2대를 저장해주세요.
		DMBTv db1 = new DMBTv();
		DMBTv db2 = new DMBTv();
		DMBTv[] db = new DMBTv[2];
	
		Tv[] t = new Tv[]{stv1, stv2, stv3,af1,af2,db1,db2};
		
		t[2] = (Tv)stv3;//up-casting
		Tv t2 = t[3];
		
		SmartTv st2 = (SmartTv)t2; //down-casting
		System.out.println(t2);
		
		SmartTv tt = (SmartTv)new Tv();
		//업케스팅 후 다운케스팅 하는것은 가능하지만 바로 다운케스팅이 불가능하다.
		
	
		
	}

}

class Tv {
	int volume;
	String color;

	void changeColor(String color) {
		this.color = color;
	}
}

class SmartTv extends Tv {
	void internet() {

	}
}

class AfreecaTv extends Tv {
	void starballoon() {

	}
}

class DMBTv extends Tv {
	void antena() {

	}
}
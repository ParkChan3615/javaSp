package f_OOP2;

public class OverTest {

	public static void main(String[] args) {

		OverGo overgo = new OverGo();
		String oc= overgo.overMethod();
		System.out.println(oc);
		System.out.println(overgo.value);
		
		int s2 = overgo.getOverUpValue();
		System.out.println(s2);
	
		
		
	}

}

class OverUp {
    static int value= 10;

	String overMethod() {
		return "OverUP Method";
	}
}

class OverGo extends OverUp {
	
	int value = 20;

	@Override
	String overMethod(){
		
		return "OverUP Method";
	}
	
	int getOverUpValue(){
		return super.value;
	}
	
	
	String overMethod(int k){
		return k+"OverGo Method";
	}
	
	

}

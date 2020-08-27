package sp_exam;

public class Ex3_5 {

	public static void main(String[] args) {
		
		// 클래스메서드 임으로 '클래스명.메서드명()'으로 호출
		Ex.classMethod(5);
		Ex e = new Ex();
		//인스턴스메서드를 호출하기 위해 인스턴스 생성하시오    
		int re = e.instanceMethod(5,7);
		System.out.println(re);

	}

}

class Ex{
	

	static void classMethod(int a){
		System.out.println("입력된 값은 " +a+"이다.");
	}

int instanceMethod(int a, int b){
	int result = a * b;
	return result;
}
}

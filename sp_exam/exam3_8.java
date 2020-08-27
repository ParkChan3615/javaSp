package sp_exam;

public class exam3_8 {

	public static void main(String[] args) {
	int a23 =MyAdd.add(2);//3번의 add메서드 호
	System.out.println(a23);
	MyAdd ma = new MyAdd();
	int a2 = ma.add(2, 3);//4번의 add 메서드 호출
	long a3 = ma.add(3, 4L);//5번의 add 메서드 호출
	float a4 = ma.add(3.2f, 'c');//6번의 add 메서드 호출

	}

}

class MyAdd{
    //1. 클래스변수 a를 선언하고 20의 값으로 초기화 하여라.

	
	static int a = 20 ;
	//2. 인스턴스변수 b를 선언하고 15의 값으로 초기화 하여라.

	int b = 15;
	//3. int타입의 매개변수가 하나이며 변수 a의 합을 반환하는 클래스메서드를 add를 작성 하여라
	static int add(int a){
		
		return a+a;
	}
	//4. int타입의 매개변수가 두개이고 매개변수의 합을 반환하는 인스턴스메서드를 add를하여라
	
	 int add(int a, int b){
		 
		return a +b;
	}
	//5. int타입, long타입 각 한 개의 매개변수, 매개변수의 합을 반환하는 인스턴스

	 long add (int a, long b){
		 return a+b;
	 }
	//6 char타입, float타입 각 한 개의 매개변수, 매개변수의 합을 반환하는 인스턴스

	 float add (float a, char b){
		 return a + b;
	 }
	 //추가1. 인스턴스 메서드 add, 매개변수 long 타입 하나와 int 타입 하나이며
	 //매개 변수의 합을 반환하는 메서드
	 long add(long a, int b){
		 return a + b;
	 }
	 
	 //추가2. 인스턴스 메서드 add, 매개변수가 int 타입 두개이며 두개의 합을 반환하는 메서드
	 //단 .반환 타입이 long타입이어야한다.
//	 	long add(int a, int b){
//		 long result = a + b;
//		 return (long)(result);
//	 }
	 
	 
	 
}
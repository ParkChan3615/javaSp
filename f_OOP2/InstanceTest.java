package f_OOP2;

public class InstanceTest {

	public static void main(String[] args) {

		Object fc = new FireCar();

		if (fc instanceof FireCar) {
			System.out.println("fcFireCar 인스턴스이다.");
			FireCar ff = (FireCar) fc;
		}

		if (fc instanceof Car) {
			System.out.println("fc는Car 인스턴스이다.");
			Car cc = (Car) fc;
		}

		if (fc instanceof Object) {
			System.out.println("fc는 Object 인스턴스이다.");
			Object oj = fc;
		}

		Car c = new Car();
		if (c instanceof FireCar) {
			System.out.println("c는 FireCar의 인스턴스이다.");
			FireCar ff = (FireCar) c;

		}
		
		Car cc = new FireCar();
		System.out.println(cc.a);
		System.out.println(cc.b);
		cc.method();
		cc.method2();
		//인스턴스 매서드만 객체 타입의 영향을 받는다.
		
	}

}

class Car {
	static int a = 20;
	int b = 30;
	
	static void method(){
		System.out.println("Car 클래스 메서드");
	}
	
	 void method2(){
		System.out.println("Car 인스턴스 메서드");
	}
}

class FireCar extends Car {
	static int a = 40;
	int b = 50;
	
	static void method(){
		System.out.println(" FireCar 클래스 메서드");
	}
	@Override
	 void method2(){
		System.out.println(" FireCar 인스턴스 메서드");
	}
}

class Ambulance extends Car {
	static int a = 20;
	int b = 30;
	
	static void method(){
		System.out.println("Ambulance 클래스 메서드");
	}
	
	 void method2(){
		System.out.println("Ambulance 인스턴스 메서드");
	}
}
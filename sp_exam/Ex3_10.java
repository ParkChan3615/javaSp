package sp_exam;

public class Ex3_10 {

	public static void main(String[] args) {

		Car car = new Car();
		System.out.println();
		
		Car c2 = new Car("빨간색","수동",24);
		System.out.println("차의 색깔은: "+c2.color+"\n문의 갯수는: "+c2.door+"\n기어의 종류는: "+c2.geartype);
		
		Car c3 = new Car("정렬한 빨간색");
		System.out.println(c3.door+c3.color + c3.geartype);
	}

}

class Car {
	String color;
	String geartype; 
	int door;
	
	Car(){
		color = "black";
		geartype = "Stick";
		door = 4;
	}
	Car(String color, String geartype , int door){
		
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	
	Car(String color){
		this();
		this.color = color;
		
	}

}

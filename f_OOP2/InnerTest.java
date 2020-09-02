package f_OOP2;

public class InnerTest {
	public static void main(String[] args) {
		Outer.Inner out = new Outer().new Inner();
		out.method2(50);
		
	
	}
}

	class Outer {
		int value =10;
		class Inner {
			int value =20;
			
			void method2(int value){
				System.out.println(value);
				System.out.println(this.value);
				System.out.println(Outer.this.value);
			}
		}
	
	void metod(){
		class Inner3{
			
		}
	}
}

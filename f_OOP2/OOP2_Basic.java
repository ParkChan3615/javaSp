package f_OOP2;

public class OOP2_Basic {

	public static void main(String[] args) {

		/*
		1. 상속 (~은 ~이다.) is a
		  - 기존의 클래스를 재사용하여 새로운 클래스를 만든다.
		  - 적은양의 코드로 새로운 클래스를 작성할수 있다.
		  - 새로작성하고하자 하는 클래스의 위에 상속 받고자 하느 클래스를 키워드 extends와 함께
		        써주기만 하면 된다.
		  
		  class Child extends Parent {
		  
		  }
		  - 상속을 해주는 클래스를 '조상 클래스', 상속을받는 클래스를 '자손클래스' 부른다.
		  :조상 클래스 - 상위 클래스 ,부모클래스 , 기반클래스
		  :자손 클래스 - 하위 클래스 ,자식 클래스, 파생된 클래스
		  
		  - 상속을 받을때는 맴버만 상속받는다.
		  - 항상 자손클래스가 부모클래스보다 같거나 크다.
		  
		 2. 포함( ~은 ~을 포함하고 있다.) has a
		 - 상속 이외에 클래스를 재사용하는 방법
		 - 클래스의 맴버변수로 다른클래스를 선언하는 방법
		 
		 3. toString()
		 - 인스턴스의 정보를 제공할 목적으로 사용된다.
		 - 참조변수를 출력하면, 참조변수가 가르키고 있는 인스턴스의 toString() 메서드를 호출한다.
		 -
		 
		 4. 단일 상속
		 - 자바에서는 단일상속(두개이상불가)만 가능하다.
		 - class TVCR extends Tv, VCR{
		 허용하지않음
		 
		 - Tv와 VCR에 동일한 메서드가 존재 한다면 어떤 메서드를 상속받는지 알 수 없다.
		 - Tv의 메서드 명을 변경한다면 그 동안 사용해온 모든 곳을 수 정해주어야 한다.
		 - 클래스간의 관계가 명확해진다.
		 
		 5. Object클래스 (모든 클래스의 최상위 클래스이다.)
		 - 다른 클래스를 상속받지 않는 클래스 Object 클래스를 상속받는다.
		   class A extends Object<<이것이 숨어있다.{
		   
		   }
		 - 모든 클래스는 Object 클래스를 상속받게 되어있다.
		 - toString()나 equals()를 사용할수 있는 것은 Object클래스의 메서드
		      이기 때문이다.
		 
		 6.오바라이딩(overriding) 선언부 ( 구현부만 바꾸는것 )
		 -  조상 클래스로 부터 상속받은 메서드의 내용을 재정의 하는 것.
		 -  오버라이딩이 되기 위한 조건 (선언부가 동일)
		 	: 메서드의 명이 동일해야한다.
		 	: 매개변수의 갯수와 타입이 같아야한다.
		 	: 반합타입이 같아야한다.
		 
		 - 부모클래스로부터 상속받는 자손클래스의
		    : 접근 제어자는 부모보다 좁은 범위로 설정할 수 없다.
		    : 예외의 갯수는 조상클래스의 메서드보다 많이 선언할 수 없다.
		    	
		 제어자 void method()<<선언부  예외처리{<구현부 시작
		 
		 }<구현부 끝
		 
		 
		 7. super.
		 - 조상클래스의 맴버와 자손클래스의 맴버의 명칭이 중복정의되어 있을떄 구분할 목적으로 사용된다.
		 - 조상의 맴버와 자손의 맴버를 구분한다는 점을 제외하고는 this. 동일히다.
		 - 
		 
		 8. super()
		 - 조상클래스의 생성자를 의미한다.
		 - this()와 마찬가지로 super()도 생성자 호출이다.
		 - this()는 같은클래스 내의 생성자에서  다른 생성자를 호출할떄 사용된다.
		   super()는 자손클래스의 생성자내에서 부모클래스의 생성자를 호출할때 사용
		   
		   
		 9.제어자 
		 - 변수, 메서드 그리고 클래스의 선언부에 사용이된다.
		 - 접근제어자와 그외 제어자로 나누어진다
		 - 접근 제어자
		   :public, protected, default, private
		 	한개만 가능하고.
		 - 그외제어자
		   : static, final abstract, native,......
			여러게 사용이가능하다.
		 - 일반적으로 접근제어자를 가장 왼쪽에 써준다.
		 	public static final int a;
		 
		 - static (클래스의, 공통적인)
		   : 변수, 메서드, 초기화 블럭에 사용할 수 있다.
		   : 변수나 메서드에  사용시
		    1) 모든 인스턴스에서 공통적으로 사용
		    2) 인스턴스의 생성없이 사용할수 있다.
		    3) 클래스가 Method area로드 될때 같이 생성된다.
		    4) 클래스 맴버에서는 인스턴스맴버를 호출할 수 없다.
		    
		 - final (마지막의, 변경될수 없는)
		   : 변수에 사용시 값을 변경할수 없는 상수가 된다.
		   : 메서드에 사용시 오버라이드 할수 없는 메서드가 된다.
		   : 클래스에 사용시 상속할 수 없는 클래스가 된다. (부모클래스 x)
		   
		 - abstract(추상의, 미완성의)
		   : 메서드와 클래스에만 사용이 가능하다.
		   : 메서드는 선언부와 구현부로 되어있지만 추상메서드는 구현부가 미완성인것
		   : 추상메서드를 가지고 있다면 해당 클래스는 추상클래스가 되어야한다.
		   
		  abstract class A{
		   	    abstract void method();
		   }
		   
		   10. 접근제어자 
		   
		  	- public 
		  	:같은 프로젝트 내에서 접근이가능하다.
		  	: 접근제한이 없다.
		  	
		  	- protected
		  	: 같은 패키지 + 다른패키지에 있는 클래스의 자손클래스
		  	: 클래스에는 붙을수 없다.
		  	
		  	- default 
		  	: 같은 패키지 내에서는 접근이 가능하다.
		  	
		  	- private
		  	: 클래스 내에서만 사용이 가능하다.
		  	: 클래스에는 붙을수 없다.
		   
		    11. 캡슐화
		    - 접근제어자를 사용하는 이유
		      : 외부로 부터 데이터를 보호하기 위해서
		      : 외부에는 불필요한 부분을 감출수 있다.
		      
		    12. 생성자의 접근제어자
		    - 인스턴스의 생성을 제한할 수 있다.
		    - 생성자의 접근제아지를 private으로 할 경우 
		      : 외부에서는 생성자에 접근할수 없으므로 인스턴스를 생성할 수 없다.
		      : 다른클래스의 조상이 될수 없다.
		      : 다른클래스의 조상이 될수 없으므로  final 붙여 주어야한다.
		      
		      
		    13. 다형성(Polymorphism)
		     - 많은 형태를 가질수 있는 성질 
		     - 부모타입의 참조변수로 자식타입의 참조변수를 참조할수 있다.
		     
		     
		    14. 참조변수의 형변환
		     - 상속관계에서만 가능하다.
		     - 자식타입 >> 부모타입 : up-cating (캐스트연산자 생락 가능)
		     - 부모타입 >> 자식타입 : down-cating(캐스트연산자 생략 불가)
		     
		    15. instanceof 연산자 
		     - 참조변수가 참조하고 있는 인스턴스의 실제타입을 알아보기 위해 사용한다.
		     - 연산결과가 true이면 검사한 타입으로 형변환이 가능하다.
		     - 클래스맴버는 참조변수의 타입에 영향을 받는다.
		     - 참조변수의 타입에 영향을 받지 않는 것은 인스턴스 메서드 뿐이다.
		     
		    16. 매개변수의 다형성
		     - 참조변수의 다형적인 특징은 매개변수에도 적용된다.
		     
		    17. 여러객체배열 ,Vector
		     - 배열은 한번 크기를 정하면 변경할수 없다. 이를 해결하기위해 만들어졌다.
		     - Vector 동적으로 크기가 관리되는 객체배열이다.
		       : Vector() >> 10개의 객체를 보관할 수 있는 Vector객체를 만든다.
		       : add() >> Vector에 객체를 추가한다.
		       : remove() >> Vector에서 객체를 삭제한다.
		       : isEmpty() >> Vector가 비어있는지 확인한다.
		       : get(int index) >> index번째 객체를 가져온다.
		       : size() >> 저장된 객체의 수를 반환한다.
		       
		       
		    18. 추상클래스 (abstract)
		     - 미완성된 클래스
		       : 미완성된 메서드를 포함하고 있다.
		     - 추상메서드
		       : 미완성된 메서드 이다.
		       : 메서드는 선언부와 구현부로 이루어져 있지만 추상메서드는 구현부가 없다.
		       
		     - 어떤 기능을 수행할 목적으로 만든것인지??
		     
		     19. 인터페이스(interface)
		     - 일종의 추상클래스이지만 맴버변수로 상수와 추상메서드만 가진다.
		     - 장성방법
		     	interface 인터페이스명{
		     		public static finael 변수타입 변수명 = 값;
		     		public abstract 반환타입 메서드명(매개변수);
		     		
		     		
		     	}
		     - 모든변수는 public static final 이어야 한다. 생략가능
		     - 모든메서드는 public abstract 이어야 한다. 생략가능
		     
		     - 인터페이스의 상속 
		       : 인터페이스는 클래스를 상속할수 없다.
		       => 클래스를 상속받으면 인터페이스가 아니게 된다.
		       : 인터페이스는 인터페이스를 다중상속할수 있다.
		       
		     - 인터페이스의 구현
		       : 자체로는 객체를 생성할 수 없다.
		       : 자신이 정의된 추상 메서드 몸통을 만들어주는 클래스가 존재해야 한다.
		       : 상속 = extends, 구현 => implements
		       : 인터페이스의 이부분만 구현하였다면 해당 클래스는 추상클래스가 된다.
		       : ~을 할 수 있는 (~able)
		       : IMember => IMemberImp1 (구현체) 
		       
		     - 인터페이스의 장점
		       : 개발시간을 단축 시킬수 있다.
		       : 표준화가 가능하다.
		       : 서로 관계가 없는 클래스들에게 관계를 설정해 줄수 있다.
		       : 독립적인 프로그래밍이 가능하다.
		       
		     - 인터페이스의 이해
		       : 클래스를 사용한 쪽(user)과 제공하는 쪽(provier)로 나눈다.
		       : 메서드를 사용하는 쪽에서는 선언부만 알면 된다.
		       	A - I - B(직접관계 -> 간접관계)
		       	
		     
		     
		     
		     
		      
		     
		       
		       
		       
		     
		    
		  
		  
		 */

	}

}

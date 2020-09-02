package h_javaLang;

public class JavaLongBasic {
	public static void main(String[] args) {
		
		
		/*
		 1.java.long패키지
		 - JAVA프로그래밍이 기본적으로 필요한 클래스들을 모아놓은 패키지이다.
		 - String,Object,System....
		 
		 2.Object
		 - Object클래스는 맴버변수없이 11개의 메서드로 되어있다.
		 - equlas()
		   : 참조변수가 가르키는 주소를 비교한다.
		   : 주소가 아닌 해당 인스턴스가 가지고있는 값을 비교하게 하려면
		   	equlas()를 오버라이드 해야한다.
		   : equlas() 가 오버라이드 되어있는 클래스를 
		   	->String, File, Date...
		   	
		   	
		 - hashCode() - 10진수로 이루어져 있다.
		   : 객체의 주소에서 해시코드를 만들어 반환한다.
		   : String 클래스는 같은 문자열을 가지고 있다면 동일한 해시코드를
		          반환하게 만들어져 있다.
		 - toString()
		   : Ovejcet의 toSting()
		   	-> return getClass().getName()+"@"+Interger.toHexString(hashCode());
		   : toString() 오버라이드 되어있는 클래스들
		    ->String....
		    
		 - getClass()
		   : 클래스의 정보를 얻어올때 사용한다.
		   (1) 생성된 객채로부터 얻는 방법
		    Class obj = new Person().getClass();
		   (2) 클래스 리터럴로 부터 얻는방법
		    Class obj = Person.class;
		   (3) 클래스명으로 부터 얻는 방법
		   	Class obj Class.forName("Parson"); // Class NotFound exception 발생 위험 있다.
		   	
		 3.String
		   - 다른언어에서는 문자열을 char[]형 배열로 다룬다. 하지만 java에서는 문자열을
		          다를수 있는 String클래스를 제공한다.
		   - 문자열을 합칠때는 합쳐진 문자열을 저장할 인스턴스 생성된다.
		   - 문자열의 비교
		     : 문자열 리터럴을 만든느 방법과, 객체의 생성자를 이용할 수 있다.
		   - 인코딩 변환
		     : 이클립스에서는 기본 인코딩 방식은 "MS949"
		     : 한글 윈도우의 기본 인코딩 방식은 "CP949"
		     : 우리가 사용하는 인코딩 방식은 "UTF-8"
		   - 문자열 format
		     : 기본형타입을 String 타입으로 변환
		      1) 긴문자열을 더하는 방식
		      	int a =10;
		      	String b = a+ "";
		      2) valueOf메서드
		      	String b= String.valueOf(a);
		      	
		     : String 타입을 기본형으로 변환
		      1)wrapper클래스를 이용하는 방식
		      Sting b= "123";
		      int c = Integer.parseInt(b);
		      int c = Integer.valueOf(b);
		      
		      2) wrapper 클래스의 진수
		      String b = "234";
		      int c Integer.parseInt(b,8);
		     
		     
		      
		 4.StringBuffer, stringBuilder
		  - 문자열을 합치기 위해서 사용한다.
		  
		 5.wrapper클래스
		  - 자바는 모든것을 객체로 다루어야 한다.
		  기본형     | wrapper클래스
		 boolean| Boolean
		 char   | Character*** 
		 byte   | Byte
		 int    | Short
		 shot   | Integer***
		 long   | Long
		 float  | Flaot
		 double | Double
		 
		 -기본형 타입-> wrapper클래스 :auto_boxing
		 wrapper클래스-> 기본형 타입 :un-boxing
		 
		 
		 6.정규식
		 7.컬랙션 프래임워크
		 */
		
	}
	 
	 
}

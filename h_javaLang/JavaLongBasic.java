package h_javaLang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		 - 텍스트 데이터에서 원하는 형태의 문장을 찾기 위해 만들어 졌다.
		 - 정규식 순서
		   : 패턴정의 
		     ->Parrern클래스를 이용하여 패턴을 정의한다.
		     Pattern p = Pattern.compile("[a-z]");
		     
		     :텍스트와 비교
		     -> Matcher클래스를 이용하여 패턴과 텍스트를 비교한다.
		     Matcher m = p.matcher("text");
		     
		     m.matches();
		     
		  - 정규식 문법
		   ^ : 문자열의 시작
		   $ : 문자열의 끝 
		   . : 임의의 한문자 ,\는 포함되지않는다.
		   * : 0개 또는 무한정 있을수 있다.
		   + : 한개 이상 있을수 있다.
		   ? : 0개 또는 1개 있을수 있다.
		   (): 문자열을 하나의 문자로 인지한다.
		   {}: 반복횟수 지정한다. {3,5} 3번 4번 5번 반복 {4.} 4번 ~ 무한 반복
		   []: 범위지정할때 사용한다. [abc] a b c 중에 하나
		   | : OR연산을 수행할때 사용 
		   \s: 공백문자 
		   \S: 공백을 제외한 모든문자.
		   \w: 영어 대문자 또는 소문자 또는 숫자.
		   \W: 영어 대문자 또는 소문자 또는 숫자 를 제외한 모든문자
		   \d: 0~9 숫자
		 
		 7.컬랙션 프래임워크
		 */
		
		
//		
//		Pattern p = Pattern.compile("[a-z]*");
//		Matcher m = p.matcher("dfasdasfadsf");
//		System.out.println(m.matches());
//		if (m.matches()==true){
//			System.out.println("소문자입니다.");
//			
			
//		String reg = "[a-z]*{2,3}";
//		System.out.println(Pattern.matches(reg, "ssss"));
		
		
		//1텍스트가 영문자가 3회 반복되고 이후에 숫자가 하나이상으로 구성
		Pattern ms = Pattern.compile("[a-zA-Z]{3}\\d+");
		Matcher ms2 =ms.matcher("dfD355666");
		System.out.println(ms2.matches());
		//2. 텍스트가 핸드폰 번호 형태인 '숫자 3개- 숫자4개 -
		String str1 ="[A-Za-z]{3}\\d+";
		System.out.println(Pattern.matches(str1,"ASd123"));
		Pattern p2 = Pattern.compile("\\d{3}-\\d{4}-\\d{4}");
		Matcher ms3 = p2.matcher("010-5316-5120");
		System.out.println(ms3.matches());
		
		//3. 텍스트가 핸드폰 번호로 구성
		//01 다음 0,1,7,8,9- 0을 제외한 숫자,숫자3개 -숫자4개
		Pattern p3 = Pattern.compile("^01[0-17-9]-[1-9]\\d{3}-\\d{4}");
		Matcher ms4 = p3.matcher("010-5316-5120");
		System.out.println(ms4.matches());
		
		//4.텍스타가 주민번호로 구성
		Pattern p4 = Pattern.compile("\\d{2}([0][0-9]|[1][0-2])([0]|[1-9]|[1-2][0-9]|[3][0-1])-[1-4]\\d{6}");
		Matcher ms5 = p4.matcher("950618-1352315");
		System.out.println(ms5.matches());
		
		//5 텍스트가 이메일로 구성
		//시작은 영문자 이어야 하고 특수 기호는 -,_,\,. 4가지가 포함될 수 있다.
		//@이후 영문자가 1개 7개가 포함될수 있다
		//.이후 영문자가 2~3개가 포함되어야한다.
		//.kr 이 없을 수도 하나 존재할 수도 있다.
		Pattern p5 = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_(-)////(.)]*@\\w{1,}(.)\\w{3}(.kr)?");
		Matcher ms6 = p5.matcher("yco1234@naver.com.kr");
		System.out.println(ms6.matches());
		
		
		
		
		
		
		
		}
	}
	 
	 


package g_Excption;

public class Exception_01 {
	public static void main(String[] args) {
		
		/*
		 1. 프로그램 오류
		 	- 프래그림이 실행중에 어떤 이유로 인해 오작동을 하거나 비정상종료되는 경우
		 	- 컴파일 오류: 컴파일중에 발생하는 오류
		 	- 런타임 오류: 실행중에 발생하는 오류
		 	- 오류의 종류
		 	 : 에러 -> 프로그램 코드를 이용하여 수습될수 없는 심각한 오류
		 	 : 예외 -> 프로그램 코드를 이용하여 수습될수 있는 경미한 오류
		 	 
		 2. RuntimeException 그 외 Exception
		 	- 모든 예외의 최고조상은  Exception이다.
		 	- RuntimeException 주로 프로그래머의 실수에 의해서 발생하는 예외
		 	  : indexOutofBoundsException, nullPointException..
		 	- 그외 Exception들은 주로 외부의 영향에 의해서 발생하는 예외
		 	  : ClassNotFoundException(클래스를 찾을수 없어서), FileNotFoundException(파일을 찾을수 없어서)..
		 3. try(예외가 발생할수 있는 코드를 도전)
		    catch(예외가 발생하면 잡는다)
		    - 프로그램 실행시 발생할수 있는 예외에 대비한 코드를 작성하는 것.
		    - 작성방법
		      try{
		      	// 예외가 발생할수 있는 코드를 도전
		      }catch(Exception1 e){//하나씩 잡기때문에 선차적으로 catch를 한다.
		      // 예외가 발생하면 잡는 것
		      // 수행한 코드에서 Exception 이라는 예외가 발생했을때 처리할 문장
		       }
		       catch(Exception2 e){
		      // 예외가 발생하면 잡는 것
		      // 수행한 코드에서 Exception 이라는 예외가 발생했을때 처리할 문장
		       }
		       catch(Exception3 e){
		      // 예외가 발생하면 잡는 것
		      // 수행한 코드에서 Exception 이라는 예외가 발생했을때 처리할 문장
		       }
		      
		     - 발생한 종류의 예외와 일치하는 하나의 catch만 수행된다.
		     
		     4. 예외발생시키기
		     - 연산자 new를 이용하여 발생시키고자 하는 예외의 객체를 만든다.
		     Exception e1 = new Exception();
		     - 예약어 throw를 이용하여 예외를 발생시킨다.
		     throw e1;
		     
		     throw new Exception();
		     
		     5. 예외던지기 ( throws )
		     - 메서드에 예외 선언하기
		       : 메서드의 선언부 마지막에 예약어 throws와 함께 예외종류를 적어주기만 하면 된다.
		       : 에외의 처리는 해당 매서드를 호출한 쪽에서 처리하면 된다.
		       
		     6.finally
		     - try -catch 블럭에 상관 없이 수행되어야할 코드를 포함한다.
		     - 작성방법
		     	try{
		      	// 예외가 발생할수 있는 코드를 도전
		      }catch(Exception1 e){//하나씩 잡기때문에 선차적으로 catch를 한다.
		      // 예외가 발생하면 잡는 것
		      // 수행한 코드에서 Exception 이라는 예외가 발생했을때 처리할 문장
		       }
		       catch(Exception2 e){
		      // 예외가 발생하면 잡는 것
		      // 수행한 코드에서 Exception 이라는 예외가 발생했을때 처리할 문장
		       }finally{
		       
		       //예외발생에 상관없이 수행되어야할 코드
		       }
		 */
		
	}

}

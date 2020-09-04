package i_collection;

public class Collection_01 {
	public static void main(String[] args) {
		
		/*
		 1.collection framework
		 - Collection
		   : 데이터 그룹
		  
		 - Framework
		   : 일을 하기 위한 틀 
		   : 표준화가 가능하다.
		   
		 2. 핵심 interface
		 - List
		   : 순서가 있다.
		   : 데이터의 중복을 허용한다.
		   : 구현체 : ArrayList, Vector, Strak LinkedList..
		   : 대기표 명단 -실제사용 예
		   
		 - Set
		   : 순서가 없다.
		   : 데이터 중복이 허용되지 않는다.
		   : 구현체의 종류는 Hashset,TreeSet...
		   : TreeSet - 데이터 검색
		   : 정수의 집합 실제사용하는 
		   
		 - Map
		   : 순서가 없다.
		   : 키는 값으로 이루어져 있다.
		   : 키 중복은 허용하지 않고  값의 중복은 허용한다.
		   : HashTable, HashMap,TreeMap <<검색
		   : 우편번호, 지역번호 
		   
		 3. ArrayList
		 - 배열을 사용하였을때 길이를 한번 정하면 변경이 불가한 단점을 보안하기 위해  만들어짐
		 - 메서드틀
		   : add()    -> 객체를 추가한다.
		   : remove() -> 객체를 제거한다.
		   : get(int index)    -> index번째 겍체를 얻어온다.
		   : set(int index, Object obj )-> index 번째 객체를 교체한다.
		   
		 4. LinkedList
		 - 자신의 데이터와 다음 데이터의 주소를 가지고 있다,
		 - 이전 요소를 찾을수가 없다.
		 
		 5. DoubleLinkedList
		 - 자신의 데이터와 이전 데이터의 주소, 다음 데이터의 주소를 가지고 있다.
		 
		 6. Stack
		 - First In Last Out : FIFO
		 - push() : 객체추가
		 - pop() :추출
		 - search() :원하는 객체를 찾는다.
		 - peak() : 가장위의 객체를 가져온다.
		 
		 7. Queue
		 - First In First Out : FIFO
		 - offer() :추가
		 - poll()  :추출
		 
		 8.HashSet
		   - 새로운 요소를 추가하기 위해 add, addAll메서드를 사용할때 중복추가될때는 실패하게 된다.
		   
		 9.Map<Object,obj> - HashMap
		   - 키(key)와 값으로 이루어져 있다.
		   - 순서가 없기때문에 키는 중복을 비허용하고, 값은 중복을 허용한다.
		   - 키와 값이 type으로 Object형태이지만 일반적으로는 키의 경우는 String으로 많이 사용한다.
		   - method틀
		    : put(제네럴 타입 두개) :객체를 추가 
		 	: get(key) : 원하는 객체의 값을 가져온다.
		 	: remove(key) : 원하는 객체의 값을 삭제한다.
		 	
		   
		   
		   
		   
		   
		   로그인  
		 1.관리자 로그인
		 2.입주민 로그인
		 3.방문객 로그인
		 
	           회원가입 /로그인 
	          입주민 로그인			관리자 로그인					방문객 로그인
	     ----------------------------------------------------------    
	     1. 아이디			1. 관리자 아이디 				1. 이름 
	     2. 비밀번호			2. 관리자 비밀번호				2. 전화번호
	     4. 비밀번호 확인		3. 관리자 이름					3. 방문동/호수
	     5. 입주 대표자 이름		4. 관리 동 (어느동 관리자)		4. 차량번호
	     6. 동/호수 			5. 관리자 근무 (주간 , 야간)		
	     7. 관리자 코드 
		
		 우편함/택배
		 1.동    2.호수  3.우편 내용  4.수신자  5.발신자  6. 날짜
		 
		 
		 차량 등록 
		 1.동  2.호수  3.차량번호 
		 
		
		

	           관리자 - 동 주민 코드 발급 - 차량 등록 확인 - 방문차량 허가
	           입주민 - 차량등록  - 우편조회 - 택배조회  - 입주민 소통 
	 	 
	           		
		 
		 */
	}

}

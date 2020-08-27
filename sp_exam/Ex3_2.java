package sp_exam;

public class Ex3_2 {

	public static void main(String[] args) {
	
		
		TV t= new TV();
		
		t.channel = 7;
		t.channelDown();
		System.out.println("현제 채널은"+ t.channel);

	}

}

class TV {
	//문자열 타입 color를선언하세요.
	String color;
// boolean 타입 power를 선언하세요
	boolean power;
	// int 타입 channel를 선언하세요
	int channel;
	// power의 메서드를 생성한후 
	void power() {
		power = !power;
	}
	//channelUp 메소드를 생성한후 channel를 1씪증가 하세요
	void channelUp(){
		channel++;
		
	}
	//channelUp 메소드를 생성한후 channelDown를 1씩 감소 하세요
	void channelDown(){
		channel--;
	}

}

package f_OOP2;

public class ChildTest {

	public static void main(String[] args) {
	
		//1.자식객체
		Child cs = new Child();
		cs.volume= 10;
		cs.volumeUp();
		System.out.println(cs.volume);
		
		cs.Channel = 15;
		cs.channelUp();
		System.out.println(cs.Channel);
	}

}

class Parent{
	int Channel;
	void channelUp(){
		Channel++;
	};
}

class Child extends Parent{
	int volume;
	int Channel;
	void volumeUp(){
		volume++;
	}
}

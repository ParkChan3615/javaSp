package f_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInner {
	public static void main(String[] args) {
		Button bt1 = new Button();
		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

			}
		});
	}
}

// 인터페이스 타입의 참조변수로 그를 구현한 구현체의 참조할수 있다.
// class EventHandler implements ActionListener{
//
// @Override
// public void actionPerformed(ActionEvent arg0) {
// System.out.println("버튼눌림");
//
// }
//
//
// }
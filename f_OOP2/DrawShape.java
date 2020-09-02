package f_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame {
	public static void main(String[] args) {

		DrawShape ds = new DrawShape();

	}

	DrawShape() {

		super("Title"); // 내 부모에 있는 생성자 호출 , 타이틀 생성
		setSize(500, 500);
		setBackground(Color.MAGENTA);
		setVisible(true);
		setResizable(false);

	}

	@Override
	public void paint(Graphics g) {
		// 1. 매개변수가 두개인 생성자를 이용하여 Circle 객체를 만들어주세요
		Point cp = new Point(300, 300);
		Circle cc = new Circle(150, cp);

		// 2. g.drawOval() 원을 그려주세요
		g.drawOval(cc.center.x, cc.center.y, cc.r, cc.r);

		// 3. 매개변수가 하나인 생성자를 이용하여 Triangle 객체를 만들어주세요
		// 100,100 200,200 200,100

		Point[] sp = { new Point(100, 100), new Point(200, 200),
				new Point(200, 100) };
		Triangle tp = new Triangle(sp);

		// 4. g.drawLine() 3개월 이용하여 삼각형을 그려주세요
		g.drawLine(tp.p[0].x, tp.p[0].y, tp.p[1].x, tp.p[1].y);
		g.drawLine(tp.p[1].x, tp.p[1].y, tp.p[2].x, tp.p[2].y);
		g.drawLine(tp.p[2].x, tp.p[2].y, tp.p[0].x, tp.p[0].y);

	}
}

/**
 * 점을 관리하기 위한 클래스
 * 
 * @author PC-NEW05
 * @since 2020.08.24
 */
class Point {

	int x; // 점의 x 좌표
	int y; // 점의 y 좌표

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle {
	// 1. 반지름(정수)을 저장할 수 있는 변수 r을 선언해주세요.
	int r;
	// 2. 점하나를 저장할 수 있는 변수 center를 선언해주세요
	Point center;

	// 3. 매개변수가 두 개인 생성자를 이용하여 r과 center를 초기화해 주세요
	Circle(int r, Point center) {
		this.r = r;
		this.center = center;
	}

	// 4. 기본 생성자를 만들어주세요. 단, 매개변수가 두 개인 생성자를 호출하여 좌표는 100, 100 반지름은 50으로 초기화해주세요
	Circle() {
		this(50, new Point(100, 100));
	}

}

class Triangle {
	// 1. 점 3개를 저장할 수 있는 변수 p를 선언해주세요
	Point[] p;

	// 2. 매개변수가 하나인 생성자를 만들어주세요
	Triangle(Point[] p) {
		this.p = p;
	}

	// 3. 매개변수가 3개인 생성자를 만들어주세요
	Triangle(Point a, Point b, Point c) {
		p = new Point[3];
		p[0] = a;
		p[1] = b;
		p[2] = c;
	}

}
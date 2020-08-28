package f_OOP2;

import java.util.Vector;

public class ProductTest {// 매장 일하는 곳
	public static void main(String[] args) {

		NoteBook nb = new NoteBook("Mac", 100);
		Styler sr = new Styler("LG-Styler", 200);
		Fridge fe = new Fridge("SAMSONG-Fridge", 300);

		Buyer b = new Buyer("이운주", 1000);
		b.buy(sr);
		b.summaty();
		

	}
}

class Product {
	// 제품이름
	String name;
	// 가격
	int price;
	// 보너스포인트
	int point;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
		point = price / 10;

	}

}

class NoteBook extends Product {

	public NoteBook(String name, int price) {
		super(name, price);

	}

	@Override
	// 알트시프트 ss 엔터
	public String toString() {
		return "Mac";
	}

}

class Styler extends Product {

	public Styler(String name, int price) {
		super(name, price);

	}

	@Override
	public String toString() {
		return "LG-Styler";
	}

}

class Fridge extends Product {

	public Fridge(String name, int price) {
		super(name, price);

	}

	@Override
	public String toString() {
		return "SAMSONG-Fridge";
	}

}

class Buyer {

	String name;
	int money;
	int mileage;
	int total = 0;

	Vector item = new Vector();// 기본적으로 10개르 담을수 있는 공간 생성

	public Buyer(String name, int money) {
		this.name = name;
		this.money = money;

	}

	void buy(Product nb) {

		if (money < nb.price) {
			System.out.println("돈가져와");
			return;
		}

		money -= nb.price;
		mileage += nb.point;
		item.add(new Product(nb.name, nb.price));// 백터 (0)//짝수는 제품
		total += nb.price;

		System.out.println(name + "고객님" + nb + "를 구매해주셔서 감사합니다.");

	}

	String summaty() {
		System.out.println(item.size());
		System.out.println("영       수       증 ");
		System.out.println("|구매목록| " + "\t|가격|");

		int a = item.size();
		System.out.println(item.get(0));
		for (int i = 0; i < a / 2; i++) {
			System.out.println(item.get(0));
			
		}
		
		System.out.println("\n|총금액|:" + total + "만원");
		System.out.println(name + "고객님의 남은돈은 " + money + "이고마일리지는 " + mileage
				+ "입니다." + "오늘도 좋은 하루 보내싶시요 고객님!");
		return "as";
	}

	void refund(Product nb) {
		if(item.isEmpty()){
			System.out.println("물건을 산 적이 없습니다.");
		}
		else{
			item.remove(nb);

			money += nb.price;
			mileage -= nb.point;
			
			
			
		}
	}
}

// 1. summary
/*
 * 영 수 증
 * 
 * 구매목록 NoteBook 300만원 Styler 200만원 총합 500만원
 * 
 * xxx 고객님의 남은돈은 500만원이고 마일리지는 50만원 입니다. 오늘도 좋은하루 보내싶시요 고객님!
 */

// 2. refund
// 1.고려사항
/*
 * - 물건을 산 내역이 없을때 - 내가 산물건만 반품
 */

// 3. 물품의 수량을 관리

// 4. 고객의 목록을 관리해주세요.
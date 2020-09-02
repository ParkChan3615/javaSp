package f_OOP2;

import java.util.Vector;

public class ProductTest {// 매장 일하는 곳
	public static void main(String[] args) {

		NoteBook nb = new NoteBook("Mac\t", 100, 10);
		Styler sr = new Styler("LG-Styler", 200, 10);
		Fridge fe = new Fridge("SM-Fridge", 300, 10);

		Buyer b = new Buyer("박  찬", 1000);
		b.buy(sr, 1);
		b.summaty();
		b.refund(fe);
	

	}
}

class Product {
	// 제품이름
	String name;
	// 가격
	int price;
	// 보너스포인트
	int point;

	int x; // 제고

	public Product(String name, int price, int x) {
		this.name = name;
		this.price = price;
		this.x = x;
		point = price / 10;

	}

}

class NoteBook extends Product {

	public NoteBook(String name, int price, int x) {
		super(name, price, x);

	}

	@Override
	// 알트시프트 ss 엔터
	public String toString() {
		return "Mac";
	}

}

class Styler extends Product {

	public Styler(String name, int price, int x) {
		super(name, price, x);

	}

	@Override
	public String toString() {
		return "LG-Styler";
	}

}

class Fridge extends Product {

	public Fridge(String name, int price, int x) {
		super(name, price, x);

	}

	@Override
	public String toString() {
		return "SM-Fridge";
	}

}

class Buyer {

	String name;
	int money;
	int mileage;
	int total = 0;
	int x;

	Vector item = new Vector();// 기본적으로 10개르 담을수 있는 공간 생성

	public Buyer(String name, int money) {
		this.name = name;
		this.money = money;

	}

	void buy(Product nb, int x) {
		this.x = x;

		if (money < nb.price) {
			System.out.println("돈가져와");
			return;
		}

		money -= nb.price;
		mileage += nb.point;
		item.add(nb);// 백터 (0)//짝수는 제품
		total += nb.price;

		System.out.println(name + "고객님" + nb + "\t" + x + "개를 "
				+ "를 구매해주셔서 감사합니다.");

	}

	// 1. summary
	/*
	 * 영 수 증
	 * 
	 * 구매목록 NoteBook 300만원 Styler 200만원 총합 500만원
	 * 
	 * xxx 고객님의 남은돈은 500만원이고 마일리지는 50만원 입니다. 오늘도 좋은하루 보내싶시요 고객님!
	 */

	void summaty() {

		// // 써야될 변수를 타입
		// if (item.get(0) instanceof Product) {
		// Product f = (Product)item.get(0);
		// System.out.println(f.name);
		// System.out.println(f.price);
		// }
		//

		System.out.println("\t 영       수       증 ");
		System.out.println("|구매목록| " + "\t|가격|" + "\t|개수|");

		if (item.size() == 0) {
			System.out.println("구매하신 물건이 없습니다.");
			return;
		}

		int a = item.size();
		for (int i = 0; i < a; i++) {
			// 써야될 변수를 타입
			if (item.get(i) instanceof Product) {
				Product f = (Product) item.get(i);
				System.out.println(f.name + "\t" + f.price + "\t  " + x);

			}
		}

		System.out.println("\n|총금액|:" + total + "만원");
		System.out.println(name + "고객님의 남은돈은 " + money + "이고마일리지는 " + mileage
				+ "입니다." + "오늘도 좋은 하루 보내싶시요 고객님!");

	}

	// 2. refund
	// 1.고려사항
	/*
	 * - 물건을 산 내역이 없을때 - 내가 산물건만 반품
	 */

	void refund(Product p) {
		if (item.isEmpty()) {
			System.out.println("물건을 산 적이 없습니다.");
			return;
		} 
			else if (item.remove(p)) {

			total -= p.price;
			money += p.price;
			mileage -= p.point;
			System.out.println("\n 반품 후 영수증 출력 해드리겠습니다\n "+p+"를 반품하였습니다.");
			summaty();

		}
//		boolean result = false;
//		for (int i = 0; i < item.size(); i++) {
//			if(item.get(i) == p){
//				//반품
//				money += p.price;
//				mileage -= p.point;
//				Product p2 = (Product)item.remove(i);
//				System.out.println(p2+"반품 완료하였습니다.");
//				summaty();
//				result = true;
//				break;
//			}
//
//		}
//		
//		if(!result){
//			System.out.println(p+"를 구매하신적이 없습니다.");
//			
//		}

	}
}

// 3. 물품의 수량을 관리

// 4. 고객의 목록을 관리해주세요.
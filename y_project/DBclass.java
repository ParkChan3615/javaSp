package y_project;

import java.util.Vector;

public class DBclass {

	private Vector<ProductVO> proList = new Vector<>();// 물품들

	public boolean addProduct(String name, int price) {
	
	  ProductVO pv1 = new ProductVO(name, price);
	  boolean result =proList.add(pv1);
		return result;
	}

}

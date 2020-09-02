package y_project;

public class ProductVO {
	private String name;
	private int price;
	private int point;
	
	public ProductVO(String name, int price) {
		this.price = price;
		this.name = name;
		point = price / 10;
	}


}

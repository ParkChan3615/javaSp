package y_project;

public class Service {

	public boolean addProuct(String name, int price) {
		
		DBclass db = new DBclass();
		boolean result = db.addProduct(name , price);
		
		return result;
	}

}

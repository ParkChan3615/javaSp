package Pro;

import java.util.Map;

public class IServiceImpl implements IServise {
	
	private IDao dao = new IDaoimpl();
	

	@Override
	public String lonIn(Map<String, String> params) {
		String mem_id = dao.logIn(params);
		return mem_id;
		//오라클 덤프
	}
}

package Pro;

import java.util.Map;

public class IServiceImpl implements IServise {
	
	private IDao dao = new IDaoimpl();
	

	@Override
	public String lonIn(Map<String, String> params) {
	
		
		return dao.logIn(params);
		//오라클 덤프
	}


	@Override
	public String join(MemberVO mb) {
		
		return dao.join(mb);
	}


	@Override
	public String revise(Map<String, String> params) {
		// TODO Auto-generated method stub
		return dao.revise(params);
	}



}

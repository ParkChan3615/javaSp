package Pro;

import java.util.Map;

public interface IDao {

	String logIn(Map<String, String> params);

	String join(MemberVO mb);

	String revise(Map<String, String> params);



}

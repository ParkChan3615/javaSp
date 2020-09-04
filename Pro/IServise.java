package Pro;

import java.util.Map;

public interface IServise  {
	/**
	 *로그인을 위한 메서드
	 *@param params mem_id 사람의 아이디, mem_pass 비밀번호
	 *@return id와 pw가 일치하는 환영의 아이디, 일차하는 사람이 없으면 null
	 *@author PC-NEW06
	 *@since 2020.09.04
	 *@see
	 */
	String lonIn(Map<String, String> params);

}

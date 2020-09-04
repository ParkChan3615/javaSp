package i_collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,Integer> param = new HashMap<>();//Object,Object
		param.put("이현무", 50);//오토박싱
		param.put("김근호", 60);//오토박싱
		param.put("이경륜", 15);//오토박싱
		param.put("이운주", 20);//오토박싱
		//<C>put << inselt 겸 update 이다
		
		//<R>
		int ju = param.get("이운주");
		System.out.println(ju);
		System.out.println(param);
		//<D>
		System.out.println(param.remove("김근호"));
		System.out.println(param);//오토박싱
		
		
		Map<String, String> ma = new HashMap<>();
		
		ma.put("1","김은배");
		ma.put("mem_id","a001");
		ma.put("mem_pw","1234124");
		String name= ma.get("1");
		String id= ma.get("mem_id");
		String pw= ma.get("mem_pw");
		System.out.println(name+"id:"+id+"pw:"+pw);
		
		
		

		
	}

}

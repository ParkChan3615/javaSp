package h_javaLang;

public class StringBufferTest {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("a");
		long start = System.currentTimeMillis();
		for (int i = 0; i <30000000; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		/*
		 String str = "a";
		 str +="a";
		 String str = "a";
		 str = new StringBuffer(str),append("a").toString();
		 */
		
//		String str = "a";
//		long start = System.currentTimeMillis();
//		for (int i = 0; i <300000; i++) {
//			str+="a";
//		}
//		long end = System.currentTimeMillis();
//		System.out.println(end-start);
		
		
		
	}

}

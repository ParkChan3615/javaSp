package h_javaLang;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class FileIncodingTest {
	public static void main(String[] args) throws UnsupportedEncodingException {

		String str = "";
		byte[] cpStr = str.getBytes("CP949");
		byte[] cpStr1 = str.getBytes("MS949");
		byte[] cpStr2 = str.getBytes("UTF-8");
	
		
		System.out.println(Arrays.toString(cpStr));
		System.out.println(Arrays.toString(cpStr1));
		System.out.println(Arrays.toString(cpStr2));
	}

}

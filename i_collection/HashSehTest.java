package i_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;




public class HashSehTest {
	public static void main(String[] args) {
	Set<Integer> set = new HashSet<>();
	
	for (int i = 0; i < 10; i++) {
		int a = (int)(Math.random()*1000+1);
		boolean rs = set.add(a);
		System.out.println(rs);
	}
	System.out.println(set);
	
	//정렬하세요
	List<Integer> ss = new ArrayList<>(set); 
	Collections.sort(ss);
	System.out.println(ss);
	
	
		
		
		
		
	}
}

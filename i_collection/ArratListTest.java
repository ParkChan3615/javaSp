package i_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArratListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(new Integer(5));
		list.add(2);//오토박싱
		list.add(3);
		list.add(1);
		list.add(4);
		
		List<Integer> list2 = new ArrayList<>(list.subList(0, 4));
		//toString 이 오버라이드 되어있다.
		System.out.println(list);
		System.out.println(list2);
		//R
		int a = list.get(2); //언박싱
		System.out.println(a);
		
		//D
		list.remove(2);
		System.out.println(list);
		
		//u
		int change = new Integer(10);
		int after = list.set(1, change);
		list.set(1, change);
		System.out.println(list);
		
		
		Collections.sort(list);
		System.out.println(list);

		
	
	}

}


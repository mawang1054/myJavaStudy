package day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Demo12 {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer, String>();
		hm.put(1,"mawang");
		hm.put(2,"cc");
		hm.put(3, "sb");
		//setView(hm);
		
		Collection<String> c = new ArrayList<String>();
		c.add("sb");
		System.out.println(hm);
		hm.values().removeAll(c);
		System.out.println(hm);
	}

	public static void setView(HashMap<Integer, String> hm) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(3);
		System.out.println(hm);
		hm.keySet().removeAll(set);
		System.out.println(hm);
	}
}

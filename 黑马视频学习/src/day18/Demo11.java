package day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo11 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("mawang",23);
		hm.put("cc",22);
		hm.put("guobin", 25);
		hm.put("chaoge",26);
		
		Set<String> set = hm.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str + " = " + hm.get(str));
		}
	}
}

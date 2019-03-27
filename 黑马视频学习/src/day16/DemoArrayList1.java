package day16;

import java.util.ArrayList;
import java.util.ListIterator;

public class DemoArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("a");
		arrList.add("a");
		arrList.add("b");
		arrList.add("b");
		arrList.add("b");
		arrList.add("c");
		arrList.add("c");
		arrList.add("c");
		arrList.add("c");
		System.out.println(arrList);
		ArrayList<String> temp = new ArrayList<>();
		ListIterator<String> lit = arrList.listIterator();
		while(lit.hasNext()) {
			String str = lit.next();
			if(DemoArrayList1.isContain(str, temp)) {
				lit.remove();
			}
			else {
				temp.add(str);
			}
		}
		System.out.println(arrList);
	}
	
	public static boolean isContain(String str, ArrayList<String> arrList) {
		for (int i = 0; i < arrList.size(); ++i) {
			if (str.equals(arrList.get(i))) {
				return true;
			}	
		}
		return false;
	}
}
